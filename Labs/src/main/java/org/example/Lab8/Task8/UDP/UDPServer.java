package org.example.Lab8.Task8.UDP;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {
    public static void main(String[] args) {
       File file = new File("C:\\Users\\Roman\\Desktop\\Збірка завдань\\СБ 21\\Симестр 2\\Java\\JavaLabsTNTU\\Labs\\src\\main\\resources\\DanceCactus1.png");
        System.out.printf("File exists: %b", file.exists());
        acceptFile(file, 9999, 1024);
    }

    private static void acceptFile(File file, int port, int packageSize){
        byte[] data = new byte[packageSize];
        DatagramPacket packet = new DatagramPacket(data, data.length);
        try(FileOutputStream os = new FileOutputStream(file)){
            DatagramSocket s = new DatagramSocket(port);

            s.setSoTimeout(60_000);
            while (true){
                s.receive(packet);
                os.write(data);
                os.flush();
            }

        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
