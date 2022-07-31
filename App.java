package JavaWeek5;

public class App {
	
	public static void main(String[] args) {
	SpacedLogger log = new SpacedLogger();
	AsteriskLogger asterisk = new AsteriskLogger();
				
	String test = "Hello guys";
	log.Log(test);
	log.Error(test);
				
	asterisk.Log(test);
	asterisk.Error(test);
	}
}
