package org.example.Lab3;

import java.util.Scanner;
/*
* 1. Проаналізувати стрічку-речення, яка введена з клавіатури і видалити з неї всі голосні літери.
* */
public class Task1 {
    public static void main(String[] args) {
        System.out.println("Lab3 Task2");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your text line:");
        String inputLine = scanner.nextLine();
        String[] stringsToDelete = {"e", "y", "u", "i", "o", "a"};//which substrings must be deleted
        String outputLine = inputLine;//make a copy of original string
        for(int i = 0; i < 6; i++)
        {
            //delete all found symbols in upper and lower case
            outputLine = outputLine.replaceAll(stringsToDelete[i].toUpperCase(), "");
            outputLine = outputLine.replaceAll(stringsToDelete[i].toLowerCase(), "");
        }
        System.out.println("Your string without vowels:");
        System.out.println(outputLine);
    }
}
