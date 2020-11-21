
public class AsteriskLogger implements Logger {

	@Override
	public void log(String log) {
		System.out.println("***" + log + "***");
	}
	@Override
	public void error(String error) {
	    String msg = "***error: ".toUpperCase() + error.toUpperCase() + "***";
	    String border = "*".repeat(msg.length());
	    
	    System.err.println(border);
	    System.err.println(msg);
	    System.err.println(border);
	    
	}
}
