package interface1;

public class HinhTron implements HinhHoc{
	public double PI,R;
	public HinhTron(double PI, double R){
		this.PI= PI;
		this.R= R;
	}
	
	public  double dt(){
		return PI*R*R;
	}
	
	public double cv() {
		// TODO Auto-generated method stub
		return 2*PI*R;
	}
	
	public void println() {
		System.out.println( "dien tich hinh tron: "+ dt());
		System.out.println( "chu vi hinh tron: "+ cv());
	}
}
