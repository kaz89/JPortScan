package JPortScan;
import java.net.*;

public class scanner {
 public void portScanning(String ip) {
	 for(int i=1;i<=65535;i++) {
		 try {
			 Socket connectSocket=new Socket();
			 connectSocket.connect(new InetSocketAddress(ip,i),100);
			 connectSocket.close();
			 System.out.println(ip+" address has port "+i+" open");
			 
		 }catch(Exception e) {
			
	 }
   }
  }
 public  void ipFinder(String ip) {
	 String finalIp = null;
	 try {
	InetAddress realIp=InetAddress.getByName(ip);
	finalIp=realIp.getHostAddress();
	System.out.println("The ip of the host is: "+finalIp);
 }catch(Exception e) {
	 
 }
 }
}
