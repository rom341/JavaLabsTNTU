package org.example.Lab8.Task8.UDP;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class UDPClient {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Roman\\Desktop\\Збірка завдань\\СБ 21\\Симестр 2\\Java\\JavaLabsTNTU\\Labs\\src\\main\\resources\\DanceCactus1.png");
        System.out.printf("File exists: %b\n", file.exists());

            byte[] data = new byte[1024];
        try(FileInputStream fr = new FileInputStream(file);
            DatagramSocket dSocket = new DatagramSocket();)
        {

            InetAddress address = InetAddress.getLocalHost();
            DatagramPacket packet;

            int bytesRead;
            while ((bytesRead = fr.read(data)) != -1) {
                packet = new DatagramPacket(data, bytesRead, address, 9999);
                dSocket.send(packet);
            }
            System.out.println("File sended!");
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
