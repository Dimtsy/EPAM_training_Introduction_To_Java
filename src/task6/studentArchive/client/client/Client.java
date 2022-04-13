package task6.studentArchive.client.client;
import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
public class Client {
    public void startClient() {
        String[] line;
        try (Socket socket = new Socket("localhost", 8081);
             BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
             Scanner scanner = new Scanner(System.in)) {

            System.out.println("Вы успешно подключились к серверу!");

            while (true) {
                line =reader.readLine().split("/");
                for (String s : line) {
                    System.out.println(s);
                }
                writer.write(scanner.nextLine());
                writer.newLine();
                writer.flush();
            }

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
