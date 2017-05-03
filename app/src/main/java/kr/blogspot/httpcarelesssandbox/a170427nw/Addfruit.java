package kr.blogspot.httpcarelesssandbox.a170427nw;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by 윤현하 on 2017-04-27.
 */

public class Addfruit extends LinearLayout implements View.OnClickListener{
    int imageno=0;
    EditText et, et2;
    ImageView img;
    Button b_next, b_add;


    public Addfruit(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        LayoutInflater.from(context).inflate(R.layout.fruitadd, this);
        et=(EditText)findViewById(R.id.f_name);
        et2=(EditText)findViewById(R.id.f_cost);
        b_add=(Button)findViewById(R.id.b_add);
        b_next=(Button)findViewById(R.id.b_next);
        img=(ImageView)findViewById(R.id.image1);
        b_add.setOnClickListener(this);
        b_next.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {
        if (v == b_add) {

            onAddListener.onAdd(et.getText().toString(), et2.getText().toString(), fruit.image[imageno]);
            if (b_add.getText().toString().equals("[M]")) {
                b_add.setText("ADD");

            } else {
                if (imageno == fruit.image.length - 1) imageno = -1;
                img.setImageResource(fruit.image[++imageno]);
            }
        }
    }

    public void namesender(String name) {
        this.et.setText(name);
    }

    public void costsender(String cost) {
        this.et2.setText(cost);
    }

    interface OnAddListener{
        void onAdd(String name, String cost, int imageno);
    }

    public OnAddListener onAddListener;

    public void setOnAddListener(OnAddListener onAddListner){
        this.onAddListener=onAddListner;
    }
}
