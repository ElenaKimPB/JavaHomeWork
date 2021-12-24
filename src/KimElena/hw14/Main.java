package KimElena.hw14;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        Thread server = new Thread(new MultiThreadServer());
        Thread client = new Thread(new SimpleClient());

        server.start();
        client.start();

    }
}
