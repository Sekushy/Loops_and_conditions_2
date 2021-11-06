package com.company;

public class Main {

    public static void main(String[] args) {
        int age = 12;
        // Height is measured in CM
        int height = 160;
        boolean isPermitted = false;

        // && - SI; TRUE TRUE - TRUE; TRUE FALSE - FALSE; FALSE TRUE - FALSE; FALSE FALSE - FALSE;
        // || - SAU; TRUE TRUE - TRUE; TRUE FALSE - TRUE; FALSE TRUE - TRUE; FALSE FALSE - FALSE;
        if(age >= 18 || height > 150) {
            System.out.println("You may pass.");
            isPermitted = true;
        } else {
            System.out.println("You shall not pass!");
        }

        // ! - NOT/NEGARE ; TRUE -> !TRUE -> FALSE; FALSE -> !FALSE -> TRUE;
        if(!isPermitted) {
            System.out.println("You are permitted to enter.");
        }

        // LOOPS/BUCLE
        int sum = 0;
        for (int i = 1; i <= 100000; i++) {
            System.out.println("Value of i: " + i);
            sum = sum + i;
            System.out.println("Sum is equal to: " + sum);
        }

        sum = 0;
        while(sum == 0) {
            int i = 1;
            i = i + 2;
            sum = sum + i;
            System.out.println("Value of sum in while: " + sum);
        }

        do {
            int i = 1;
            i = i + 2;
            sum = sum + i;
            System.out.println("Value of sum in do while: " + sum);
        } while(sum == 0);

        // LIST / ARRAY / VECTORI
        // [] - pozitie
        // () - parametrii
        // {} - atribuire de valori intr-un vector
        int [] numbersArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < 9; i++) {
            System.out.print("Value of i is " + i + " and the array is being called as numbersArray[" + i + "] with a value of: ");
            System.out.println(numbersArray[i]);
        }
    }
}
