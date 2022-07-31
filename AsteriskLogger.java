package JavaWeek5;

public class AsteriskLogger implements Logger {
	@Override
	public void Log(String str) {
		System.out.println("***"+str+"***");
	}
	
	
	@Override
	public void Error(String error) {
		String log = "***Error: "+error+"***";
		String temp="";
		int logLength = log.length();
		for(int i = 0;i<logLength;i++) {
			temp+="*";
		}
		System.out.println(temp);
		System.out.println("***Error: "+error+"***");
		System.out.println(temp);
	}
}
