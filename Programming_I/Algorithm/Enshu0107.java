public class Enshu0107{
	public static void main(String[] args){
		java.util.Scanner stdScanner=new java.util.Scanner(System.in);
		boolean isNegativeValues=false;
		int x=-1,
				y=-1,
				dx=-1,
				dy=-1;
		
		isNegativeValues=
			x<0 ||
			y<0 ||
			dx<0 ||
			dy<0;

		while(isNegativeValues){
			System.out.print("x :");
			x=stdScanner.nextInt();
			System.out.print("y :");
			y=stdScanner.nextInt();
			
			System.out.print("dx :");
			dx=stdScanner.nextInt();
			System.out.print("dy :");
			dy=stdScanner.nextInt();
			
			isNegativeValues=
				x<0 ||
				y<0 ||
				dx<0 ||
				dy<0;
			if(isNegativeValues)
				System.out.println("0以上の値を入力してください");
		}

		System.out.printf("x :%d\n",x+dx);
		System.out.printf("y :%d\n",y+dy);
		stdScanner.close();
	}
}
