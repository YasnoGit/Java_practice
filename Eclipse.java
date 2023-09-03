package Eclipse;

public class JavaSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int x = 20;
	    if (x == 20){
	    System.out.println("条件はtrue");
	    System.out.println("xは20です");
	    }

	    int y = 5;
	    if (y > 2){
	    System.out.println("yは2より大きい");
	    }

	    int z = 100;
	    if (z < 101) {
	    System.out.println("zは101よりも小さい");
	    }

	    int number = 12;
	    if (number < 10) {
	    System.out.println("10より小さい");
	    } else if (number < 20){
	    System.out.println("10以上、20より小さい");
	    } else {
	    System.out.println("20以上");
	    }

	    int number1 = 600;
	    if (number1 < 500) {
	    System.out.println("500より小さい");
	    } else if (number1 < 1000) {
	    System.out.println("500以上、1000より小さい");
	    } else {
	    System.out.println("1000以上");
	    }

	    int number2 = 12;
	    switch (number2 % 6) {
	      case 0:
	        System.out.println("6で割り切れます");
	        break;
	      case 1:
	        System.out.println("6で割ると1余ります");
	        break;
	      case 2:
	        System.out.println("6で割ると2余ります");
	        break;
	    }

	    int number3 = 13;
	    switch (number3 % 5){
	      case 0:
	        System.out.println("大吉です");
	        break;
	      case 1:
	        System.out.println("中吉です");
	        break;
	      case 4:
	        System.out.println("凶です");
	        break;
	      default:
	        System.out.println("吉です");
	        break;
	    }

	    for(int i = 1; i <= 10; i ++){
	        System.out.println(i +"回目のループです");
	      }

	    System.out.println("===while文===");
	    int r = 1;
	    while (r < 10){
	      if (r % 5 == 0){
	        break;
	      }
	      System.out.println(r);
	      r++;
	    }

	    System.out.println("===while文===");
	    for (int j = 1; j < 10; j++){
	      if (j % 2 == 0){
	        continue;
	      }
	      System.out.println(j);
	    }

	    String[] names = {"にゃんじゃわんこ", "ひつじ仙人", "ベイビーわんこ"};
	    for(int q = 0; q <names.length; q++){
	      System.out.println("私の名前は" + names[q] + "です");
	    }

	    String[] nam = {"にゃんじゃわんこ", "ひつじ仙人", "ベイビーわんこ"};
	    for(String name: nam){
	      System.out.println("私の名前は" + name + "です");
	    }
	}

}