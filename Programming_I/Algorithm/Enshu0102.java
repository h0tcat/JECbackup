public class Enshu0102{
	public static void main(String[] args){
		boolean isNotNegativeValues=false;
		
		int tanka=-1,amount=-1;
		double zeikomikakaku=-1,shouhizeikakaku=-1;

		java.util.Scanner stdScanner=new java.util.Scanner(System.in);
		
		while(!(isNotNegativeValues)){
			System.out.print("単価 :");
			tanka=stdScanner.nextInt();
			
			System.out.print("数量 :");
			amount=stdScanner.nextInt();
			
			isNotNegativeValues=0<=tanka && 0<=amount;
			if(!(isNotNegativeValues))
				System.out.println("0以上の値を入力してください");
		}

		zeikomikakaku=(tanka*amount)*1.10;
		shouhizeikakaku=zeikomikakaku*10/110;

		System.out.printf("消費税額 : %.0f\n",shouhizeikakaku);
		System.out.printf("税込み価格 : %.0f\n",zeikomikakaku);
	}
}
