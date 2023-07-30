import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetworkingUseInetAddress {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("www.google.com");

            String ipAddress = "167.99.76.161";
            System.out.println("IP Address: " + ipAddress);

            String hostName = address.getHostName();
            System.out.println("Host Name: " + hostName);

            boolean reachable = address.isReachable(3000);
            System.out.println("Reachable: " + reachable);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
