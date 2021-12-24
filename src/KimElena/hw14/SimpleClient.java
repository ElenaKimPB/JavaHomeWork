package KimElena.hw14;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

class SimpleClient implements Runnable {

    @Override
    public void run() {
        boolean exit = false;
        String message;
        Socket socket = null;
        try {
            socket = new Socket("localhost", 3345);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try
                (DataOutputStream oos = new DataOutputStream(socket.getOutputStream());
                 DataInputStream ois = new DataInputStream(socket.getInputStream())) {

            Thread.sleep(1000);

            while (!exit) {

                System.out.println("Напишите Серверу (для выхода - exit)");
                Scanner scanner = new Scanner(System.in);
                message = scanner.nextLine();

                oos.writeUTF(message);
                oos.flush();

                Thread.sleep(10);
                System.out.println("Клиент написал и ждет ответа от сервера.....");

                System.out.println("reading...");
                String in = ois.readUTF();
                System.out.println(in);
                if ("exit".equalsIgnoreCase(message)) {
                    exit = true;
                }
            }

            socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                socket.close();
            } catch (IOException e) {

                e.printStackTrace();
            }
        }
    }
}

