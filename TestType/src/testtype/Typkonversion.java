package testtype;

public class Typkonversion {

	public static void main(String[] args) {
		byte b1 = 10, b2 = 20;
		short p = 200;
		int n = 500;
		long q = 100;
		float x = 2.5f;
		double y = 5.25;
		
		int aa = b1+b2;
		System.out.println("aa = " + aa);
		
		int bb = p+b1;
		System.out.println("bb = " + bb);
		
		int cc = b1*b2;
		System.out.println("cc = " + cc);
		
		long dd = q+p*(b1+b2);
		System.out.println("dd = " + dd);
		
		float ee = x+q*n;
		System.out.println("ee = " + ee);
		
		float ff = b1*q/x;
		System.out.println("ff = " + ff);
		
		double gg = b1*q*2./x;
		System.out.println("gg = " + gg);
		
		float hh = b1*q*2.f/x;
		System.out.println("hh = " + hh);

	}

}
