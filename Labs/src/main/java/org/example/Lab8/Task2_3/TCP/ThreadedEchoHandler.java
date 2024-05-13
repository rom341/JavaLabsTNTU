package org.example.Lab8.Task2_3.TCP;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ThreadedEchoHandler implements Runnable{
    private Socket incoming;

    public ThreadedEchoHandler(Socket incoming) {
        this.incoming = incoming;
    }

    public void run(){
        try (InputStream inStream = incoming.getInputStream();
             OutputStream outStream = incoming.getOutputStream()){

            Scanner in = new Scanner(inStream, "UTF-8");
            PrintWriter out = new PrintWriter(
                    new OutputStreamWriter(outStream, "UTF-8"),
                    true
            );

            out.println("Enter EXIT to exit");
            boolean done = false;
            while(!done && in.hasNextLine()){
                String inputLine = in.nextLine();
                String result = getResultString(inputLine);
                if(result.equals("EXIT")){
                    done = true;
                }
                else {
                    out.println("Echo: " + result);
                }
            }
        }
        catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
    private static String getResultString(String inputStr){
        if(inputStr.trim().toUpperCase().equals("EXIT"))
            return "EXIT";

        String[] splitedStr = inputStr.split(" ");
        boolean isBothValueNumeric = isNumeric(splitedStr[0]) && isNumeric(splitedStr[1]);
        if(splitedStr.length != 2 || !isBothValueNumeric)
            return inputStr;

        int num1 = Integer.parseInt(splitedStr[0]);
        int num2 = Integer.parseInt(splitedStr[1]);

        int sum = num1 + num2;
        return Integer.toString(sum);
    }
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
