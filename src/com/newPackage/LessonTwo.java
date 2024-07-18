package com.newPackage;
import java.sql.SQLOutput;
import java.util.Scanner;

public class LessonTwo {


//Задать число (от 0 до 9999) и вывести в консоль количество тысяч, сотен, десятков и единиц.


    /*
        public static void main(String[] args) {
            int a=9999;
            int b=a/1000;
            int c=(a/100)%10;
            int d=(a/10)%10;
            int e=a%10;
            System.out.println("tisyachi " + b);
            System.out.println(b);
            System.out.println("sotni "+c);
            System.out.println(c);
            System.out.println("desyatki "+d);
            System.out.println(d);
            System.out.println("edinicy "+e);
            System.out.println(e);

        }


    public static void main(String[] args) {
        //Напишите программу, которая сравнивает два числа и пишет в консоль какое из этих чисел больше или меньше
        int a = 10;
        int b = 10;
        if (a>b){
            System.out.println("a>b");
        } else if (b>a) {
            System.out.println("b>a");
        } else  {
            System.out.println("b=a");
        }

    }
    */
    public static void main(String[] args) {
        //Напишите программу, которая проверяет делится ли одно число на второе без остатка.
        // В случает если деление не целочисленное, то вывести в консоль сообщение о целой части и об остатке от деления.
        /*
        int a = 10;
        int b = 6;
        int c = (a % b) % 10;
        int d = a/b;
        if (a % b == 0) {
            System.out.println("a delitsa na b bez ostatka");
        } else if (a % b != 0) {
            System.out.println("a delitsa na b s  ostatkom");
            System.out.println("ostatok ot delenya:  " + c + "   celaya chast: "+d);
        } else if(a/b==0){

            System.out.println("error");
        }

         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        if (num2 != 0) {
            if (num1 % num2 == 0) {
                System.out.println(num1 + "  can devide by " + num2 + "  without remainder  ");
            } else {
                int quotient = num1/num2;
                int remainder = num1 % num2;
                System.out.println(" Integer part "+quotient);
                System.out.println(" Remainder "+remainder);

            }


        } else {
            System.out.println("Error, can't devide by zero");
        }
    }
}