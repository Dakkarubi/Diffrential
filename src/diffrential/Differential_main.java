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
		System.out.println("f(x)=x^2のx="+a+"における微分係数は"+r);
		System.out.println("f(x)=x^2のx="+a+"における数値微分は"+d);
		System.out.println("f(x)=x^2のx="+a+"における相対誤差は"+dlib.relative(r,d));
		System.out.println("f(x)=x^2のx="+a+"における最小の相対誤差は"+dlib.experiment()+"またその時のhは"+dlib.showh());
		
	}

}
