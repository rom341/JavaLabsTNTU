package org.example.Lab5.MainTask1;

import java.util.Scanner;

//variant 1
public class MainTask1 {
    private static final String pathForInput = "src/main/java/org/example/Lab5/MainTask1/MainTask1.txt";

    private static final String pathForOutput = "src/main/java/org/example/Lab5/MainTask1/MainTask1_Output.txt";
    private static Scanner consoleScanner;
    private static FileOperator fileOperator;
    private static FunctionProvider functionProvider;

    private static void printLegend()
    {
        for (int i = 0; i < AvailableFunctions.values().length; i++) {
            System.out.printf("%d - %s\n", i, AvailableFunctions.values()[i]);
        }
    }
    private static boolean runFunction(int id)
    {
        if(id < 0 || id >= AvailableFunctions.values().length) return false;

        switch (id)
        {
            case 0:
                System.out.println(fileOperator.readAllTextFromFile());
                break;
            case 1:
                System.out.println(functionProvider.fillFileManually(fileOperator) ? "Successfully" : "ERROR");
                break;
            case 2:
                System.out.println(functionProvider.removeExtraSpacesFromString(fileOperator.readAllTextFromFile()));
                break;
            case 3:
                System.out.println(functionProvider.firstLatterBecomeLastInEveryWord(fileOperator.readAllTextFromFile()));
                break;
            case 4:
                String readedText = fileOperator.readAllTextFromFile();
                readedText = functionProvider.removeExtraSpacesFromString(readedText);
                readedText = functionProvider.firstLatterBecomeLastInEveryWord(readedText);

                fileOperator.setFileName(pathForOutput);
                fileOperator.writeTextToFile(readedText);

                break;
            case 5:
                System.out.println("Enter text to add");
                String enteredText = consoleScanner.nextLine();
                System.out.println(functionProvider.addNewTextToFile(fileOperator, enteredText) ? "Successfully" : "ERROR");
                break;
            case 6:
                System.out.println("Enter the text to be replaced:");
                String target = consoleScanner.nextLine();
                System.out.println("Enter new text:");
                String newText = consoleScanner.nextLine();
                System.out.println(functionProvider.replaceTextInFile(fileOperator, target, newText) ? "Successfully" : "ERROR");
                break;
        }
        return true;
    }
    private static void startProcessingTask()
    {
        while(true)
        {
            System.out.println("Legend:");
            printLegend();
            System.out.println("To stop program - enter any other ID");
            System.out.println("Enter ID of function to use:");
            String chosenFunction = consoleScanner.nextLine();

            int chosenFunctionID = Integer.parseInt(chosenFunction);
            if (!runFunction(chosenFunctionID)) {
                break;
            }

            System.out.println("\n--------------REPEAT---------------\n");
        }
    }
    public static void main(String[] args) {
        consoleScanner = new Scanner(System.in);
        fileOperator = new FileOperator(pathForInput);
        functionProvider = new FunctionProvider();

        startProcessingTask();
    }
}
