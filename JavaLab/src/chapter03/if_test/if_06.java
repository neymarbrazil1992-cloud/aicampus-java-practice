package chapter03.if_test;

import javax.swing.JOptionPane;

public class if_06 {
    public static void main(String[] args) {
        //데이터셋
        String ID = "soldesk";
        int PW =251216;

        //고객
        String name = JOptionPane.showInputDialog("아이디");
        // String password = JOptionPane.showInputDialog("비밀번호");
        if (ID.equals(name)) {
            int pass = Integer.parseInt(JOptionPane.showInputDialog("비밀번호"));
            if(PW == pass){
                System.out.println(ID + "님 환영합니다.");
           }else{
                System.out.println(ID + "비밀번호가 일치하지 않습니다.");
           } // in if
        }else{
            System.out.println(ID + "일치하는 ID가 없습니다.");
        }
        // out if 
            
        


    }//main
}//class
