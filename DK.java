public class DK{
  public static void main(String[] args){
    int people,i, month, day, LR, BT;
    double height, BMI, weight;
    String A, K,ABO;
    A = System.console().readLine("入力した数だけ男子高校生のステータスを作ります\n数を入力してね:");
    people = Integer.parseInt(A);
      for(i = 1 ; i <= people; i++ ){
        month = (int)(Math.random() * 12) + 1;
          if ( month == 2 ){
            day = (int)(Math.random() * 28) + 1;
          } else if ( month == 4 || month == 6 || month == 9 || month == 11 ){
            day = (int)(Math.random() * 30) + 1;
          } else {
            day = (int)(Math.random() * 31) + 1;
          }
        LR = (int)(Math.random() * 10) + 1;
          if ( LR == 10 ){
            K = "左";
          } else{
            K = "右";
          }
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
        height = (Math.random() * 0.2) + 1.600;
        BMI = (Math.random() * 6.0) + 18.11;
        weight = (BMI * height * height);
        System.out.println("誕生日 " + month + " 月 " + day + " 日\n" + "利き手 " + K + "\n"+"血液型 "+ ABO + " 型");
        System.out.println("身長 " + (int)(height * 100) + " cm 体重 " + (int)weight +" kg");
        System.out.println("");
      }
    }
  }
