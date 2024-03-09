package org.example.Lab3;

import java.util.Scanner;

/*
ВАРІАНТ 1
З клавіатури вводиться текстовий рядок. Скласти програму, яка підраховує кількість слів, які мають непарну довжину;
 виводить на екран частоту входження заданої літери;
 видаляє текст, що розміщено в круглих дужках.
 */
public class Task2 {
    public static void main(String[] args) {
        System.out.println("Lab3 Task2");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your text line:");
        String inputLine = scanner.nextLine();
        System.out.println("Enter char, that program need to count in your line:");
        String inputChar = scanner.nextLine().substring(0, 1);//get a first char in entered line

        int countOfUnpairedLengthWords = 0;//к-ть слів непарної довжини
        int countOfEntersInputChar = inputLine.length() - inputLine.replaceAll(inputChar, "").length();//частота входження заданого символу
        /*
        Пояснення до попереднього рядка: Наприклад маємо рядок "абабіва" і треба порахувати к-ть символів "а",
         тоді якщо від довжини основного рядка (7) відняти довжину рядка без заданого символа, тобто довжину "ббів" (4)
         ми отримаємо 7 - 4 = 3 - к-ть входжень заданого символа в рядок
        */

        //рахуємо к-ть слів непарної довжини
        String[] wordsInInputLine = inputLine.split(" ");//розділяємо введений рядок на слова (вважаю, що кожне слово роздилене пробілом)
        int wordsCount = wordsInInputLine.length;
        for (int i = 0; i < wordsCount; i++) {
            //Вважаю, що символ ".,:" і т.д. є частиною слова
            if (wordsInInputLine[i].length() % 2 == 1)
                countOfUnpairedLengthWords++;
        }

        //Видалимо текст в дужках
        String LineWithoutTextBetweenBrackets = inputLine;
        int IdOpenBracket = LineWithoutTextBetweenBrackets.indexOf("(");
        int IdCloseBracket = LineWithoutTextBetweenBrackets.indexOf(")");
        while (IdOpenBracket != -1 && IdCloseBracket != -1) {
            //if close brackets located earlier than open brackets i will repeat search
            if (IdCloseBracket < IdOpenBracket)
            {
                IdCloseBracket = LineWithoutTextBetweenBrackets.indexOf(")", IdCloseBracket + 1);
                continue;
            }
            //remove all text between brackets
            LineWithoutTextBetweenBrackets = LineWithoutTextBetweenBrackets.substring(0, IdOpenBracket)
                    + LineWithoutTextBetweenBrackets.substring(IdCloseBracket + 1);

            //find nex brackets
            IdOpenBracket = LineWithoutTextBetweenBrackets.indexOf("(");
            IdCloseBracket = LineWithoutTextBetweenBrackets.indexOf(")");
        }

        System.out.println("Кількість слів непарної довжини: " + countOfUnpairedLengthWords);
        System.out.println("Кількість входження заданого символу: " + countOfEntersInputChar);
        System.out.println("Ваш рядок без тексту в круглих дужках:");
        System.out.println(LineWithoutTextBetweenBrackets);
    }
}
