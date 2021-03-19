package kr.ac.kopo.day9;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringUtil su = new StringUtil();
		
		System.out.println(su.isUpperChar('A'));
		System.out.println(su.isLowerChar('a'));
		System.out.println(su.max(1, 2));
		System.out.println(su.min(1, 2));
		System.out.println(su.reserve("abcdefg"));
		System.out.println(su.toUpperString("abcdefg"));
		System.out.println(su.toLowerString("ABCDEFG"));
		System.out.println(su.checkChar("AACCCAA", 'A'));
		System.out.println(su.removeChar("ABCDEFG", 'B'));
		
	}

}
