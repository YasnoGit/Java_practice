// 文字列は""で囲む
// 数値は囲まない

// ()の中身を出力せよ、という命令
// 文の終わりはセミコロン
System.out.println();

// 構造
class Main { //クラス部分
  public static void main(String []args) { //メソッド部分
    ここからコード //処理部分
  }
}
// 修飾子
・public = 制限はなく、どこからでもアクセス可能
・protected = 同一パッケージ内、またはサブクラスからのみアクセス可能
・無し = 同一パッケージ内のみアクセス可能
・private = 同一クラス内でのみアクセス可能


public class C {

  public static void main(String []args) {
    // データ型 変数名;
    // int number;
    // String name;

    // 値の代入
    // number = 3;

    int number; //定義
    number = 10; //代入
    System.out.println(number);

    String name;
    name = "Sato";
    System.out.println(name);

    String lastName = "Sato"; //定義と代入の同時処理＝変数初期化
    lastName = "ito"; //データ型をつけずにデータを上書きできる

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

    // switch文
    int number = 12;
    switch (number % 3){
      case 0:
        System.out.println("3で割り切れます");
        break;
      case 1:
        System.out.println("3で割ると1余ります");
        break;
      case 2:
        System.out.println("3で割ると2余ります");
        break;
    }
    // default
    int number = 13;
    switch (number % 5){
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

    // while文
    while (条件){
      繰り返す処理;
    }

    int number = 1;
    while (numeber <= 10){
      System.out.println("number");
      number ++;
    }

    // for文
    for(int i = 1; i <= 10; i ++){
      System.out.println(i +"回目のループです");
    }

    System.out.println("===while文===");
    int = 1;
    while (i < 10){
      if (i % 5 == 0){
        break;
      }
      System.out.println(i);
      i++;
    }

    System.out.println("===while文===");
    for (int j = 1; j < 10; j++){
      if (j % 3 == 0){
        continue;
      }
      System.out.println(j);
    }

    // 配列
    // {}に,で区切りながら値
    // 前から順に0,1,2...
    int[] number = {5, 13, 29} ・・・数値要素配列
    String[] names = {"john", "Kate", "Bob"}・・・文字列要素配列

    String[] names = {"にゃんじゃわんこ", "ひつじ仙人", "ベイビーわんこ"};
    System.out.println(names[0]);
    // 上書き
    String[] languages = {"Ruby", "PHP", "Python"};
    System.out.println(languages[1]);
    languages[1] = "Java";
    System.out.println(languages[1]);
    // 繰り返し
    String[] names = {"にゃんじゃわんこ", "ひつじ仙人", "ベイビーわんこ"};
    for(int i = 0; i <names.length; i++){
      System.out.println("私の名前は" + names[i]) + "です");
    }
    // for文(配列)
    for (データ型 変数型: 配列名){
      繰り返す処理;
    }

    String[] names = {"にゃんじゃわんこ", "ひつじ仙人", "ベイビーわんこ"};
    for(String name: names){
      System.out.println("私の名前は" + name + "です");
    }

  }
}



// メソッド
戻り値型 メソッド名(引数) {
　処理
　return式;
}