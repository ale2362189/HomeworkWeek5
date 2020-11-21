
public class SpacedLogger implements Logger{
	
	 
	@Override
	public void log(String log) {		
		System.out.println(buildMsg(log));
		}
		
	@Override
	public void error(String error) {
		System.err.println("error: ".toUpperCase() + buildMsg(error.toUpperCase()));		
	}
	
	private String buildMsg(String log) {
		StringBuilder build = new StringBuilder();
		
		for (int i = 0; i < log.length(); i++) {
		char ch = log.charAt(i);
		build.append(ch).append(' ');
		}
		
		build.setLength(build.length() - 1);
		return build.toString();
	}
}