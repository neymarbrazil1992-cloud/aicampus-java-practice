package chapter05;

import java.util.Scanner;

public class Pastry_Main {
    
//main 이 있는곳 에서 객체를 만들어야함 



public static void main(String[]args){

Pastry_09 bread = new Pastry_09();

bread.makeBread();
bread.makeBread(3);
bread.makeBread(3,"크림");

bread.order();



}//main





}//class
