package org.example.Lab8.Task1.UDP;

import java.net.*;

public class UDPServer {
    public static void main(String[] args) {
        DatagramSocket socket = null;

        try {
            socket = new DatagramSocket(9999);

            byte[] receiveData = new byte[1024];
            byte[] sendData = new byte[1024];

            while (true) {
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                socket.receive(receivePacket);

                String sentence = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("Отримано від клієнта: " + sentence);

                String[] numbersStr = sentence.split(" ");
                int num1 = Integer.parseInt(numbersStr[0]);
                int num2 = Integer.parseInt(numbersStr[1]);

                int sum = num1 + num2;

                InetAddress IPAddress = receivePacket.getAddress();
                int port = receivePacket.getPort();

                String response = Integer.toString(sum);
                sendData = response.getBytes();

                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, port);
                socket.send(sendPacket);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (socket != null) {
                socket.close();
            }
        }
    }
}
