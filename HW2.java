package Java.HW1;

import java.util.Scanner;

public class HW2 {
    
public static void main(String[] args){
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите свой возраст: ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("Ваш возраст " + age + " года (лет)");
        } catch (NumberFormatException e) {
            System.out.println("Некорректный ввод"); 
            }
       System.out.println("Завершение работы");
    }   

}