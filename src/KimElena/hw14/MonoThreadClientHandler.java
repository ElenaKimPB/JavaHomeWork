package KimElena.hw14;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MonoThreadClientHandler implements Runnable {

    private static Socket clientDialog;
    SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public MonoThreadClientHandler(Socket client) {
        MonoThreadClientHandler.clientDialog = client;
    }

    @Override
    public void run() {

        try {
            DataOutputStream out = new DataOutputStream(clientDialog.getOutputStream());


            DataInputStream in = new DataInputStream(clientDialog.getInputStream());
            System.out.println("DataInputStream created");

            System.out.println("DataOutputStream  created");

            while (!clientDialog.isClosed()) {
                System.out.println("Server reading from channel");

                String entry = in.readUTF();

                System.out.println("READ from clientDialog message - " + entry);

                if (entry.equalsIgnoreCase("exit")) {

                    System.out.println("Клиент инициализирует отключение ...");
                    out.writeUTF("Ответ сервера - " + entry + " - OK");
                    Thread.sleep(1000);
                    break;
                }

                System.out.println("Попытка сервера");
                out.writeUTF("Ответ сервера - " +formater.format(new Date()) +" "+ entry + " - OK");
                System.out.println("Сообщение клиенту");

                out.flush();

            }

            System.out.println("Клиент отключен");
            System.out.println("Закрытие подключений и каналов");

            in.close();
            out.close();

            clientDialog.close();

            System.out.println("Закрытие подключений и каналов - ГОТОВО.");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

