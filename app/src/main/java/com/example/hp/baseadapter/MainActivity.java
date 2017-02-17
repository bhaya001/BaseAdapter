package com.example.hp.baseadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listView=null;
    List<Users>data=new ArrayList<Users>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        data.add(new Users("Mouad","0707221994"));
        data.add(new Users("Mouhcine","0644565432"));
        data.add(new Users("Souto","06445652145"));

        listView=(ListView)findViewById(R.id.listView);
        MyAdapter adapter=new MyAdapter();
        listView.setAdapter(adapter);



    }

    public class MyAdapter extends BaseAdapter
    {

        @Override
        public int getCount() {
            return data.size();
        }

        @Override
        public Object getItem(int position) {
            return data.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
if (convertView==null) {
    convertView = MainActivity.this.getLayoutInflater().inflate(R.layout.activity_item, null);
}
                TextView tnom = (TextView) convertView.findViewById(R.id.nom);
                TextView tTel = (TextView) convertView.findViewById(R.id.tel);
                tnom.setText(data.get(position).getName());
                tTel.setText(data.get(position).getTel());

            return convertView;
        }
    }

}
