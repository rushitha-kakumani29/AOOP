package Java;

import java.util.Scanner;

class volt{
	private int volts;
	public volt(int v) {
		this.volts = v;
	}
	public int getVolts() { 		// to return how many volts we're using
		return volts;
	}
	public void setVolts(int volts) { 		//to set volts for corresponding device(mobile,laptop..etc) 
		this.volts = volts;
	}
}
class Socket{
	public volt getVolt() {
		return new volt(120);
	}
}
interface SocketAdapter{
	public volt get120Volt();
	public volt get12Volt();
	public volt get3Volt();
}

class SocketClassAdapter extends Socket implements SocketAdapter{
	public volt get120Volt() {
		return getVolt();
	}
	public volt get12Volt() {
	   volt v = getVolt();
		return ConvertVolt(v,10);
	}
	private static volt ConvertVolt(volt v,int i) {
		return new volt(v.getVolts() / i);
	}
	public volt get3Volt() {
		 volt v = getVolt();
		return ConvertVolt(v,40);
	}
}
public class AdaptivePatternDemo {
	public static void main(String[] args) {
		SocketAdapter sa = new SocketClassAdapter();
		volt v120 = sa.get120Volt(); 		// for laptop  the number of volts required
		volt v12 = sa.get12Volt();			// for mobile the number of volts required
		volt v3 = sa.get3Volt();			// for normal phone(keypad phone) the number of volts required
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter either (laptop / mobile/ cell phone): ");
		String s = sc.next();
		if(s.equalsIgnoreCase("laptop")) {
			System.out.println("For laptop: ");
			System.out.println(v120.getVolts()+ " volts");
		} else if(s.equalsIgnoreCase("Mobile")) {
			System.out.println("For mobile: ");
			System.out.println(v12.getVolts() + " volts");
		} else if(s.equalsIgnoreCase("Cell phone")) {
			System.out.println("For cell phone: ");
			System.out.println(v3.getVolts() + " volts");
		} 		

	}

}
