
public class App {

	public static void main(String[] args) {
		
		Logger AsteriskLogger = new AsteriskLogger();
		AsteriskLogger.log("be awesome");
		System.out.println(" ");
		AsteriskLogger.error("Your too awesome");
		System.out.println("");
		System.out.println("");
		
		Logger SpacedLogger = new SpacedLogger();
		SpacedLogger.log("Read this slowly");
		System.out.println(" ");
		SpacedLogger.error("you read it too slowly");
	
	
		
	}

}
