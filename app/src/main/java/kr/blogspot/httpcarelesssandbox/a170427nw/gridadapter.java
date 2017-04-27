package kr.blogspot.httpcarelesssandbox.a170427nw;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 윤현하 on 2017-04-27.
 */

public class gridadapter extends BaseAdapter {
    ArrayList<fruit> fruit;
    Context context;


    public gridadapter(ArrayList<fruit> fruit, Context context){
        this.fruit=fruit;
        this.context=context;
    }

    @Override
    public int getCount() {
        return fruit.size();
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
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.griditem,null);
        }

        final TextView tv=(TextView)convertView.findViewById(R.id.text2);
        final ImageView im=(ImageView) convertView.findViewById(R.id.image);
        tv.setText(fruit.get(position).name);
        im.setImageResource(fruit.get(position).imgno);
        return convertView;
       /* if(convertView == null)
            convertView=new item(context);

        ((item)convertView).setData(fruit.get(position));
        return convertView;*/

    }

    public void addFruit(fruit fruit) {
        this.fruit.add(fruit);
    }

    public void refresh() {
        notifyDataSetChanged();
    }
}
