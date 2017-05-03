package kr.blogspot.httpcarelesssandbox.a170427nw;

/**
 * Created by 윤현하 on 2017-04-27.
 */

public class fruit {
    String name;
    String cost;
    int imgno;
    final static String[] fruit={""};
    final static String[] fruitcost={"1000","1500","2000","2500","3000","3500","4000","4500"};
    final static int image[]={R.drawable.abocado,R.drawable.banana,R.drawable.cherry,R.drawable.cranberry,R.drawable.grape,R.drawable.orange,R.drawable.kiwi,R.drawable.watermelon};


    public fruit(String name, String cost, int imgno){
        this.name=name;
        this.cost=cost;
        this.imgno=imgno;
    }
}
