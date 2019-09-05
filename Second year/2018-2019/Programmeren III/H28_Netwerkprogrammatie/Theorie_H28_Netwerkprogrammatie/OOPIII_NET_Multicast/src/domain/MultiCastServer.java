package domain;

import java.io.*;
import java.net.*;
import java.security.SecureRandom;
import java.util.*;

public class MultiCastServer {

    protected DatagramSocket socket = null;
    protected BufferedReader in = null;
    protected boolean moreQuotes = true;

    public MultiCastServer() throws IOException {
        socket = new DatagramSocket(4445);
        try {
            in = new BufferedReader(new FileReader("one-liners.txt"));
        } catch (FileNotFoundException e) {
            System.err.println("Could not open quote file. Serving time instead.");
        }
    }

    public void run() {
        System.out.println("Server running");
        SecureRandom random = new SecureRandom();
        String dString;
        while (moreQuotes) {
            try {
                if (in == null) {
                    dString = new Date().toString();
                } else {
                    dString = getNextQuote();
                }
                byte[] buf = dString.getBytes();

                InetAddress group = InetAddress.getByName("230.0.0.1");
                DatagramPacket packet = new DatagramPacket(buf, buf.length, group, 4446);
                socket.send(packet);
                try {
                    Thread.sleep(random.nextInt(3000) +2000);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            } catch (IOException e) {
                e.printStackTrace();
                moreQuotes = false;
            }
        }
        socket.close();
    }

    private String getNextQuote() {
        String returnValue;
        try {
            if ((returnValue = in.readLine()) == null) {
                in.close();
                moreQuotes = false;
                returnValue = "No more quotes. Goodbye.";
            }
        } catch (IOException e) {
            returnValue = "IOException occured in server.";
        }
        return returnValue;
    }
}
