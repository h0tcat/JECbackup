public class Enshu0101{
	public static void main(String[] args){
		int nuki=-1,komi;
		java.util.Scanner stdScanner=new java.util.Scanner(System.in);
		
		while(nuki<0){
			System.out.print("税抜き価格 : ");
			nuki=stdScanner.nextInt();
			if(nuki<0)
				System.out.println("0以上の値を入力してください");
		}
		komi=(int)(nuki*1.10);
		
		System.out.printf("税込み価格 : %.0f\n",komi);
		stdScanner.close();
	}
}
