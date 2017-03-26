package com.vishaldwivedi.intelliJournal.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.vishaldwivedi.intelliJournal.Models.NavigationDrawerItem;
import com.vishaldwivedi.intelliJournal.R;

import java.util.Collections;
import java.util.List;

/**
 * Created by nagarro on 25/03/17.
 */

public class NavigationDrawerAdapter extends RecyclerView.Adapter<NavigationDrawerAdapter.MyVieHolder> {

    private List<NavigationDrawerItem> mDataList = Collections.EMPTY_LIST;
    private Context context;
    private LayoutInflater layoutInflater;

    public NavigationDrawerAdapter(Context context, List<NavigationDrawerItem> mData) {
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
        this.mDataList = mData;
    }

    @Override
    public MyVieHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.nav_drawer_list_item,parent, false);
        MyVieHolder viewHolder = new MyVieHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final MyVieHolder holder, int position) {
        NavigationDrawerItem current = this.mDataList.get(position);

        holder.imgIcon.setImageResource(current.getImageID());
        holder.title.setText(current.getTitle());
        holder.itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(context, holder.title.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return this.mDataList.size();
    }

    class MyVieHolder extends RecyclerView.ViewHolder {
        TextView title;
        ImageView imgIcon;

        public MyVieHolder(View itemView){
            super(itemView);
            title = (TextView)itemView.findViewById(R.id.navigation_item_title);
            imgIcon = (ImageView)itemView.findViewById(R.id.navigation_item_icon);
        }

    }
}
