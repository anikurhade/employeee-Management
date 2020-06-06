import java.util.Scanner;

public class address {
	static Scanner sc= new Scanner(System.in);
	private String Landmark;
	private String City;
	private String State;
	private int pinCode;
	public address(String landmark, String city, String state, int pinCode) {
		super();
		Landmark = landmark;
		City = city;
		State = state;
		this.pinCode = pinCode;
	}
	public String getLandmark() {
		return Landmark;
	}
	public String getCity() {
		return City;
	}
	public String getState() {
		return State;
	}
	public int getPinCode() {
		return pinCode;
	}
	public String toString()
	{
		return ""+Landmark+" , "+City+" , "+State+" , "+pinCode;
	}
	public static address getaddr()
	{
		System.out.println("\t\t\t\t\t ------------------ Address Details -----------------");
		System.out.print("\n\t\t\t\t\t *  Enter Landmark  :- ");
		String Landmark=sc.next();
		System.out.println("\t\t\t\t\t ----------------------------------------------------");
		System.out.print("\n\t\t\t\t\t *  Enter City  :- ");
		String City=sc.next();
		System.out.println("\t\t\t\t\t ----------------------------------------------------");
		System.out.print("\n\t\t\t\t\t *  Enter State  :- ");
		String State=sc.next();
		System.out.println("\t\t\t\t\t ----------------------------------------------------");
		System.out.print("\n\t\t\t\t\t *  Enter Pincode  :- ");
		int pinCode=sc.nextInt();
		address a1=new address(Landmark, City, State, pinCode);
		return a1;
		
	}
}
