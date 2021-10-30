package exercise3;

import java.util.Scanner;

public class NumberCounter {
  
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int positiveNumbers = 0;
    int negativeNumbers = 0;
    double sum = 0;

  System.out.println("Enter number: ");
  int number = input.nextInt();
  while (number != 0){
    if (number > 0){
      positiveNumbers++;
    }else {
      negativeNumbers++;
    }
    sum = sum + number;
    
    System.out.println("Enter number: ");
    number = input.nextInt();
    }
  double average = sum / (positiveNumbers + negativeNumbers);

  System.out.println("Positive numbers: " + positiveNumbers);
  System.out.println("Negative numbers: " + negativeNumbers);
  System.out.println("Sum: " + sum);
  System.out.println("Average: " + average);



  }


}