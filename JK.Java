public class JK{
  public static void main(String[] args){
  int people,b, month, day, LR, BT;
  double sin, BMI, tai;
  String A,K,ABO;
  A = System.console().readLine("作りたいJKの人数を入力してね:");
  people = Integer.parseInt(A);
    for(b = 1 ; b <= people; b++ ){
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
      sin = (Math.random() * 0.2) + 1.508;
      BMI = (Math.random() * 6.0) + 17.81;
      tai = (BMI * sin * sin);
      System.out.println("誕生日 " + month + " 月 " + day + " 日\n" + "利き手 " + K + "利き\n"+"血液型 "+ ABO + " 型");
      System.out.println("身長 " + (int)(sin * 100) + " cm 体重 " + (int)tai +" kg\n");
    }
  }
}

