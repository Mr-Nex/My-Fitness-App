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

public class Static extends AppCompatActivity {

    private RecyclerView recyclerView;
    private OthersAdapter adapter;
    private List<Category> categoryList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_static);

        Intent intentst = getIntent();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        categoryList = new ArrayList<>();
        adapter = new OthersAdapter(this, categoryList);

        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, 1);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.addItemDecoration(new Static.GridSpacingItemDecoration(2, dpToPx(10), true));
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
                R.drawable.dumbbellhold,
                R.drawable.plank,
                R.drawable.sideplank,
                R.drawable.pulluphold
        };

        Category a = new Category("DUMBBELL HOLD:  Isometric or static training has been shown to stimulate strength gains in numerous studies. This exercise is perfect for athletes for grip development.", covers[0]);
        categoryList.add(a);

        a = new Category("PLANK:  The plank is one of the best exercises for core conditioning but it also works your glutes and hamstrings, supports proper posture, and improves balance.", covers[1]);
        categoryList.add(a);

        a = new Category("SIDE PLANK:  Side Plank requires you to balance on one arm, this is a great pose for strengthening your shoulders, wrists, and arms. Make sure to keep your arm strong.", covers[2]);
        categoryList.add(a);

        a = new Category("PULL UP HOLD:  Pul up hold is a great isometric exercise, it has a significant amount of impact on both back and bicep muscles. Also helps to improve grip", covers[3]);
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
