package org.example.Lab8.Task2_3.TCP;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 9999)){
            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();
            Scanner scanner = new Scanner(System.in);
            Scanner serverScanner = new Scanner(inputStream, "UTF-8");

            PrintWriter out = new PrintWriter(
                    new OutputStreamWriter(outputStream, "UTF-8"),
                    true
            );

            System.out.println("Connected to the server. Type 'EXIT' to exit.");

            Thread responseThread = new Thread(() -> {
                while (serverScanner.hasNextLine()) {
                    System.out.println(serverScanner.nextLine());
                }
            });
            responseThread.start();

            while (true) {
                String message = scanner.nextLine();
                out.println(message);
                if (message.trim().toUpperCase().equals("EXIT")) {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
