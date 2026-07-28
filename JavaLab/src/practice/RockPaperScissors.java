package practice;

import java.util.Random;

public class RockPaperScissors {

    private int compNum = new Random().nextInt(3) + 1;
    private int count;
    private String result = "False";

    public String play(int myNum) {

        count++;

        String compChoice = "";
        if (compNum == 1) compChoice = "가위";
        else if (compNum == 2) compChoice = "바위";
        else compChoice = "보";

        if (myNum == compNum) {
            System.out.println("컴퓨터: " + compChoice + ", 결과: 무승부");
        } else if ((myNum == 1 && compNum ==3) |
                   (myNum == 2 && compNum == 1)|
                   (myNum == 3 && compNum == 2)) {

                    System.out.println("컴퓨터: " + compChoice + ", 결과: 승리!");
                    result = "WIN";
        } else {
            System.out.println("컴퓨터: " + compChoice + ", 결과: 패배");
        }

        return result;

        //play method 선언 앞에 String ->"이 메서드는 반드시 문자열 하나를 밨으로 돌려줘야 한다."
        //String 이라고 써놓은 이상 return 으로 뭔가를 반드시 내보내야 컴파일이 된다.

       }//play
    
       public int getCount() {
        return count;
       }

}//class
