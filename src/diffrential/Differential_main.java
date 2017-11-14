package diffrential;

import java.util.Scanner;

public class Differential_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r,d;
		Scanner scan = new Scanner(System.in);
		System.out.print("Input value of  a> ");
		double a = Double.parseDouble(scan.next());
		System.out.print("Input value of h> ");
		double h = Double.parseDouble(scan.next());
		Differential_lib dlib = new Differential_lib(a,h);
		r=dlib.getRx();
		d=dlib.getDx();
		System.out.println("f(x)=x^2‚Ìx="+a+"‚É‚¨‚¯‚é”÷•ªŒW”‚Í"+r);
		System.out.println("f(x)=x^2‚Ìx="+a+"‚É‚¨‚¯‚é”’l”÷•ª‚Í"+d);
		System.out.println("f(x)=x^2‚Ìx="+a+"‚É‚¨‚¯‚é‘Š‘ÎŒë·‚Í"+dlib.relative(r,d));
		System.out.println("f(x)=x^2‚Ìx="+a+"‚É‚¨‚¯‚éÅ¬‚Ì‘Š‘ÎŒë·‚Í"+dlib.experiment()+"‚Ü‚½‚»‚Ì‚Ìh‚Í"+dlib.showh());
		
	}

}
