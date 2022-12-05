// завдання 5
package oop_task5;

import java.util.Scanner;
 public class MyAreaCount {
     public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);

         System.out.print("Vvedite radius kola:");
         double radius = sc.nextDouble();

         System.out.println("Vasha ploshcha kola = " + MyArea.areaOfCircle(radius));
     }
     public class MyArea {
         static final double PI = 3.14;

         public static double areaOfCircle(double radius) {
             double S = (PI*Math.pow(radius,2));
             return S;}

     }
 }
