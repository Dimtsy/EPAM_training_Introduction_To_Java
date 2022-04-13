package task6.studentArchive.server.server;
import task6.studentArchive.server.console.Console;

import javax.xml.stream.XMLStreamException;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
public class Server {
    public void startServer() {
        try (ServerSocket serverSocket = new ServerSocket(8081)) {

            System.out.println("Server started");
            while (true) {
                try (Socket socket = serverSocket.accept();
                     BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                     BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()))) {

                    System.out.println("Client " + socket.getInetAddress() + " connected");


                    Console console = Console.getInstance();

                    console.startConsole(reader, writer);

                }
            }
        } catch (IOException | XMLStreamException e) {
            e.printStackTrace();
        }
    }
}
