package com.example.jani;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TwoListAdapter extends RecyclerView.Adapter<TwoListAdapter.ViewHolder> {
    private List<DDL_item> DDL_list;
    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView detail;
        public ViewHolder(View view) {
            super(view);
            name = (TextView) view.findViewById(R.id.item_name);
            detail = (TextView) view.findViewById(R.id.item_detail);
        }
    }
    public TwoListAdapter(List<DDL_item> DDL_list) {
        this.DDL_list = DDL_list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_two_line, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(TwoListAdapter.ViewHolder holder, int position) {
        DDL_item item = DDL_list.get(position);
        holder.name.setText(item.getName());
        holder.detail.setText(item.getDetail());
    }

    @Override
    public int getItemCount() {
        return DDL_list.size();
    }
}
