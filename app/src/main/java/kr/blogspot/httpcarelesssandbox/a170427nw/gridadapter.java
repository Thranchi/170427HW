package kr.blogspot.httpcarelesssandbox.a170427nw;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by 윤현하 on 2017-04-27.
 */

public class gridadapter extends BaseAdapter {
    ArrayList<fruit> fruit;
    Context context;
    boolean costable=false;
    edit edit=new edit();
    Addfruit a;

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
        return fruit.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position ;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        if(convertView==null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.griditem,null);
        }

        final TextView name=(TextView)convertView.findViewById(R.id.name);
        final TextView cost=(TextView)convertView.findViewById(R.id.cost);
        final ImageView im=(ImageView) convertView.findViewById(R.id.fruitimage);

        if(costable)
        {
            cost.setVisibility(View.VISIBLE);
        }
        else
        {
            cost.setVisibility(View.INVISIBLE);
        }

        name.setText(fruit.get(position).name);
        cost.setText(fruit.get(position).cost);
        im.setImageResource(fruit.get(position).imgno);

        name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Main2Activity m=new Main2Activity();
                m.seteditname(fruit.get(position).name);
                m.seteditcost(fruit.get(position).cost);
            }
        });

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
