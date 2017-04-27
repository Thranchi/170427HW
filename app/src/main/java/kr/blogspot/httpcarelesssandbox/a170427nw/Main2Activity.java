package kr.blogspot.httpcarelesssandbox.a170427nw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    ArrayList<fruit> fruitbag = new ArrayList<fruit>();
    final int imglist[]={R.drawable.abocado,R.drawable.banana,R.drawable.cherry,R.drawable.cranberry,R.drawable.grape,R.drawable.orange,R.drawable.kiwi,R.drawable.watermelon};
    GridView gridView;
    gridadapter gridadapter;
    Addfruit addfruit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        gridView=(GridView)findViewById(R.id.grid);
        fruitbag.add(new fruit("아보카도",imglist[0]));
        fruitbag.add(new fruit("바나나",imglist[1]));
        fruitbag.add(new fruit("체리",imglist[2]));
        fruitbag.add(new fruit("크랜베리",imglist[3]));

        gridadapter=new gridadapter(fruitbag,this);
        gridView.setAdapter(gridadapter);

        addfruit=(Addfruit)findViewById(R.id.add);
        addfruit.setOnAddListener(new Addfruit.OnAddListener() {
            @Override
            public void onAdd(String name, int imageno){
                Toast.makeText(getApplicationContext(), name+""+imageno,Toast.LENGTH_SHORT).show();
                gridadapter.addFruit(new fruit(name, imageno));
                gridadapter.refresh();
                    }



        });
    }
}
