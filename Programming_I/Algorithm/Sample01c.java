public class Sample01c {

    //start program
    public static void main(String[] args){

        //define Value
        int x;
        double y;
        //init  value
        x=2020;
        y=1.23;
        
        //print x And y.
        System.out.println("変数xの値は"+x+"です。");
        System.out.println("変数yの値は"+y+"です。");
        
        //※printfを使うことで ダブルクォーテーションの閉じ忘れになりにくく、簡潔なコードになる。
        System.out.printf("%dと%.2fを同時に表示できます。\n",x,y);
    }   
}
