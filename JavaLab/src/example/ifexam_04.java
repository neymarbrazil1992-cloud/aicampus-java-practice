package example;


import javax.swing.JOptionPane;

public class ifexam_04 {
    public static void main(String[] args) {
        /*
        주문 금액과 회원 여부를 입력박아 할인과 배달비를 적용한 최종 결제 금액을 출력하세요.
        회원 - 비회원
        조건 : 
         -주문 금액이 0보다 작으면 "잘못된 주문 금액입니다."
         -회원 여부가 1 또는 2가 아니면 "잘못된 회원 정보입니다."
         -주문 금액이 30,000원 이상이면 10% 할인합니다.
         -회원이면 할인된 금액에서 추가로 5% 할인합니다.
         -할인 적용 후 금액이 15,000원 미만이면 배달비 3,000원을 추가합니다.
         -최종 결제 금액을 출력합니다        
        */
        int orderPrice = Integer.parseInt(JOptionPane.showInputDialog("주문 금액을 입력하세요."));
        int memberType = Integer.parseInt(JOptionPane.showInputDialog( "회원 여부를 입력하세요.\n" + "1. 회원\n" + "2. 비회원"));
       
        if (orderPrice < 0) {
            JOptionPane.showInputDialog("잘못된 주문 금액입니다");
        } else if (memberType != 1 && memberType != 2) {
            JOptionPane.showInputDialog("잘못된 회원 정보입니다.");
        } else {
            double finalPrice=orderPrice;
            String result="";
            if (orderPrice >= 30000) {
                finalPrice = finalPrice * 0.9;
                result +="주문 금액 10% 할인이 적용되었습니다.\n";
            }
            
            if(memberType == 1){
                finalPrice = finalPrice * 0.95;
                result +="회원 5% 할인이 적용되었습니다.\n";
            }

            if(finalPrice < 15000){
                finalPrice = finalPrice + 3000;
                result +="배송비 3,000원이 추가되었습니다.\n";
            }
            result += "최종 결제 금액: " + finalPrice + "원 입니다.";
            JOptionPane.showMessageDialog(null, result);


        }//if
         
    }//main
}//class
