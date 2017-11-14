package diffrential;

public class Differential_lib implements Differential_if {
	private double a, h;
	
	public Differential_lib(double a, double h) {
		this.a = a;
		this.h = h;
}

	@Override
	public double getRx() {
		// TODO Auto-generated method stub
		return 2*this.a;
	}

	@Override
	public double getDx() {
		// TODO Auto-generated method stub
		return (Math.pow(this.a+this.h, 2)-Math.pow(this.a, 2))/h;
	}


	public double relative(double a,double b) {
	
		double tValue=a,mValue=b;
		
		return Math.abs(tValue-mValue)/tValue*100;
	}

	public double experiment() {
		double k,tmp;
		k=relative(getRx(),getDx());
		while(true) {
			
			this.h=this.h/10;
			
			tmp=relative(getRx(),getDx());
			if(k>=tmp){
				k=tmp;
					}
					else break;
		}
		this.h=this.h*10;
		return k;
	}
	public double showh() {
		return this.h;
	}
}