package Java.HW1;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) { 
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите первое число: ");
            int num1 = scanner.nextInt();
            System.out.print("Введите второе число: ");
            int num2 = scanner.nextInt();
            int result = num1 / num2;
            System.out.println("Результат деления числа " + num1 + " на число " + num2 + " равен " + result);
            } catch (ArithmeticException e) {
            System.out.println("Деление на ноль недопустимо"); 
            }
            System.out.println("Завершение работы"); 
        }

}    