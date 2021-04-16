import java.math.*;

public class Enshu0104{

	public static void main(String[] args){
		final double pi=3.14;
		double r=-1;

		boolean isNotNegativeR=false;

		java.util.Scanner stdScanner=new java.util.Scanner(System.in);
		
		while(!(isNotNegativeR)){
			System.out.print("半径 :");
			
			r=stdScanner.nextDouble();
			isNotNegativeR=0<=r;

			if(!(isNotNegativeR)){
				System.out.println("0以上の値を入力してください");
			}
		}
		System.out.printf("面積 : %.2f\n",pi*Math.pow(r,2));
	}
}
