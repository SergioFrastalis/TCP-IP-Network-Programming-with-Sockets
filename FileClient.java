package gr.aueb.cf.ch25.hw;

import java.io.*;
import java.net.*;

public class FileClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 1234);
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        // Example file path
        out.println("/path/to/requested/file.txt");

        String response;
        while ((response = in.readLine()) != null) {
            System.out.println(response);
        }
    }
}
