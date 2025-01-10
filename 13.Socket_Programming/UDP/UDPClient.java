
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class UDPClient{
    public static void main(String[] args) throws Exception {
        try (DatagramSocket socket = new DatagramSocket()) {
            InetAddress serverADD=InetAddress.getByName("localhost");
            
            
            //send a message to the servrer
            String msg="Hello from the UDP Client";
            byte[] sendData=msg.getBytes();
            
            DatagramPacket sendPacket=new DatagramPacket(sendData, sendData.length,serverADD,9876);
            socket.send(sendPacket);
            
            //receive the server response
            @SuppressWarnings("unused")
                    byte[] receivedData=new byte[1024];
            
            DatagramPacket receivedPacket=new DatagramPacket(sendData, sendData.length);
            
            socket.receive(receivedPacket);
            
            String response=new String(receivedPacket.getData(),0,receivedPacket.getLength());
            
            System.out.println("Server says : "+response);
        }
    }
}