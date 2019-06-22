package interface1;

public class Main1 {

public static void main(String[] args) {
	
	HinhHoc htg = new HinhTamGiac(10.0,15.0, 10.0);
	htg.println();
	HinhHoc hcn = new HinhChuNhat(10.0,5.0);
	hcn.println();
	HinhHoc hbh = new HinhBinhHanh(10.0,5.0,7.0);
	hbh.println();
	HinhHoc ht = new HinhTron(3.14,5.0);
	ht.println();
	HinhHoc hv = new HinhVuong(5.0);
	hv.println();
}
}
