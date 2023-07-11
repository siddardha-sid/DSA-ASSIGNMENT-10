package Recursion;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(power(9));
	}
	public static boolean power(int n) {
		if(n==1) {
			return true;
		}
		if(n==0 || n<0) {
			return false;
		}
		if(n%3!=0) {
			return false;
		}
		return power(n/3);
	}

}
