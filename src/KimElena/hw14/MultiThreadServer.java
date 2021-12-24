package KimElena.hw14;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreadServer implements Runnable{

    static ExecutorService executeIt = Executors.newFixedThreadPool(5);
    @Override
    public void run() {

        try (ServerSocket server = new ServerSocket(3345);
             BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
        ) {
            System.out.println("Серверный сокет создан, программа чтения командной консоли");

            while (!server.isClosed()) {

                if (br.ready()) {
                    System.out.println("Главный Сервер обнаружил какие-либо сообщения в канале");

                    String serverCommand = br.readLine();
                    if (serverCommand.equalsIgnoreCase("exit")) {
                        System.out.println("Main Server initiate exiting...");
                        server.close();
                        break;
                    }
                }

                Socket client = server.accept();
                DataInputStream in = new DataInputStream(client.getInputStream());

                executeIt.execute(new MonoThreadClientHandler(client));
                System.out.println("Connection accepted.");

            }

            executeIt.shutdown();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

