public class Enshu0105{
	
	public static void main(String[] args){
	
		boolean isNotNegativeSec=false;
		int sec=-1,
				hour=-1,
				min=-1,
				convertedSec=-1,
				buffer=-1;

		java.util.Scanner stdScanner=new java.util.Scanner(System.in);
		
		while(!(isNotNegativeSec)){
			System.out.print("秒: ");
			sec=stdScanner.nextInt();
			
			isNotNegativeSec=sec>=0;
			if(!(isNotNegativeSec))
				System.out.println("0以上の値で入力してください");
		}
			//時間計算をする。(秒から時間・分・秒へ)

		convertedSec=sec % 60;

		buffer=sec / 60;
		hour=buffer/ 60;

		min=buffer % 60;

		System.out.printf("時間: %01d\n",hour);
		System.out.printf("分  : %01d\n",min);
		System.out.printf("秒  : %01d\n",convertedSec);
	}
}
