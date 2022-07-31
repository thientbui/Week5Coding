package JavaWeek5;

	public class SpacedLogger implements Logger {
		@Override
		public void Log(String str) {
			
			StringBuilder log = new StringBuilder();
			
			for (int i = 0; i < str.length(); i++) {
				log.append(str.charAt(i) + " ");
			}
			
			System.out.println(log);
			
		}
		
		
		@Override
		public void Error(String error) {
			SpacedLogger s = new SpacedLogger();
			System.out.print("Error: ");
			s.Log(error);
		}
	} 
