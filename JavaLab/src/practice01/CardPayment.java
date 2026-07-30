package practice01;

public class CardPayment implements PaymentMethod {

    @Override
    public boolean pay(int amount) {
        if (amount >= MIN_AMOUNT) {
            System.out.println("카드로 " + amount + "원 결제 완료");
            return true;
        } else {
            System.out.println("결제 실패: 최소 금액 미달 ");
            return false;
        }
    }
    
}
