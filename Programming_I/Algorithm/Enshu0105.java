public class Enshu0105{
	
	public static void main(String[] args){
	
		int sec=-1,
				hour=-1,
				min=-1,
				convertedSec=-1,
				buffer=-1;

		java.util.Scanner stdScanner=new java.util.Scanner(System.in);
		
		while(sec<0){
			System.out.print("秒: ");
			sec=stdScanner.nextInt();
			
			if(sec<0)
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
