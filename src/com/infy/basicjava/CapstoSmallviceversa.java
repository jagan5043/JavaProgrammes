package com.infy.basicjava;

public class CapstoSmallviceversa {

	public static void main(String[] args) {
		String str = "KaMaKShi LoVEs jaGAn";
		StringBuffer sb = new StringBuffer(str);
		
		for(int i=0;i<str.length();i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				sb.setCharAt(i, Character.toLowerCase(str.charAt(i)));
			}
			else if(Character.isLowerCase(str.charAt(i))) {
				sb.setCharAt(i, Character.toUpperCase(str.charAt(i)));
			}
		}
		
		System.out.println(sb);

	}

}
