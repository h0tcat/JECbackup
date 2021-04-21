public class Swap{
   public static void main(String[] args){
    
    int a,b;
    java.util.Scanner sc=new java.util.Scanner(System.in);
    int c;

    a=sc.nextInt();
    b=sc.nextInt();

    System.out.printf("%d, %d\n",a,b);

    c=a;
    a=b;
    b=c;

    System.out.printf("%d, %d",a,b);

    sc.close();
   } 
}