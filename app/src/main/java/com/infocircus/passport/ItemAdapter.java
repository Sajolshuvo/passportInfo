package com.infocircus.passport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ItemAdapter extends BaseAdapter {
    String[] itemName;
    String[] itemNum;
    Context context;

    private LayoutInflater inflater;

    public ItemAdapter(String[] itemName, String[] itemNum, Context context) {
        this.itemName = itemName;
        this.itemNum = itemNum;
        this.context = context;
    }

    @Override
    public int getCount() {
        return itemName.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        if (view == null) {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);


            view = inflater.inflate(R.layout.list_item, viewGroup, false);

        }

        TextView textView = view.findViewById(R.id.step);
        textView.setText(itemNum[position]);

        TextView item = view.findViewById(R.id.item_name);
        item.setText(itemName[position]);

        return view;
    }
}
