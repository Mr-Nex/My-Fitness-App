package generator.nex.rexx.completefitness;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.rexx.completefitness.R;

import generator.nex.rexx.completefitness.Interface.ItemClickListener;

import java.util.List;

/**
 * Created by rexx on 22-06-2018.
 */

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.MyViewHolder> {

    private Context mContext;
    private List<Category> categoryList;

// ViewHolder class------------
    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public ImageView thumbnail, overflow;
        public TextView title;

        private ItemClickListener itemClickListener;
        private final Context context;

        public MyViewHolder(View itemView) {
            super(itemView);

            context = itemView.getContext();

            thumbnail = (ImageView)itemView.findViewById(R.id.thumbnail);
            title = (TextView) itemView.findViewById(R.id.catTitle);
            overflow = (ImageView)itemView.findViewById(R.id.overflow);

            itemView.setOnClickListener(this);
        }
        public void setItemClickListener(ItemClickListener itemClickListener){
            this.itemClickListener = itemClickListener;
        }
        @Override
        public void onClick(View view) {

            final Intent intent;
            switch (getAdapterPosition()){
                case 0:
                    intent = new Intent(context, Flexibility.class);
                    break;
                case 1:
                    intent = new Intent(context, Static.class);
                    break;
                case 2:
                    intent = new Intent(context, Dynamic.class);
                    break;
                case 3:
                    intent = new Intent(context, Circuit.class);
                    break;
                case 4:
                    intent = new Intent(context, Aerobic.class);
                    break;
                case 5:
                    intent = new Intent(context, Exercises.class);
                    break;
                default:
                    intent = new Intent(context, Exercises.class);
                    break;
            }
            context.startActivity(intent);

        }
    }
//--------------------------------

    public CategoryAdapter(Context mContext, List<Category> categoryList){
        this.mContext = mContext;
        this.categoryList = categoryList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.category_card, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {

        Category category = categoryList.get(position);
        holder.title.setText(category.getName());

        // loading category cover using Glide library
        Glide.with(mContext).load(category.getThumbnail()).into(holder.thumbnail);

        holder.overflow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPopupMenu(holder.overflow);
            }
        });

    }

    /**
     * Showing popup menu when tapping on 3 dots
     */
    private void showPopupMenu(ImageView overflow) {
        // inflate menu
        PopupMenu popup = new PopupMenu(mContext, overflow);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.category_popup, popup.getMenu());
        popup.setOnMenuItemClickListener(new MyMenuItemClickListener());
        popup.show();
    }

    private class MyMenuItemClickListener implements PopupMenu.OnMenuItemClickListener {

        public MyMenuItemClickListener() {
        }

        @Override
        public boolean onMenuItemClick(MenuItem menuItem) {
            final Intent intent;

            switch (menuItem.getItemId()) {
                case R.id.action_ask_anything:
                    intent = new Intent(mContext, Ask.class);
                    break;
                default:
                    intent = new Intent(mContext, Ask.class);
                    break;
            }
            mContext.startActivity(intent);
            return false;
        }
    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }
}
