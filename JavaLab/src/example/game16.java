package example;

import java.util.Scanner;

public class game16 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("기본 공격력 입력: ");
        int power = sc.nextInt();

        Character[] characters = { new Warrior(), new Mage()};
        //->   Character characters1 = new Warrior();
        //     Character characters2 = new Mage();

        For (Character c : characters) {
            System.out.println(c.getClass().getSimpleName()+" 공격력 : "+c.attack(power));
        }

    }//main
}//class
