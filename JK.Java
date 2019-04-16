public class JK{
  public static void main(String[] args){
   int people,b, month, day, LR, BT;
    double height, BMI, weight;
    String A,K,ABO;
    A = System.console().readLine("入力した数だけ女子高校生のステータスを作ります\n数を入力してね：");
    people = Integer.parseInt(A);
     for(b = 1 ; b <= people; b++ ){
       //誕生日を設定
       month = (int)(Math.random() * 12) + 1;
          if ( month == 2 ){
           day = (int)(Math.random() * 28) + 1;
         } else if ( month == 4 || month == 6 || month == 9 || month == 11 ){
           day = (int)(Math.random() * 30) + 1;
         } else {
           day = (int)(Math.random() * 31) + 1;
          }
       //利き手を設定
        LR = (int)(Math.random() * 10) + 1;
          if ( LR == 10 ){
           K = "左";
         } else{
           K = "右";
         }
       //血液型を設定
       BT = (int)(Math.random() * 10) + 1;
          if ( BT <= 4 ){
           ABO = "A";
         } else if ( BT <= 7 ){
           ABO = "O";
         } else if ( BT <= 9 ){
            ABO = "B";
         } else{
           ABO = "AB";
         }
       //身長　体重を設定
        height = (Math.random() * 0.2) + 1.508;
        BMI = (Math.random() * 6.0) + 17.81;
       weight = (BMI * height * height);
       //出力
       System.out.println("誕生日 " + month + " 月 " + day + " 日\n" + "利き手 " + K + "\n"+"血液型 "+ ABO + " 型");
       System.out.println("身長 " + (int)(height * 100) + " cm 体重 " + (int)tai +" kg");
       System.out.println("");
    }
  }
}

