package chapter03.switch_test;

import javax.swing.JOptionPane;

public class Example_03 {
    public static void main(String[] args) {
        
        //점심 뭐 먹을지 랜덤으로 정하기 

        int menuNum = (int)(Math.random() * 9) + 1;
        String menu;
        switch (menuNum ) {
            case 1 :
                menu = "순대국밥!";
                break;
            case 2 :
                menu = "버거킹!";
                break;
            case 3 :
                menu = "서브웨이!";
                break;
            case 4:
                menu = "타코!";
                break;
            case 5:
                menu ="샐러드!";
                break;
            case 6:
                menu ="김밥!";
                break;
            case 7:
                menu = "오늘은 커피만!";
                break;
            case 8:
                menu = "돈까스!";
                break;
            case 9:
                menu= "라멘!";
                break;
        
            default:
                menu = "메뉴 없음";
                break;
        }
        JOptionPane.showMessageDialog(null,"오늘의 점심메뉴는" + menu +" 입니다." );
    }
}
