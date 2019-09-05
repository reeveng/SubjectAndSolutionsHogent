package domain;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MultiCastClient {

    public void run() throws IOException {
        MulticastSocket socket = new MulticastSocket(4446);
        InetAddress address = InetAddress.getByName("230.0.0.1");
        DatagramPacket packet;
        byte[] buf = new byte[256];
        socket.joinGroup(address);
        System.out.println("Client running");
        for (int i = 0; i < 5; i++) {
            packet = new DatagramPacket(buf, buf.length);
            socket.receive(packet);
            String received = new String(packet.getData(), 0, packet.getLength());
            System.out.println("Quote of the moment: " + received);
        }
        socket.leaveGroup(address);
        socket.close();
    }

}
