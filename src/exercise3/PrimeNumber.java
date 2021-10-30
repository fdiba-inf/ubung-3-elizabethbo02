package exercise3;

import java.util.Scanner;

public class PrimeNumber {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
   int number = input.nextInt();
   int divider = 2;
   boolean prime = true;

   while(number > 2) {
   if (number != divider && number % divider == 0) {
    prime = false;
    break;

    }
    if(divider == 100) {
      break; 
    }

    divider++;
  }  
  System.out.println("Prime number: " + prime);
  }
  


}