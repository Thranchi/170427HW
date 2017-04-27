package kr.blogspot.httpcarelesssandbox.a170427nw;

/**
 * Created by 윤현하 on 2017-04-27.
 */

public class fruit {
    String name;
    int imgno;
    final static String[] fruit={"아보카도","바나나","체리","크랜베리","포도","오렌지","키위","수박"};
    final static int image[]={R.drawable.abocado,R.drawable.banana,R.drawable.cherry,R.drawable.cranberry,R.drawable.grape,R.drawable.orange,R.drawable.kiwi,R.drawable.watermelon};


    public fruit(String name, int imgno){
        this.name=name;
        this.imgno=imgno;
    }
}
