package JavaWeek5;

public class AsteriskLogger implements Logger {
	@Override
	public void Log(String str) {
		System.out.println("***"+str+"***");
	}
	
	
	@Override
	public void Error(String error) {
		String log = "****************";
		System.out.println(log);
		System.out.println("***Error: "+error+"***");
		System.out.println(log);
	}
}
