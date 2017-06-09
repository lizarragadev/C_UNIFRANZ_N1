package com.miramicodigo.p10_recyclerview_cardviews;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 *
 * @author Gustavo Lizarraga
 * @date 09-06-17.
 */

class RVAdapter extends RecyclerView.Adapter<RVAdapter.ViewHolder> {
    private Context context;
    private ArrayList<Pokemon> items;

    public RVAdapter(Activity activity, ArrayList<Pokemon> data) {
        this.context = activity;
        this.items = data;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        public ViewHolder(final View itemView) {
            super(itemView);

        }
    }
}
