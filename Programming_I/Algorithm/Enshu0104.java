import java.math.*;

public class Enshu0104{

	public static void main(String[] args){
		final double pi=3.14;
		double r=-1;

		java.util.Scanner stdScanner=new java.util.Scanner(System.in);
		
		while(r<0){
			System.out.print("半径 :");
			
			r=stdScanner.nextDouble();
			if(r<0)
				System.out.println("0以上の値を入力してください");
		}
		System.out.printf("面積 : %.2f\n",pi*Math.pow(r,2));
	}
}
