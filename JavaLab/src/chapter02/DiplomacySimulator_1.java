package chapter02;

import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

public class DiplomacySimulator_1 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("현재 긴장도 지수를 입력하세요 (0~100)");
        int tensionLevel = scan.nextInt();

        System.out.println("최근 협상 횟수를 입력하세요");
        int negotiationAttempts = scan.nextInt();

        //1. 긴장도 등급 판정 (삼항 연산자)
        String status = (tensionLevel >= 70) ? "고위험 "
                        :(tensionLevel >= 40) ? "주의 "
                        :"안정";
        System.out.println("현재 상태: " + status);

        //2.협상 시도 대비 진전 여부 (나눗셈/나머지 응용)
        int roundsPerPhase = 3; //3라운드 마다 한 단계 진전 
        int completedPhases = (negotiationAttempts / roundsPerPhase);
        int remainingRounds = (negotiationAttempts % roundsPerPhase);

        //3.대화 채널 열림 거부 (! 연산자)
        boolean channelClosed = (tensionLevel >=90);
        if (!channelClosed) {System.out.println("외교 채널 유지 중");
    }   else {
            System.out.println("외교 체널 단절 위험 ");
    }

    //4. 몇 번째 협상 라운드인지 카운트 (전위 연산자)
    int round = 0;
    System.out.println("이번은" + (++round) + "차 협상 라운드임니다.");
    


    }
}
