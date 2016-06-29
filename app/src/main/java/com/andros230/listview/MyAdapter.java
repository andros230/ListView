package com.andros230.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by andros230 on 2016/6/29.
 */
public class MyAdapter extends BaseAdapter {
    private List<String> list;
    private Context context;

    public MyAdapter(List<String> list, Context context) {
        this.list = list;
        this.context = context;
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
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = LayoutInflater.from(context).inflate(R.layout.adapter_custom_view, null);
        TextView  textView = (TextView) view2.findViewById(R.id.textview33);
        textView.setText(list.get(i));
        System.out.println("--->" + i);
        return view2;
    }
}
