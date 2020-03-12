package com.company;
import java.util.Scanner;
public class Main {

 public static void main(String[] args) {
     testOddness();

 }
 public static void testOddness(){
     //todo eor odd
     // todo keep number contained
     // todo get the last digit
     // we want to find out if the number is even or odd
     Scanner Keybord  ;

     Keybord = new Scanner( System.in);
     System.out.println("give a posteive number ");

      Keybord =new Scanner(System.in);
      int number =Keybord.nextInt();

     System.out.println("Number is odd:  " + (number % 2 != 0));


 }
}