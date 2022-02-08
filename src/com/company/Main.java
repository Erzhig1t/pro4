package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double num1 = getNumber();
        double num2 = getNumber();
        char operation = getOperation();
        double result = calc(num1, num2, operation);
        System.out.println("Result:"+result);
        }
        public static double getNumber(){
        Scanner sc = new Scanner(System.in);
            System.out.println("San kirgiz");
            if(sc.hasNextDouble()) {
                return sc.nextDouble();
            }else{
                System.out.println("Kata kirgizdiniz. Kayradan kirgizip korunuz");
                return getNumber();
            }
        }
        public static char getOperation(){
        Scanner sc = new Scanner(System.in);
            System.out.println("Amaldardyn birin tandanyz");
            int operationNumber = 0;
            if(sc.hasNext()) {
                operationNumber = sc.nextInt();
            }else{
                System.out.println("Siz san kirgizbediniz. kaytalanyz");
                return getOperation();
            }
            switch (operationNumber){
                case 1:
                    return '+';
                case 2:
                    return '-';
                case 3:
                    return '*';
                case 4:
                    return '/';
                default:
                    System.out.println("tuura emes oparation. kaytalanyz");
                    return getOperation();

            }

        }
        public static double add(double num1, double num2){
        return num1+num2;
        }
        public static double sub(double num1, double num2){
        return num1-num2;
        }
        public static double mul(double num1, double num2){
        return num1*num2;
        }
        public static double div(double num1, double num2){
        if(num2!=0.0) {
            return num1 / num2;
        }else{
            System.out.println("0go boluugo bolboyt");
            return Double.NaN;
          }
        }
        public static double calc(double num1, double num2, char opation){
        switch (opation){
            case '+':
                return add(num1, num2);
            case '-':
                return sub(num1, num2);
            case '*':
                return mul(num1, num2);
            case '/':
                return div(num1, num2);
            default:
                return Double.NaN;
        }

    }
}








