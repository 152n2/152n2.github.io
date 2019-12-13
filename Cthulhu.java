import java.util.Scanner;
import java.util.Random;

public class Cthulhu{
  public static void main(String[] args){
    Random r = new Random();
    int people, i, j, k, num, tmp = 0;
    String job;
    Scanner A = new Scanner(System.in);
    System.out.print("プレーヤーの人数を入力してね:");
    people = A.nextInt(); //整数に変換
    double status[][] = new double[people][15];
    String eva[] = {"STR","CON","POW","DEX","APP","SIZ","INT","EDU","SAN","幸運","アイデア","知識","耐久力","ダメージボーナス","マジックポイント"};//ステータス


    for (i = 0; i < people ; i++){

        for (j = 0 ; j <= 4; j++ ){ //STR ~ APPまでの値を決める
            for (k = 1 ; k <= 3 ; k++) { //サイコロを3回降る
                num = r.nextInt(6) + 1; //1~6まででる
                tmp = num + tmp; // 加算

            }
            status[i][j] = tmp; //STR ~ APPまでの値を代入する
            tmp = 0; //初期化
        }
        for (j = 5 ; j <= 6; j++ ){ //SIZ ~ INTまでの値を決める
            for (k = 1 ; k <= 2 ; k++) {//サイコロを2回降る
                num = r.nextInt(6) + 1;
                tmp = num + tmp;
            }
            status[i][j] = tmp + 6;
            tmp = 0;  //初期化
        }
        for (k = 1 ; k <= 3 ; k++) {// サイコロを3回降る
            num = r.nextInt(6) + 1;
            tmp = num + tmp;

        }
            status[i][7] = tmp + 3;//EDUの値を決める
            status[i][8] = (status[i][2]) * 5;
            status[i][9] = (status[i][2]) * 5;
            status[i][10]= (status[i][6]) * 5;
            status[i][11]= (status[i][7]) * 5;
            status[i][12]= (status[i][1] + status[i][5]) / 2;
            status[i][13]= (status[i][1] + status[i][5]);
            status[i][14]= status[i][2];
            tmp = 0;  //初期化

    }
    for (i = 0 ; i < people ; i++) {
          System.out.println("---探索者 "+ (i+1) + "のステータス---");
      for (j = 0 ; j < 15 ; j++) {
          if (j == 12) {
            System.out.println(eva[j] + " ・・・ " + status[i][j]);
          }else{
            System.out.println(eva[j] + " ・・・ " + (int)(status[i][j]));
          }

      }
         System.out.println();
    }
  }
}
