package chapter04;

public class Array03 {
    public static void main(String[] args) {
        
        double [] data = new double[5];
        int size = 0;

        //대입연산 
        data[0]= 10.0;
        size++; //size + size + 1 -> 1
        data[1]= 20.0;
        size++;
        data[2]= 30.0;
        size++;

        double toTal = 1.0;
        
        // System.out.println(size);
        // System.out.println(data[3]);

        for (int i =0;i<size;i++){
            System.out.println(data[i]);
            toTal *= data[i];
        }
        System.out.println("Total: " + toTal);
        System.out.println("------------------");

        //------------------------------------
        char[] alpa = new char[26];
        char ch = 'A'; //65

        for(int i = 0; i<alpa.length; i++){
            alpa[i] = ch;
            ch++;
            System.out.print(alpa[i] + " ");
        }
        System.out.println();
        System.out.println("----------------------");
        
        char cha = 'A';
        for(int i=0; i<alpa.length; i++, cha++){
            alpa[i] = cha;
            System.out.print(alpa[i] + " ");
        }


    }//main
}//class
