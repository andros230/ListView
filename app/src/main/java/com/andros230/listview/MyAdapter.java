package com.andros230.listview;

import android.content.Context;
import android.support.v4.widget.ViewDragHelper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

/**
 * Created by andros230 on 2016/6/29.
 */
public class MyAdapter extends BaseAdapter {
    private List<String> list;
    private LayoutInflater mInflater;

    public MyAdapter(List<String> list, Context context) {
        this.list = list;
        this.mInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view == null) {
            holder = new ViewHolder();
            view = mInflater.inflate(R.layout.adapter_custom_view, null);
            holder.text = (TextView) view.findViewById(R.id.textview33);
            holder.button = (Button) view.findViewById(R.id.button1);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }

        holder.text.setText(list.get(i));

        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("---", i + "");
            }
        });
        return view;

    }

    public class ViewHolder {
        public TextView text;
        public Button button;
    }
}
