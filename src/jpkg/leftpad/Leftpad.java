package jpkg.leftpad;

public final class Leftpad {
	public static final char DEFAULT_PAD_CHAR = ' ';
	
	public static final String leftpad(String str, int len, char ch) {
		StringBuilder sb = new StringBuilder();
		
		int j = len - str.length();
		
		for(int i = 0; i < j; i++) 
			sb.append(ch);
		sb.append(str);
		
		return sb.toString();
	}
	
	public static final String leftpad(String str, int len) {
		return leftpad(str, len, DEFAULT_PAD_CHAR);
	}
	
	public static void main(String[] args) {
		System.out.println("Leftpad Module Main!");
	}
}
