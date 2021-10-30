package exercise3;

import java.util.Scanner;

public class AngleCalculation {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter angle: ");
    double angle;
    char type;

    do {
      angle = input.nextDouble();
      type = input.next().charAt(0);

      if(type == 'r') {
        double convertedAngle = angle / Math.PI * 180;
        System.out.println("Angle: " + convertedAngle + "d");

      } else if(type == 'd') {
        double convertedAngle = angle * Math.PI / 180;
        System.out.println("Angle: " + convertedAngle + "r");
      }
  

    } while(type == 'r' || type == 'd'); 


  }

}