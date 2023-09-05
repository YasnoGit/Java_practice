package Eclipse;

public class JavaSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

    //1〜10の数字の偶数のみを大きい順に上から縦に並ぶように表示させる
    //初期値10(多い順)
		int w = 10;
  	//1になった時止めるwhile文
		while ( 1 <= w ) {
			// 偶数の判定(2で割ってあまりが0)
			if ( 0 == ( w % 2 ) )
				System.out.println( w );
			// iに1を引いていく
			w--;
	    }

    //1〜10までの偶数が何個あるのか、偶数の合計は幾つになるかを表示させる
		int sum = 0;
		int cnt = 0;
		for (int j = 1; j <= 10; j++) {
			if (j % 2 == 0) {
				sum += j;
				cnt++;
			}
		}
		System.out.println("合計" + sum);
		System.out.println("個数" + cnt);

    //1〜10までの整数をカンマ区切りで横並びで表示（10にはカンマをつけない）させる
		int[] number = {1,2,3,4,5,6,7,8,9,10};
		for (int n = 0; n < number.length; n++) {
			//数字を出力する
			System.out.print(number[n]);
			if (number[n] != 10)
	    //10以外にカンマをつける
			System.out.print(",");
		}

    //要素数20の配列を宣言し、要素に0から5ずつ加算して代入させる。[0]~[10]の値の奇数のみカンマ区切りで、[11]~[19]の値は偶数をカンマ区切りで表示させる
		//20の要素を作成
		int num[] = new int[20];
		num[0] = 0;
		for(int i = 1; i < num.length; i++) {
		   num[i] = num[i - 1] + 5;
		}
		String str0 ="";
		String str1 ="";
		for(int i = 0; i < num.length; i++) {
		   int x = num[i];
		   int mod = x % 2;
		   str1 += i < 11 && mod == 1 ? x + "," : "";
		   str0 += i > 10 && mod == 0 ? x + "," : "";
		}
		System.out.print("奇数 : " + str1.substring(0, str1.length() - 1) + "\n");
		System.out.print("偶数 : " + str0.substring(0, str0.length() - 1) + "\n");
	}
}