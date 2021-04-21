public class Enshu0103{
	public static void main(String[] args){
		int pro=-1,
				algo=-1,
				sql=-1;
		double average=-1;
		boolean isNegativeScores=false;

		java.util.Scanner stdScanner = new java.util.Scanner(System.in);
		
		isNegativeScores=
			pro<0  ||
			algo<0 ||
			sql<0;

		while(isNegativeScores){
			System.out.print("プログラミング :");
			pro=stdScanner.nextInt();

			System.out.print("アルゴリズム :");
			algo=stdScanner.nextInt();

			System.out.print("SQL :");
			sql=stdScanner.nextInt();

			average=(pro+algo+sql)/3;
			
			isNegativeScores=
				pro<0  ||
				algo<0 ||
				sql<0;

			if(isNegativeScores){
				System.out.println("0以上の値を入力してください");
			}
		}

		System.out.printf("平均点 : %.1f\n",average);
		stdScanner.close();
	}
}
