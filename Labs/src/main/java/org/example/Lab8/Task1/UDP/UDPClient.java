package org.example.Lab8.Task1.UDP;

import java.net.*;
import java.util.Scanner;

public class UDPClient {
    private static int[] GetTwoIntFromKeyboard(){
        Scanner scanner = new Scanner(System.in);
        int[] output = new int[2];

        output[0] = scanner.nextInt();
        output[1] = scanner.nextInt();

        return output;
    }
    public static void main(String[] args) {
        DatagramSocket socket = null;

        try {
            socket = new DatagramSocket();

            InetAddress IPAddress = InetAddress.getByName("localhost");
            int port = 9999;

            int[] values = GetTwoIntFromKeyboard();
            String sentence = values[0] + " " + values[1];
            System.out.printf("Converted to string: %s\n", sentence);
            byte[] sendData = sentence.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, port);
            socket.send(sendPacket);

            byte[] receiveData = new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            socket.receive(receivePacket);

            String modifiedSentence = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println("Отримано відповідь: " + modifiedSentence);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (socket != null) {
                socket.close();
            }
        }
    }
}
