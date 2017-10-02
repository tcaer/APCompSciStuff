public class Dashes {

	public static void main(String[] args) {
		String cleaned = removeDashes("987-65-4321");
		System.out.println(cleaned);
		System.out.println(scroll("TESKETI"));
	}

	public static String removeDashes(String data) {
		String cleaned = data.replace("-", "");

		return cleaned;
	}

	public static String scroll(String data) {
		char lastChar = data.charAt(0);
		String newString = data.substring(1);
		newString += lastChar;

		return newString;
	}
	
}