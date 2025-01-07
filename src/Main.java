import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nHomework " + "\"conditional operator\"");

        System.out.println("\nTask 1");

        int age = 12;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }

        System.out.println("\nTask 2");

        int temperature = 7;
        if (temperature < 5) {
            System.out.printf("На улице " + temperature + " градусов, нужно надеть шапку. %n");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        }

        temperature = 4;
        if (temperature < 5) {
            System.out.printf("На улице " + temperature + " градусов, нужно надеть шапку. %n");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        }

        System.out.println("\nTask 3");

        int speed = 40;
        if (speed > 60) {
            System.out.printf("Если скорость " + speed + ", то придется заплатить штраф. %n");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно.");
        }

        speed = 80;
        if (speed > 60) {
            System.out.printf("Если скорость " + speed + ", то придется заплатить штраф. %n");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно.");
        }


        System.out.println("\nTask 4");

        int age1 = 5;
        if (age1 >= 2 && age1 <= 6) {
            System.out.printf("Если возраст человека равен %s, то ему нужно ходить в детский сад.%n", age1);
        }
        if (age1 >= 7 && age1 <= 17) {
            System.out.printf("Если возраст человека равен %s, то ему нужно ходить в школу.%n", age1);
        }
        if (age1 >= 18 && age1 <= 24) {
            System.out.printf("Если возраст человека равен %s, то ему нужно ходить в университет.%n", age1);
        }
        if (age1 > 24) {
            System.out.printf("Если возраст человека равен %s, то ему нужно ходить на работу.%n", age1);
        }

        System.out.println("\nTask 5");

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите возраст ребенка: ");
        int childAge = scan.nextInt();
        if (childAge < 5) {
            System.out.printf("Если возраст ребенка равен %s, то ему нельзя кататься на аттракционе.%n", age);
        }
        if (childAge >= 5 && childAge <= 14) {
            System.out.printf("Если возраст ребенка равен %s, то ему можно кататься на аттракционе только в сопровождении взрослого.%n", age);
        }
        if (childAge > 14) {
            System.out.printf("Если возраст ребенка равен %s, то ему можно кататься на аттракционе без сопровождения взрослого.%n", age);
        }

        System.out.println("\nTask 6");

        int wagonCapacity = 102;
        int seatingAmount = 60;

        Scanner scan1 = new Scanner(System.in);
        System.out.print("Введите количество пассажиров: ");
        int passenger = scan1.nextInt();

        if (passenger <= seatingAmount) {
            System.out.println("Есть сидячие места.");
        } else if (passenger <= wagonCapacity) {
            System.out.println("Есть стоячие места.");
        } else {
            System.out.println("Вагон полностью забит.");
        }

        System.out.println("\nTask 7");

        int one = 1;
        int two = 2;
        int three = 3;

        boolean isOneGreatest = (one > two) && (one > three);
        boolean isTwoGreatest = (two > one) && (two > three);
        boolean isThreeGreatest = (three > one) && (three > two);

        if (isOneGreatest) {
            System.out.println("Переменная one наибольшая.");
        } else if (isTwoGreatest) {
            System.out.println("Переменная two наибольшая.");
        } else if (isThreeGreatest) {
            System.out.println("Переменная three наибольшая.");
        }


    }
}