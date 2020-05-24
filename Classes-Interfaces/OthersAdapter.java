package generator.nex.rexx.completefitness;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.rexx.completefitness.R;

import java.util.List;

/**
 * Created by rexx on 24-06-2018.
 */

public class OthersAdapter extends RecyclerView.Adapter<OthersAdapter.MyViewHolder> {

    private Context mContext;
    private List<Category> categoryList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title;
        public ImageView thumbnail;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.catTitle);
            thumbnail = (ImageView) view.findViewById(R.id.thumbnail);
        }
    }


    public OthersAdapter(Context mContext, List<Category> albumList) {
        this.mContext = mContext;
        this.categoryList = albumList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.others_card, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {

        final Category category = categoryList.get(position);
        holder.title.setText(category.getName());

        // loading album cover using Glide library
        Glide.with(mContext).load(category.getThumbnail()).into(holder.thumbnail);

    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }
}