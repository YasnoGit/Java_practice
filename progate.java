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