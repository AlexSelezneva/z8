/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z88;

import java.util.Scanner;

/**
 *
 * @author wWw
 */
public class Z88 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // prog — число созданное программой
        // user — число введённое пользователем
        int prog, user;
        // Генерируем случайное целое число от 1 до 10
        do{
        prog = (int)(Math.random() * 21) - 10;
        }while (prog == 0);
        System.out.println("Я загадала число от -10 до 10, отгадайте его.");
        System.out.print("Вводите ваше число: ");
        Scanner input = new Scanner(System.in);  
        int k = 0;
        // Проверяем, есть ли в потоке ввода целое число
        if( input.hasNextInt() ) {
            do {
                // Читаем с потока ввода целое число
                user = input.nextInt();
                if(user == prog) {k = k + 1 ;
                    System.out.println("Вы угадали!");
                } else {
                    // Проверяем, входит ли число в отрезок [1;10]
                    if (user > -10 && user <= 10) {k = k + 1;
                        System.out.print("Вы не угадали! ");
                        if (prog < 0){System.out.print(" Число должно быть отрицательным.");}
                        else {System.out.print(" Число должно быть  положительным.");}
                       
                        // Если число загаданное программой меньше...
                        if( prog < user ) {
                            System.out.println("Моё число меньше.");
                        } else {
                            System.out.println("Моё число больше.");
                        }
                    } else {System.out.println("вы введи число не из этого отрезка");
                    break;}
                }
            } while( user != prog );
        } else {
            System.out.println("Ошибка. Вы не ввели целое число!");
        }
        System.out.println("До свиданья!");
        System.out.println(k);
    }

        // TODO code application logic here
    }
    

