public class Enshu0103{
	public static void main(String[] args){
		int pro=-1,
				algo=-1,
				sql=-1;
		double average=-1;
		boolean isNotNegativeScores=false;

		java.util.Scanner stdScanner = new java.util.Scanner(System.in);
		
		while(!(isNotNegativeScores)){
			System.out.print("プログラミング :");
			pro=stdScanner.nextInt();

			System.out.print("アルゴリズム :");
			algo=stdScanner.nextInt();

			System.out.print("SQL :");
			sql=stdScanner.nextInt();

			average=(pro+algo+sql)/3;
			
			isNotNegativeScores=
				0<=pro &&
				0<=algo &&
				0<=sql;

			if(!(isNotNegativeScores)){
				System.out.println("0以上の値を入力してください");
				isNotNegativeScores=false;
			}
		}
		System.out.printf("平均点 : %.1f\n",average);
	}
}
