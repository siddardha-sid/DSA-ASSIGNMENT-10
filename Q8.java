package Recursion;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="aeiou";
int count=0;

System.out.println(countConsonants(s,count));

	}
	public static int countConsonants(String s,int index) {
		if(index>=s.length()) {
			return 0;
		}
		
		char c=s.charAt(index);
		if(Character.isLetter(c) && isVowel(c)) {
			return 1+countConsonants(s,index+1);
		}
		return countConsonants(s,index+1);
	}
	public static boolean isVowel(char c) {
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
			return false;
		}else {
			return true;
		}
	}
		

}
