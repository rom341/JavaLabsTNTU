package org.example.Lab2;


import java.util.Scanner;

/*
ВАРІАНТ 1

В одновимірному масиві, що складається з N дійсних елементів, обчислити:

суму від'ємних елементів масиву;
добуток елементів масиву, що розташовані між максимальним і мінімальним елементами.
впорядкувати елементи масиву за зростанням.
 */
public class Task2 {
    public static void main(String[] args) {
        int arrSize;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lab2 Part2\nEnter size of your array: ");
        arrSize = scanner.nextInt();
        double[] inputArray = new double[arrSize];

        //fill array with values
        System.out.println("Enter " + arrSize + " elements of your array");
        for (int i = 0; i < arrSize; i++) {
            inputArray[i] = scanner.nextDouble();
        }

        //sort array
        double temp;
        for (int i = 0; i < arrSize - 1; i++) {
            if (inputArray[i] > inputArray[i + 1]) {
                temp = inputArray[i + 1];
                inputArray[i + 1] = inputArray[i];
                inputArray[i] = temp;
                i =- 1;
            }
        }

        //print sorted array and get results
        double sumOfUnderZeroElements = 0;
        double dobutokElementivMizMinIMax = 1;
        System.out.println("Sorted array");
        for(int i=0;i < arrSize; i++)
        {
            System.out.println(inputArray[i]);

            if(inputArray[i]<0)
                sumOfUnderZeroElements+=inputArray[i];
            if(i!=0 && i!=arrSize-1)
                dobutokElementivMizMinIMax*=inputArray[i];
        }
        System.out.println("Sum of values <0: " + sumOfUnderZeroElements);
        System.out.println("Dobutok of values, that (min < X < max): " + dobutokElementivMizMinIMax);
    }
}
