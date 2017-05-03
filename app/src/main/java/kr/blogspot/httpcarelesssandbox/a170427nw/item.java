package kr.blogspot.httpcarelesssandbox.a170427nw;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by 윤현하 on 2017-04-27.
 */

public class item extends LinearLayout {
    TextView tv;
    ImageView im;
    public item(Context context) {
        super(context);
    }

    public void init(Context context){
        View view=LayoutInflater.from(context).inflate(R.layout.spineritem,null);

        tv=(TextView)findViewById(R.id.text);
        im=(ImageView)findViewById(R.id.image);
    }

    public  void setData(fruit fruit){
        tv.setText(fruit.name);
        im.setImageResource(fruit.imgno);
    }

}
