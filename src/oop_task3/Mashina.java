// завдання 3
package oop_task3;

import java.util.Scanner;
public class Mashina {
    int age;
    double speed;
    int weight;
    String color;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Vvedite vik mashini:");
        int age = sc.nextInt();

        System.out.print("\nVvedite shvidkost mashini:");
        double speed = sc.nextDouble();

        System.out.print("Vvedite vagu mashini:");
        int weight = sc.nextInt();

        System.out.print("Vvedite colir mashini:");
        String color = sc.next();

        Mashina mashina = new Mashina();

        Mashina mashina_1 = new Mashina(age);

        Mashina mashina_2 = new Mashina( age, speed);

        Mashina mashina_3 = new Mashina(age, speed, weight);

        Mashina mashina_4 = new Mashina(age, speed, weight, color);

    }
    // без аргументів
    public Mashina() {
        System.out.println("vikonavsya ekzemplyar bez argumentov");
    }
    // з одним агрументом
    public Mashina(int age) {
        this.age = age;
        System.out.println("vikonavsya ekzemplyar z 1 argumentom");
    }
    // з двома аргументами
    public Mashina(int age,double speed) {
        this.age = age;
        this.speed = speed;
        System.out.println("vikonavsya ekzemplyar z 2 argumentami");
    }
    public Mashina(int age,double speed,int weight) {
        this.age = age;
        this.speed = speed;
        this.weight = weight;
        System.out.println("vikonavsya ekzemplyar z 3 argumentami");
    }
    public Mashina(int age,double speed,int weight,String color) {
        this.age = age;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        System.out.println("vikonavsya ekzemplyar z 4 argumentami");
    }
}
