// レッスン1
public class progate {

  public static void main(String []args) {
    System.out.println("Hello, World!");
    System.out.println(3);
    System.out.println(5 + 2);
    System.out.println(8 - 5);
    System.out.println("5 + 2");
    System.out.println(6 / 2);
    System.out.println(8 % 5);
    System.out.println("Ninja" + "Wanko");
    System.out.println("5" + "3");

    // データ型 変数名;
    // int number;
    // String name;

    // 値の代入
    // number = 3;

    int number;
    number = 10;
    System.out.println(number);

    String name;
    name = "Sato";
    System.out.println(name);

    String lastName = "Sato";

    double number = 5.28;
    System.out.println(number);

    int month = 12;
    int date = 31;
    // 12月31日
    System.out.println(month + "月" + date + "日");
    // 7を2で割った値
    System.out.println(7 / 2);
    // 7.0を2.0で割った値
    System.out.println(7.0 /2.0);
    // 7を2.0で割った値
    System.out.println(7 /2.0);

    // キャスト int→double
    int number1 = 13;
    int number2 = 4;
    System.out.println((double)number1 / number2);
  }
}

// レッスン2
public class progate {

  public static void main(String []args) {
    // 真偽値 boolean型 true false

    // 比較演算子 x==y x!=y
    System.out.println(true);
    System.out.println(false);
    System.out.println(6 + 2 == 5);
    System.out.println(6 + 2 != 5);
    boolean bool = 3 * 9 ==27;
    System.out.println(bool);

    // 大小記号 x<y x<=y x>y x>=y
    System.out.println(true);
    System.out.println(false);
    System.out.println(8 < 5);
    System.out.println(3 >= 2);

    // 論理演算子 && かつ、|| または、! 〜でない
    System.out.println(8 < 5 && 3 >= 2);
    System.out.println(8 < 5 || 3 >= 2);
    System.out.println(!(8 < 5));

    // 条件分岐
    // if文
    if (条件式){
      処理;
    }
    int x = 10;
    if (x == 10){
    System.out.println("条件はtrue");
    System.out.println("xは10です");
    }

    int x = 5;
    if (x > 2){
    System.out.println("xは2より大きい");
    }

    if (x > 8){
    System.out.println("xは8より大きい");
    }

    // else文
    int x = 40;
    if (x < 30){
    System.out.println("xは30より小さい");
    } else {
    System.out.println("xは30以上");
    }

    // else if
    int number = 12;
    if (number < 10) {
      System.out.println("10より小さい");
    } else if (number < 20){
      System.out.println("10以上、20より小さい");
    } else {
      System.out.println("20以上");
    }

  }
}