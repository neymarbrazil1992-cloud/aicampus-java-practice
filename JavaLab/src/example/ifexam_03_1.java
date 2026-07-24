package example;

import javax.swing.JOptionPane;

public class ifexam_03_1 {
    public static void main(String[] args) {
        
        int height = Integer.parseInt(JOptionPane.showInputDialog("신장을 입력하세요."));
    int rideGrade = Integer.parseInt(JOptionPane.showInputDialog(
        "놀이기구 등급을 입력하세요."
        + "1. 전체 관람가"
        + "2. 100cm 이상"
        + "3. 120cm 이상"
        + "4. 140cm 이상"
        + "5. 150cm 이상" ));
    
        if (height < 0 ) {
            JOptionPane.showMessageDialog(null, "잘못된 신장입니다.");
        } else if (rideGrade < 1 || rideGrade > 5) {
            JOptionPane.showMessageDialog(null, "잘못된 놀이기구 등급입니다.");
        } else if (rideGrade == 1) {
            JOptionPane.showMessageDialog(null, "해당 놀이기구 이용 가능합니다.");
        } else if (rideGrade >=2 && height >= 100) {
            JOptionPane.showMessageDialog(null, "해당 놀이기구 이용 가능합니다.");
            }
        } else if (rideGrade == 3) 
            {if (height >= 120) {
                JOptionPane.showMessageDialog(null, "해당 놀이기구 이용 가능합니다.");
            } else { JOptionPane.showMessageDialog(null, "안전상의 이유로 해당 놀이기구 이용이 불가합니다.");

            }
        } else if (rideGrade == 4) {
            if (height >= 140) {
                JOptionPane.showMessageDialog(null, "해당 놀이기구 이용 가능합니다.");
            }else {JOptionPane.showMessageDialog(null, "안전상의 이유로 해당 놀이기구 이용이 불가합니다.");}
        } else if (rideGrade == 5) {
            if (height >= 150) {
                JOptionPane.showMessageDialog(null, "해당 놀이기구 이용 가능합니다.");
            }else {JOptionPane.showMessageDialog(null, "안전상의 이유로 해당 놀이기구 이용이 불가합니다.");}
        }else {
            JOptionPane.showMessageDialog(null, "잘못된 입력입니다! 다시 입력해주세요!");
        }
    }
}
