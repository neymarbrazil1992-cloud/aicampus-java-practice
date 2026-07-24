package example;

import javax.swing.JOptionPane;

public class ifexam_05 {
    public static void main(String[] args) {

        int months = Integer.parseInt(JOptionPane.showInputDialog("등록 개월 수를 입력하세요."));
        
        String ptInput = JOptionPane.showInputDialog("PT를 추가하시겠습니까? (Y/N)");
        boolean addPT = ptInput.equals("y");

        double finalPrice = 100000;
        String results = "";

        If (months >= 3) {
            finalPrice = finalPrice * 0.9;
            results += "3개월 이상 10% 할인 적용\n;};
    
        If 
}
