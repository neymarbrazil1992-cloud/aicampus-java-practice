package chapter02;

public class AssignTest_02 {
    public static void main(String[] args) {
        
        //전위 연산
        System.out.println("===전위연산===");
        int gameScore = 150;

        // gamescore++ => gameScore = 150 + 1;
        //static->Data gameScore->stack
        int lastScore1 = ++gameScore;
        System.out.println(gameScore); //151
        System.out.println(lastScore1); //151
        System.out.println("------------"); 
       
        //#1 --gamescore => gameScore = 150 - 1;
        
        int lastScore2 = --gameScore;
        System.out.println(gameScore); //150
        System.out.println(lastScore2); //150
        System.out.println("------------"); 
        
        //후위 연산
        System.out.println("===후위연산===");
    
        // #2 gamescore++ => gameScore = gamescore + 1;
        int lastScore3 = gameScore++;
        System.out.println(lastScore3); //150
        System.out.println(gameScore); //151
        System.out.println("------------"); 
       
        //#2 gamescore-- => gameScore = gamescore - 1;
        
        int lastScore4 = gameScore--;
        System.out.println(lastScore4); //151
        System.out.println(gameScore); //150
        System.out.println("------------");
        
        //전위 연산 보다는 후위 연산을 선호한다

        
    }
}
