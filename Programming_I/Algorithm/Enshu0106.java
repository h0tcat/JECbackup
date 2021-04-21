/*
 *
 * 作成日 4/15
 *
 */


public class Enshu0106{
	public static void main(String[] args){

		int startHour=-1,
				startMin=-1,
				endHour=-1,
				endMin=-1,
				diffHour=-1,
				diffMin=-1;

		boolean isNegativeNumbers=false;

		boolean failedCalc=false;
		java.util.Scanner stdScanner=new java.util.Scanner(System.in);

		//入力されたすべての値が正の数であれば、次へ進む。

		isNegativeNumbers=
			startHour<0 ||
			startMin <0 ||
			endHour  <0 ||
			endMin   <0 ;
		while(!(failedCalc)){
			while(isNegativeNumbers){
				System.out.print("開始 - 時: ");
				startHour=stdScanner.nextInt();

				System.out.print("開始 - 分: ");
				startMin=stdScanner.nextInt();

				System.out.print("\n終了 - 時: ");
				endHour=stdScanner.nextInt();

				System.out.print("終了 - 分: ");
				endMin =stdScanner.nextInt();

				isNegativeNumbers=
					startHour<0 ||
					startMin <0 ||
					endHour  <0 ||
					endMin   <0 ;

				if(isNegativeNumbers)
					System.out.println("0以上の値で入力してください");

				diffHour= endHour-startHour;
				diffMin = endMin -startMin;

				//経過時間の計算を行う。
				while(diffMin<0){
					diffHour--;
					diffMin+=60;
				}
			}

			failedCalc=0<diffHour && 0<diffMin;
			if(failedCalc==false){
				System.out.println("計算エラー。");
				isNegativeNumbers=true;
			}
		}
		System.out.println();
		System.out.printf("経過 - 時: %01d\n",diffHour);
		System.out.printf("経過 - 分: %01d\n",diffMin);
		stdScanner.close();
	}
}
