package com.company;

import java.util.Scanner;

/*
 * Artiukh Mihail, #2
 */
public class Main {
    /*
     *В массиве хранится информация о баллах, полученных
     * спортсменом-десятиборцем в каждом из десяти видов спорта.
     * Для выхода в следующий этап соревнований общая сумма баллов
     * должна превысить некоторое известное значение. Определить,
     * вышел ли данный спортсмен в следующий этап соревнований.
     * .*/


    private static void task24() {
        System.out.println("task24");
        Scanner scanner = new Scanner(System.in);
        double[] points = new double[10];
        double sum = 0;
        System.out.println("input points: ");
        for (int i = 0; i < 10; i++) {
            points[i]= scanner.nextDouble();
        }
        System.out.print("n = ");
        double n = scanner.nextDouble();

        System.out.println("input points: ");
        for (int i = 0; i < 10; i++) {
            sum+=points[i];
        }
        if (sum/10>n){
            System.out.println("SUCCESS");
        }else {
            System.out.println("fault");
        }
        System.out.println();
    }

    /*
     Задана последовательность N вещественных чисел.
      Вычислить значение выражения .

     */
    private static void task49() {
        System.out.println("task 49");
        Scanner scanner = new Scanner(System.in);
        System.out.print("N = ");
        int N = scanner.nextInt();
        float[] array = new float[10];
        float pr = 1;
        System.out.println("input array: ");
        for (int i = 0; i < N; i++) {
           array[i]=  scanner.nextFloat();
        }
        for (int i = 0; i < N; i++) {
            pr *= array[i];
        }

        System.out.println(Math.pow(Math.abs(pr),(float) 1/N));
        System.out.println();
    }

    /*
     Дана последовательность вещественных чисел а1, a2, ..., а15.
     Определить, есть ли в последовательности отрицательные числа.
     В случае положительного ответа определить порядковый номер первого из них.
     */
    private static void task74() {

    }

    /*
    Удалить элемент массива целых чисел больший куба
     первого элемента этого массива. Если таких элементов нет,
     выдать сообщение «удаление не произведено», иначе удалить
     последний элемент из найденных.

     */
    private static void task99() {

    }

    /*
    Последовательность а1, а2, ..., an состоит из нулей и единиц.
    Поставить в начало этой последовательности нули, а затем единицы.

     */
    private static void task124() {



    }

    public static void main(String[] args) {
        task24();
        task49();
        task74();
        task99();
        task124();
    }
}
