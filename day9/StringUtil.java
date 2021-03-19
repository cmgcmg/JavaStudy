package kr.ac.kopo.day9;

//'A' ~ 'Z' = 65 ~ 90
// 'a' ~ 'z' = 97 ~ 122

public class StringUtil {

	public boolean isUpperChar(char c) {
		
		if((int)c >= 65 && (int)c <= 90) return true;
		
		return false;
	
	}
	
	public boolean isLowerChar(char c) {
		
		if((int)c >= 97 && (int)c <= 122) return true;
		
		return false;
	}
	
	public int max(int a, int b) {
		
		if(a > b) return a;
		
		return b;
	}
	
	public int min(int a, int b) {
			
			if(a > b) return b;
			
			return a;
	}
	
	public StringBuilder reserve(String str) {
		
		StringBuilder sb = new StringBuilder();
		
		
		
		for(int i = str.length() - 1; i >= 0; i--) {
			
			sb.append(str.charAt(i));
			
		}
	
		
		return sb;
	}
	
	public String toUpperString(String str) {
		
		String ans = "";
		
		for(int i = 0; i < str.length(); i++) {
			
			if((int)str.charAt(i) >= 97 && (int)str.charAt(i) <= 122) {
				
				ans = ans + (char)(str.charAt(i)- 32);
			}
			
			else ans = ans + str.charAt(i);
			
		}
		
		return ans;
	}
	
	public String toLowerString(String str) {
		
		String ans = "";
		
		for(int i = 0; i < str.length(); i++) {
			
			if((int)str.charAt(i) >= 65 && (int)str.charAt(i) <= 90) {
				
				ans = ans + (char)(str.charAt(i) + 32);
			}
			
			else ans = ans + str.charAt(i);
			
		}
		
		return ans;
	}
	
	public static int checkChar(String strData, char ch) {
		
		int ans = 0;
		
		for(int i = 0; i < strData.length(); i++) {
			if(strData.charAt(i) == ch) ans++;
		}
		
		
		return ans;
	}
	
	public static String removeChar(String oriStr, char delChar) {
		
		String ans = "";
		
		for(int i = 0; i < oriStr.length(); i++) {
			
			if(oriStr.charAt(i) == delChar) continue;
			
			else ans = ans + oriStr.charAt(i);
			
		}
		
		return ans;
		
	}
	
	
	
	
}
