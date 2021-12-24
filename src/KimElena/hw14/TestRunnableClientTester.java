package KimElena.hw14;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class TestRunnableClientTester implements Runnable {

    static Socket socket;

    public TestRunnableClientTester() {
        try {

            socket = new Socket("localhost", 3345);
            System.out.println("Клиент подключен к сокету");
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {

        try (

                DataOutputStream oos = new DataOutputStream(socket.getOutputStream());
                DataInputStream ois = new DataInputStream(socket.getInputStream())) {
            System.out.println("Client oos & ois initialized");

            Scanner scanner  = new Scanner(System.in);
            oos.writeUTF(scanner.nextLine());

            oos.flush();

            Thread.sleep(10);
            System.out.println("Client wrote & start waiting for data from server...");

            System.out.println("reading...");
            String in = ois.readUTF();
            System.out.println(in);
            Thread.sleep(2000);

        } catch (IOException e) {

            e.printStackTrace();
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }
}

