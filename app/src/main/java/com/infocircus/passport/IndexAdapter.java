package com.infocircus.passport;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class IndexAdapter extends RecyclerView.Adapter<IndexAdapter.MyViewHolder> {

    public Context mContext;
    public List<Index> indexList;
    CustomItemClickListener listener;

    public IndexAdapter(Context mContext, List<Index> indexList) {
        this.mContext = mContext;
        this.indexList = indexList;
    }


    public IndexAdapter(Context mContext, List<Index> indexList, CustomItemClickListener listener) {
        this.mContext = mContext;
        this.indexList = indexList;
        this.listener = listener;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card, parent, false);
        final MyViewHolder pvh = new MyViewHolder(itemView);


        return pvh;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        Index index = indexList.get(position);
        holder.title.setText(index.getmName());

        // loading album cover using Glide library
        Glide.with(mContext).load(index.getImageSrc()).into(holder.thumbnail);

        holder.thumbnail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onItemClick(v, holder.getAdapterPosition());
            }
        });


    }

    @Override
    public int getItemCount() {
        return indexList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title;
        public ImageView thumbnail;

        public MyViewHolder(final View view) {
            super(view);
            title = view.findViewById(R.id.title);
            thumbnail = view.findViewById(R.id.thumbnail);

        }
    }
}
