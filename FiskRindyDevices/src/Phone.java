
public class Phone extends Device {
	
	public void callingFeature() {
		System.out.println("Call Connected");
		battery -= 5;
		status();
	}
	
	public void gamingFeature() {
		System.out.println("Let us play a game!");
		battery -= 20;
		status();
	}
	
	public void chargingFeature() {
		System.out.println("Charging");
		battery += 50;
		status();
	}
}
