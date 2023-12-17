
public class payload22 {
	
	
 static String bodyaddbook (String isbnvalue, String aislevalue) {
		
		String body1= "{\\r\\n\"\r\n"
				+ "			+ \"\\r\\n\"\r\n"
				+ "			+ \"\\\"name\\\":\\\"sa4asas\\\",\\r\\n\"\r\n"
				+ "			+ \"\\\"isbn\\\":\\\""+isbnvalue+"\\\",\\r\\n\"\r\n"
				+ "			+ \"\\\"aisle\\\":\\\""+aislevalue+"\\\",\\r\\n\"\r\n"
				+ "			+ \"\\\"author\\\":\\\"sdAzaahar\\\"\\r\\n\"\r\n"
				+ "			+ \"}";
		
		return body1;
		
	}

}
