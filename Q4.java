package Recursion;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(mylength("hey",0)); ;
	}
	public static int mylength(String s,int index) {
		if(index>=s.length()) {
			return 0;
		}
		return 1+mylength(s,index+1);
	}

}
