package example;

import javax.swing.JOptionPane;

public class ifexam_02_1 {
    public static void main(String[] args) {
        int itemPrice = 1000; 
        int gold = Integer.parseInt( JOptionPane.showInputDialog("보유 골드를 입력하세요."));
        int quantity = Integer.parseInt( JOptionPane.showInputDialog("몇 개 구매하시겠습니까?"));
        int totalPrice = itemPrice * quantity;

        if (quantity <= 0) {
            System.out.println("수량은 1개 이상 입력하세요.");
        }else if(gold >= totalPrice) {
            System.out.println("구매 완료!" + (gold - totalPrice) + "골드입니다.");
        }else {
            System.out.println("골드가 부족합니다ㅠㅜ" + (totalPrice - gold ) + "골드가 더 필요합니다.");
        }

    }
}
