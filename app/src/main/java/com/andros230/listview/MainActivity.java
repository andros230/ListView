package com.andros230.listview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView list = (ListView) findViewById(R.id.listView);

        ArrayList<HashMap<String, String>> mylist = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            HashMap<String, String> map = new HashMap<>();
            map.put("title" + i, "this is title " + i);
            map.put("text", "this is text" + i);
            mylist.add(map);
        }

        SimpleAdapter msche = new SimpleAdapter(this, mylist, R.layout.my_listitem, new String[]{"title", "text"}, new int[]{R.id.title, R.id.text});
        list.setAdapter(msche);
    }
}
