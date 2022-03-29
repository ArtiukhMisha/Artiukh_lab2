package com.company;

import java.util.Scanner;
import java.util.Arrays;
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
        float[] array = new float[N];
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
        System.out.println("task74");

        Scanner scanner = new Scanner(System.in);
        float[] array = new float[10];
        byte a = 0;
        System.out.println("input array: ");
        for (int i = 0; i < 10; i++) {
            array[i]=  scanner.nextFloat();
        }
        for (int i = 0; i < 10; i++) {
            if (array[i]<0) {
                System.out.println("num = " + (i+1));
                a = 1;
                return;
            }
        }

        if (a==0){
            System.out.println("otsutstvuet");
        }
        System.out.println();
    }

    /*
    Удалить элемент массива целых чисел больший куба
     первого элемента этого массива. Если таких элементов нет,
     выдать сообщение «удаление не произведено», иначе удалить
     последний элемент из найденных.

     */
    private static void task99() {
        System.out.println("task99");

        Scanner scanner = new Scanner(System.in);
        float[] array = new float[10];
        float[] newArray = new float[array.length-1 ];
        byte a = 0;
        System.out.println("input array: ");
        for (int i = 0; i < 10; i++) {
            array[i]=  scanner.nextFloat();
        }

        for (int i = 9; i >=0; i--) {
            if (array[i]>array[0]*array[0]) {
                a = (byte) i;
                break;
            }
        }
        if (a==0){
            System.out.println("удаление не произведено");
        }else {
            System.arraycopy(array, 0, newArray, 0, a);
            System.arraycopy(array, a + 1, newArray, a, array.length-(a+1));
            System.out.println(   Arrays.toString(newArray));
        }
        System.out.println();
    }

    /*
    Последовательность а1, а2, ..., an состоит из нулей и единиц.
    Поставить в начало этой последовательности нули, а затем единицы.

     */
    private static void task124() {
        System.out.println("task 124");
        Scanner scanner = new Scanner(System.in);
        System.out.print("N = ");
        byte N = scanner.nextByte();
        byte[] array = new byte[N];

        byte a=0;
        for (int i = 0; i < N; i++) {
            array[i]=  scanner.nextByte();
        }
        for (byte i = 0; i < N; i++) {
            if (array[i] == 0){
            a+=1;
            }
        }
        for (byte i = 0; i < a; i++) {
            array[i] = 0;
        }
        for (byte i = a; i < N; i++) {
            array[i] = 1;
        }
        for (int i = 0; i < N; i++) {
            System.out.print(array[i]+"  ");
        }
    }

    public static void main(String[] args) {
        task24();
        task49();
        task74();
        task99();
        task124();
    }
}
