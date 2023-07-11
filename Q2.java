package Recursion;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;
        System.out.println(lastRemaining(n));
	}
	public static int lastRemaining(int n) {
        int start = 0;
        int end = n - 1;
        int step = 1;
        boolean leftToRight = true;

        while (start < end) {
            if (leftToRight || (end - start) % (2 * step) == 0) {
                start += step;
            }
            end -= step;
            step *= 2;
            leftToRight = !leftToRight;
        }

        return start;
    }

}
