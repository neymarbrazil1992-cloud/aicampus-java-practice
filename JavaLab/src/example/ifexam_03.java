package example;

import javax.swing.JOptionPane;

public class ifexam_03 {
    public static void main(String[] args) {
     //사용자의 나이와 영화 등급을 입력받아 영화 관람 여부를 출력하세요
     //영화등급 1.전체 관람가 2.12세이상 3.15세 이상 4.19세 이상    
    // 나이가 0보다 작으면 "잘못된 나이입니다"
    //영화 등급 1부터 4가 아니라면 "잘못된 영화 등급 입니다."
    //영화 등급에 맞는 나이 이상이면 관람할수 있습니다.
    //나이가 부족하면 관람할수 없습니다.

    int age = Integer.parseInt(JOptionPane.showInputDialog("나이를 입력하세요."));
    int movieGrade = Integer.parseInt(JOptionPane.showInputDialog(
        "영화 등급을 입력하세요."
        + "1. 전체 관람가"
        + "2. 12세 이상"
        + "3. 15세 이상"
        + "4. 19세 이상" ));
    
        if (age < 0 ) {
            JOptionPane.showMessageDialog(null, "잘못된 나이임니다.");
        } else if (movieGrade < 1 || movieGrade > 4) {
            JOptionPane.showMessageDialog(null, "잘못된 영화 등급입니다.");
        } else if (movieGrade == 1) {
            JOptionPane.showMessageDialog(null, "1레벨 영화 관람할 수 있습니다.");
        } else if (movieGrade == 2 && age >= 12) {
            JOptionPane.showMessageDialog(null, "2레벨 영화 관람할 수 있습니다.");
            // } else { JOptionPane.showMessageDialog(null, "영화를 관람할 수 없습니다.");

            // }
        } else if (movieGrade == 3 && age >= 15) {
            JOptionPane.showMessageDialog(null, "3레벨 영화 관람할 수 있습니다.");
            // } else { JOptionPane.showMessageDialog(null, "영화를 관람할 수 없습니다.");
            // }
        } else if (movieGrade == 4 && age >= 19) {
            JOptionPane.showMessageDialog(null, "4레벨 영화 관람할 수 있습니다.");
            
        }else {
            JOptionPane.showMessageDialog(null, "해당 영화를 관람할 수 없습니다!");
        }

        // else if (age >= 12 && movieGrade <= 2){System.out.println("12세 이상 영화관람 가능");}
        

    }//main
}//class
