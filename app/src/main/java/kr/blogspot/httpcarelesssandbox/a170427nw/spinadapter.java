package kr.blogspot.httpcarelesssandbox.a170427nw;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

/**
 * Created by 윤현하 on 2017-04-27.
 */

public class spinadapter extends BaseAdapter {
    String fruit[];
    Context context;

    public void SpinnerAdapter(String fruit[], Context context){
        this.fruit=fruit;
        this.context=context;
    }

    @Override
    public int getCount() {
        return 0;
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
            convertView = LayoutInflater.from(context).inflate(R.layout.spineritem,null);
        }

        final TextView tv=(TextView)convertView.findViewById(R.id.text);
        final CheckBox cb=(CheckBox) convertView.findViewById(R.id.checkbox);
        tv.setText(fruit[position]);
        cb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                String msg="선택됨";
                if(!isChecked)
                {
                    msg="선택되지 않았습니다";
                }

            }
        });
        return convertView;
    }
}
