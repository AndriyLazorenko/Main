package ArtCode.Lessons.lesson7;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Master on 11-May-15.
 */
public class OldServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8888);
        while (true) {
            Socket client = ss.accept();
            OutputStream os = client.getOutputStream();
            PrintWriter pw = new PrintWriter(os);
            String message = String.format("ip %s, port %s, hello, client!", client.getInetAddress(), client.getPort());
            System.out.printf(message);
            pw.print(message);
            pw.flush();
        }
    }
}
