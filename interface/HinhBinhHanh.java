package interface1;

public class HinhBinhHanh implements HinhHoc {
	public double canhlon,canhbe,chieucao;
	public HinhBinhHanh(double canhlon, double canhbe, double chieucao){
		this.canhlon= canhlon;
		this.canhbe= canhbe;
		this.chieucao= chieucao;
	}
	
	public  double dt(){
		return canhlon*chieucao;
	}
	
	public double cv() {
		// TODO Auto-generated method stub
		return (canhlon+canhbe)*2;
	}
	
	public void println() {
		System.out.println( "dien tich hinh binh hanh: "+ dt());
		System.out.println( "chu vi hinh binh hanh: "+ cv());
	}
}
