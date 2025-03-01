// Импортирование класса Scanner для Задачи1.
import java.util.Random;
// Импортирование класса Random для Задачи 2.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Задача 1.
        // Создание объекта input для класса Scanner:
        Scanner input= new Scanner(System.in);
        System.out.print("Задача 1.\n" + "Введите возраст человека: ");
        //Считывание возраста в переменную input(целое число):
        short age = input.nextShort();
        if (age >= 18) {
            System.out.println("Если возраст человека равен "
                    + age + ", он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен "
                    + age + " Он не достиг совершеннолетия, нужно немного подождать.");
        }

        //Задача 2.
        System.out.println("\nЗадача 2");
        // Генерирую случайное число от - 40 до 40:
        int airTemperature;
        byte min = -40;
        byte max = 40;
        Random rn = new Random();
        int randomNumber = rn.nextInt(max - min + 1) + min;
        airTemperature = randomNumber;
        if (airTemperature < 5) {
            System.out.println("На улице " + airTemperature + " градусов," +
                    "нужно надеть шапку.");
        } else {
            System.out.println("На улице " + airTemperature + " градусов, можно идти без шапки!");
        }

        // Задача 3.
        System.out.println("\nЗадача 3");
        int carSpeed;
        randomNumber = rn.nextInt(0, 200 + 1);
        carSpeed = randomNumber;
        if (carSpeed > 60) {
            System.out.println("Если скорость " + carSpeed + " км/ч, " +
                    "то прийдётся заплатить штраф");
        } else {
            System.out.println("Если скорость " + carSpeed + " км/ч, " +
                    "то можно ездить спокойно");
        }
        // Задача 4.
        System.out.print("\nЗадача 4.\nВведите возраст человека от 2х лет: ");
        // Используем объект input для класса Scanner, созданный в Задаче 1.
        // Использую целочисленную переменную age, созданную в Задаче 1.
        age = input.nextByte();
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен "
                    + age + ", то ему нужно ходить в детский сад.");
        } else if (age < 18) {
            System.out.println("Если возраст человека равен "
                    + age + ", то ему нужно ходить в школу.");
        } else if (age <= 24) {
            System.out.println("Если возраст человека равен "
                    + age + ", то ему нужно ходить в университет.");
        } else {
            System.out.println("Если возраст человека равен "
                    + age + ", то ему нужно ходить на работу.");
        }

        // Задача 5.
        System.out.print("\nЗадача 5.\nВведите возраст ребёнка: ");
        String conditionYes = "Да";
        String condition;
        age =  input.nextByte();
                if (age<5) {
            System.out.println("Если возраст ребёнка равен "
                    + age + ", то ему нельзя кататься на аттракционе.");
        } else if (age<14) {
                    System.out.println("Если возраст ребёнка равен "
                            + age + ", то он может кататься на аттракционе в сопровождении взрослого.");
                    System.out.print("Есть ли с Вами взрослый сопровождающий? Да/Нет: ");
                    input.nextLine();
                    condition = input.nextLine();
                    //System.out.println(condition);
                    if (condition.isEmpty()) {
                        System.out.println("Вы не ответили на вопрос." +
                                "Вы НЕ можете кататься на аттракционе");
                        } else if (condition.equalsIgnoreCase(conditionYes)) {
                        System.out.println("Можете кататься на аттракционе в сопровождении взрослого");
                    } else {
                        System.out.println("Вы НЕ можете кататься на аттракционе");
                    }
                }else {System.out.println("Можно кататься на аттракционе без сопровождения взрослого");
                }
        // Задача 6.
        byte seatingCapacity = 60;
        byte totalPlaces  = 102;
        int totalOccupiedPlaces;
        System.out.println("\nЗадача 6.");
        randomNumber = rn.nextInt(0, totalPlaces + 1);
        totalOccupiedPlaces = randomNumber;
        System.out.println("Количество занятых мест в вагоне = "+totalOccupiedPlaces);
        if((totalPlaces-totalOccupiedPlaces)!=0) {
            if ((totalPlaces - totalOccupiedPlaces) <= (totalPlaces - seatingCapacity)) {
                System.out.println("Количество свободных стоячих мест в вагоне = "
                        + (totalPlaces - totalOccupiedPlaces));
            } else {
                System.out.println("Количество свободных сидячих мест = "
                        + (seatingCapacity - totalOccupiedPlaces) + "\nКоличество свободных стоячих мест = " +
                        (totalPlaces - seatingCapacity ));
            }
        } else{ System.out.println("Свободных мест нет");
        }
        // Задача 7.
        int one;
        int two;
        int three;
        System.out.print("\nЗадача 7.\nВведите число one: ");
        one = input.nextInt();
        System.out.print("Введите число two: ");
        two = input.nextInt();
        System.out.print("Введите число three: ");
        three = input.nextInt();
        if (one==two&& two==three) {System.out.println("Числа равны!");
        }else if (one>two && one>three)
        {System.out.println("Число one = "+one+" большее из введённых чисел");
        } else if (two>one && two>three)
        {System.out.println("Число two = "+two+" большее из введённых чисел");
        }else {
            System.out.println("Число three = " + three + " большее из введённых чисел");
        }
    }
}


