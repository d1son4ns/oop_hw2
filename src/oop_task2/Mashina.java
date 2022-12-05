// завдання 2
package oop_task2;

import java.util.Scanner;
public class Mashina {
     int age;
     String color;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Vvedite rik mashini:");
        int age = sc.nextInt();
        System.out.print("\nVvedite kolir mashini:");
        String color = sc.next();

        Mashina mashina = new Mashina();

        Mashina mashina1 = new Mashina(age);

        Mashina mashina2 = new Mashina(age, color);

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
    public Mashina(int age,String color) {
        this.age = age;
        this.color = color;
        System.out.println("vikonavsya ekzemplyar z 2 argumentami");
    }
}
