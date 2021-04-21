import java.util.Scanner;

public class Sample01d {
    public static void main(String[] args){

        int x;
        double y;
        Scanner sc=new Scanner(System.in);

        System.out.print("整数値を入力してください--> ");
        x=sc.nextInt();

        //printfを使うことで ダブルクォーテーションの閉じ忘れになりにくく、簡潔なコードになる。
        System.out.printf("入力した値は%dです。\n",x);

        System.out.print("小数値を入力してください--> ");
        y=sc.nextDouble();
        System.out.printf("入力した値は%.2fです。\n",y);
        sc.close();
    }   
}
