package chapter03.for_test;

public class forex04 {
    public static void main(String[] args) {
        //3개 협상국
        for (int country = 1; country <= 3; country++) {

            String name = "";
            int baseTrust = 0; //턴당 기본 신뢰도 변화
            int tariffRate = 0; //현재 관세율 

            if  (country == 1) {
                name = "미국";
                baseTrust = 5;
                tariffRate = 15;
            } else if (country == 2) {
                name = "중국";
                baseTrust = 3;
                tariffRate = 10;
            } else {
                name = "한중 관계(자체지표)";
                baseTrust = 8;
                tariffRate = 10;
            }// if

            System.out.println("==="+ "협상 트랙시작 (기준 관세율 " + tariffRate +"%) ===");
            
            int totalTrust =0;
            for (int turn =1;turn <=5; turn++) {
                int change =baseTrust + turn;
                totalTrust += change;

                System.out.println(turn + "턴: 신뢰도" + (change >= 0 ? "+" : "") + change + ", 누적 신뢰도: " + totalTrust);
                if (totalTrust >= 45) {
                    System.out.println(">> " + name + "관세 인하/관계 합의 체결!");
                break;
                }
                if (totalTrust <= -20) {
                    System.out.println(">> "+ name + "협상 결렬. 관세 유지 또는 관계 정색.");
                    break;
                }
                System.out.println(" 트랙 종료. 최종 누적 신뢰도: " + totalTrust);
                System.out.println();
                
            } 

            System.out.println("모든 협상 트랙 시물레이션 종료!");

        } //for 


    }//main
}//class
