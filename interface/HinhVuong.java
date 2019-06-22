package interface1;

public class HinhVuong implements HinhHoc{
	public double canh;
	public HinhVuong(double canh){
		this.canh= canh;
	}
	public double dt(){
		return canh*canh;
	}
	public double cv() {
		// TODO Auto-generated method stub
		return canh*4;
	}
	public void println() {
		System.out.println( "dien tich hinh vuong: "+ dt());
		System.out.println( "chu vi hinh vuong: "+ cv());
	}

}
