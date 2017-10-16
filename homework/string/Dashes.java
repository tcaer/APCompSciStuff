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

	public boolean isConstant(String s) {
	  int len = s.length();
	  if(len <= 1)
	    return true;
	  String s1 = s.substring(0, len-1);
	  String s2 = s.substring(1);
	  return s1.equals(s2);
	}

	public int indexOf(char ch, int fromPos){ //you could also pass your string as an argument
	 if (fromPos < 0)
	  return -1;
	 for(int i = fromPos; i < length(); i++)
	   if(charAt(i) == ch)
	     return i;
	 return -1;
	}
	
}