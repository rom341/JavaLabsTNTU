package org.example.Lab2;

import java.util.Random;
import java.util.Scanner;
/*
1. Впорядкувати за зростанням масив табличних значень функції sin(x),

x - згенероване псевдовипадкове число з рівномірним розподілом у діапазоні від [0;1)
 */
public class Task1 {
    public static void main(String[] args) {

        int arrSize;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lab2 Part1\nEnter size of result array: ");
        arrSize = scanner.nextInt();
        double[] argumentArray = new double[arrSize];
        double[] resultArray = new double[arrSize];
        Random rand = new Random();
        //fill array with values
        for(int i = 0; i < arrSize; i++)
        {
            argumentArray[i] = rand.nextDouble(1);
            resultArray[i] = Math.sin(argumentArray[i]);
            System.out.println((i + 1) + "/" + arrSize + ") X:" + argumentArray[i] + "\t\tsin(x):" + resultArray[i]);
        }

        double temp; //temporary variable for swapping
        //sort array (bubble sort)
        for(int i = 0; i < arrSize - 1; i++)
        {
            if(resultArray[i] > resultArray[i + 1])
            {
                //swapping sin(x) values
                temp = resultArray[i + 1];
                resultArray[i + 1] = resultArray[i];
                resultArray[i] = temp;

                //swapping x values
                temp = argumentArray[i + 1];
                argumentArray[i + 1] = argumentArray[i];
                argumentArray[i] = temp;

                i = -1;//-1 because after finishing this iteration, i will increase by 1 and become 0
            }
        }


        System.out.println("\n\n\nSorted arrays");
        //print sorted arrays
        for(int i = 0; i < arrSize; i++)
        {
            System.out.println((i + 1) + "/" + arrSize + ") X:" + argumentArray[i] + "\t\tsin(x):" + resultArray[i]);
        }
    }
}