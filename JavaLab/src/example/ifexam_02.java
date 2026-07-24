package example;

import javax.swing.JOptionPane;

public class ifexam_02 {
    
    public static void main(String[] args) {
        /*
        보유한 골드를 입력받아 아이템 구매 가능 여부를 출력하세요.
        아이템 가격은 1000골드
        보유 골드가 1000이상 이면 "아이템을 구매했습니다."
        1000미만 이면 "골드가 부족합니다."
        */

        int itemPrice = 1000; 
        int gold = Integer.parseInt( JOptionPane.showInputDialog("보유 골드를 입력하세요."));
        
        if (gold < 0) {
            System.out.println("잘못된 골드 입니다.");
        }else if (gold >= 1000) {
            int remainingGold = gold - itemPrice;
            JOptionPane.showMessageDialog(null, "아이템을 구매했습니다.");
            System.out.println("남은 골드" + remainingGold + "골드");
        }else {
            JOptionPane.showMessageDialog(null, "골드가 부족합니다.");
        }

    }//main
}//class
