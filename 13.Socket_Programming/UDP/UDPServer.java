import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {
    public static void main(String[] args) throws IOException {
        try (DatagramSocket socket = new DatagramSocket(9876)) {
            byte[] receivedData=new byte[1024];
            
            System.out.println("Waiting for client...");
            
            DatagramPacket receivedPacket=new DatagramPacket(receivedData, receivedData.length);
            socket.receive(receivedPacket);
            String msg=new String(receivedPacket.getData(), 0, receivedPacket.getLength());
            System.out.println("Clinet Says :" + msg);
            
            String res="Hello from the UDP server";
            
            byte[] sendData=res.getBytes();
            InetAddress clientADD=receivedPacket.getAddress();
            
            int clientPort=receivedPacket.getPort();
            
            DatagramPacket sendPacket=new DatagramPacket(sendData,sendData.length,clientADD,clientPort);
            
            socket.send(sendPacket);
        }
        
    }
}
