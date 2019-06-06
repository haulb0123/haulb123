package chuoivamang;

import java.util.Scanner;
 
class mang_trung_binh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n, sum = 0, number;
	        float avgNumber;
	        Scanner scanner = new Scanner(System.in);	         
	       
	        System.out.println("Nhập các số trung bình: ");
	        n = scanner.nextInt();	         	       
	        for (int count = 1; count <=n; count++) {
	            System.out.println("Nhập số thứ " + count + ": ");
	            number = scanner.nextInt();
	            sum += number;
	        }	         
	        avgNumber = (float) sum / n;
	        System.out.println("Trung bình  = " +(avgNumber));
	    }

}
