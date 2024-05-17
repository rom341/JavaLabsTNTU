package org.example.Lab8.Task8.UDP;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.*;

public class UDPClient {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Roman\\Desktop\\Збірка завдань\\СБ 21\\Симестр 2\\Java\\JavaLabsTNTU\\Labs\\src\\main\\resources\\birb.png");
        System.out.printf("File exists: %b\n", file.exists());

        byte[] data = new byte[1024];
        try (FileInputStream fr = new FileInputStream(file);
             DatagramSocket dSocket = new DatagramSocket()) {

            InetAddress address = InetAddress.getLocalHost();
            DatagramPacket packet;

            int bytesRead;
            while ((bytesRead = fr.read(data)) != -1) {
                packet = new DatagramPacket(data, bytesRead, address, 9999);
                dSocket.send(packet);
            }

            // Пустий пакет щоб показати серверу, що все відправлено
            packet = new DatagramPacket(new byte[0], 0, address, 9999);
            dSocket.send(packet);

            System.out.println("File sent!");
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}