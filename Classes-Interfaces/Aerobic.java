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

public class Aerobic extends AppCompatActivity {

    private RecyclerView recyclerView;
    private OthersAdapter adapter;
    private List<Category> categoryList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aerobic);

        Intent intentAer = getIntent();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        categoryList = new ArrayList<>();
        adapter = new OthersAdapter(this, categoryList);

        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, 1);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.addItemDecoration(new Aerobic.GridSpacingItemDecoration(2, dpToPx(10), true));
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
                R.drawable.boxing,
                R.drawable.cycling,
                R.drawable.swimming,
                R.drawable.jogging,
                R.drawable.running
        };

        Category a = new Category("BOXING:  Boxing is both cardio and strength workout, it improves overall fitness. In addition to boosting your strength, boxing improves a number of skill-related parameters of fitness, including balance, coordination, reactivity, and agility.", covers[0]);
        categoryList.add(a);

        a = new Category("CYCLING:  Cycling is a good exercise for improving leg strength and toning leg and glutes(hip muscles) - with lesser stress on joints as compared to running.", covers[1]);
        categoryList.add(a);

        a = new Category("SWIMMING:  Swimming is the best workout for the whole body especially the muscles of the back, shoulder and arms. It improves flexibility as well. ", covers[2]);
        categoryList.add(a);

        a = new Category("JOGGING:  Jogging is an effective cardiovascular exercise that can benefit your general health. Jogging can help you lose weight in general. Even a short jog of 15 minutes can make some amazing impacts if you make it a part of your regular routine", covers[3]);
        categoryList.add(a);

        a = new Category("RUNNING:  It is beneficial in improving heart and bone health. Its advantage over walking is that it improves heart fitness and burns calories at a greater rate.", covers[4]);
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
