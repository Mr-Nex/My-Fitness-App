package generator.nex.rexx.completefitness;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.rexx.completefitness.R;

import java.util.ArrayList;
import java.util.List;

public class Flexibility extends AppCompatActivity {

    private RecyclerView recyclerView;
    private OthersAdapter adapter;
    private List<Category> categoryList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flexibility);

        Intent inn = getIntent();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        categoryList = new ArrayList<>();
        adapter = new OthersAdapter(this, categoryList);

        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, 1);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.addItemDecoration(new Flexibility.GridSpacingItemDecoration(2, dpToPx(10), true));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

        prepareCategories();

        try {
            Glide.with(this).load(R.drawable.slide1).into((ImageView) findViewById(R.id.backdrop));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void prepareCategories(){
        int[] covers = new int[]{
                R.drawable.backextension,
                R.drawable.hamstringstretch,
                R.drawable.kneestochest,
                R.drawable.spinaltwistyogawheel,
                R.drawable.yogabackbendwheel
        };

        Category a = new Category("BACK EXTENSION:  Back extension exercise is utilized to work the erector spinae(bundle of muscles and tendons) and other smaller stabilizing muscles of the back. It reduces the likelihood of any workout related injury.", covers[0]);
        categoryList.add(a);

        a = new Category("HAMSTRING STRETCH:  Stretching keeps the muscles flexible, strong, and healthy. We can keep our hamstring muscles loose and relieve lower back pain by performing stretches such as toe touches, a common hamstring stretch in which you bend forward and reach your fingers toward your toes while keeping your legs straight.", covers[1]);
        categoryList.add(a);

        a = new Category("KNEE TO CHEST STRETCH:  It is form of pelvic stretch which is very effective in relaxing the pelvic muscles, it also has some impact on the hamstring muscles.", covers[2]);
        categoryList.add(a);

        a = new Category("SPINAL TWIST YOGA WHEEL:  The spinal twist pose releases pressure in the lower back by restoring circulation, increasing flexibility and correcting posture.", covers[3]);
        categoryList.add(a);

        a = new Category("YOGA BACK-BEND WHEEL:  The backbend pose stretches the hip flexors and helps open up the shoulders and chest, an area where people may easily hold tension.", covers[4]);
        categoryList.add(a);

        adapter.notifyDataSetChanged();
    }

    /**
     * RecyclerView item decoration - give equal margin around grid item
     */
    public class GridSpacingItemDecoration extends RecyclerView.ItemDecoration{

        private int spanCount;
        private int spacing;
        private boolean includeEdge;

        public GridSpacingItemDecoration(int spanCount, int spacing, boolean includeEdge) {
            this.spanCount = spanCount;
            this.spacing = spacing;
            this.includeEdge = includeEdge;
        }

        public void getItemOffset(Rect outRect, View view, RecyclerView parent, RecyclerView.State state){
            int position = parent.getChildAdapterPosition(view); // item position
            int column = position % spanCount; // item column

            if (includeEdge) {
                outRect.left = spacing - column * spacing / spanCount; // spacing - column * ((1f / spanCount) * spacing)
                outRect.right = (column + 1) * spacing / spanCount; // (column + 1) * ((1f / spanCount) * spacing)

                if (position < spanCount) { // top edge
                    outRect.top = spacing;
                }
                outRect.bottom = spacing; // item bottom
            } else {
                outRect.left = column * spacing / spanCount; // column * ((1f / spanCount) * spacing)
                outRect.right = spacing - (column + 1) * spacing / spanCount; // spacing - (column + 1) * ((1f /    spanCount) * spacing)
                if (position >= spanCount) {
                    outRect.top = spacing; // item top
                }
            }
        }
    }

    /**
     * Converting dp to pixel
     */
    private int dpToPx(int dp) {
        Resources r = getResources();
        return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics()));
    }
}
