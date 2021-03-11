package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Ваша задача угадать число");
	System.out.println("Введите число отличное от 0");
    int a = scanner.nextInt();
    int number = (int)(Math.random()*a);//(int) обрезает дробную часть
    while(true){
        System.out.println("Угадайте число от 0 до " + a);
        int input_number = a= scanner.nextInt();
        if (input_number == number)
        {
            System.out.println("Вы угадали");
            break;
        }else if (input_number>number){
            System.out.println("Заданное число меньше");
        }else{ System.out.println("Заданное число больше");
        }
        }
scanner.close();
    }
}
