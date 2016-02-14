package com.codegears.programming.adapter;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.codegears.programming.R;
import com.codegears.programming.util.Logger;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {
    private ArrayList<NameMenu> mNameMenuList;
    private SharedPreferences mPref;
    private SharedPreferences.Editor mEditor;

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView personNameTextView;
        CardView list_row;



        public ViewHolder(View v) {
            super(v);
            personNameTextView = (TextView) v.findViewById(R.id.personNameTextView);
            list_row = (CardView) v.findViewById(R.id.list_row);
        }
    }



    public void add(int position, NameMenu item) {
        mNameMenuList.add(position, item);
        notifyItemInserted(position);
    }
    public void remove(String item) {
        int position = mNameMenuList.indexOf(item);
        mNameMenuList.remove(position);
        notifyItemRemoved(position);
    }
    public CustomAdapter(ArrayList<NameMenu> nameMenuList, Context context) {
        mNameMenuList = nameMenuList;
        mPref = context.getSharedPreferences("person", Context.MODE_PRIVATE);
        mEditor = mPref.edit();
    }
    @Override
    public CustomAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                       int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_row, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }
    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.personNameTextView.setText(mNameMenuList.get(position).getPersonName());
         Logger.Log("selection", "" + mNameMenuList.get(position).isSelected());
        if (mNameMenuList.get(position).isSelected()) {
            holder.list_row.setBackgroundColor(Color.parseColor("#d5d5d5"));
        } else {
            holder.list_row.setBackgroundColor(Color.TRANSPARENT);
        }
    }
//    public void setSelected(int pos) {
//        try {
//            if (plantList.size() > 1) {
//                plantList.get(mPref.getInt("position", 0)).setSelected(false);
//                mEditor.putInt("position", pos);
//                mEditor.commit();
//            }
//            plantList.get(pos).setSelected(true);
//            notifyDataSetChanged();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mNameMenuList.size();
    }
}
