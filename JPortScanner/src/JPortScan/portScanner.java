package JPortScan;
import java.util.Scanner;

public class portScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner scanPort=new scanner();
		System.out.println("Insert ip or adress: ");
		Scanner input=new Scanner(System.in);
		String adressIp=input.next();
		scanPort.ipFinder(adressIp);
		scanPort.portScanning(adressIp);

	}

}
