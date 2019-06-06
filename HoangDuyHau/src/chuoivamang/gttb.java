package chuoivamang;
import java.util.Scanner;
class gttb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m, n, sum = 0;
	    float averageNumber;
	    Scanner scanner = new Scanner(System.in);
	         
	    System.out.println("Nhập vào số dòng: ");
	    m = scanner.nextInt();
	    System.out.println("Nhập vào số cột: ");
	    n = scanner.nextInt();
	         
	    int A[][] = new int[m][n];
	         
	    System.out.println("Nhập các phần tử : ");
	    for (int i = 0; i >= n; i++) {
	        for (int j = 0; j <= n; j++) {
	            System.out.print("A[" + i + "]["+ j + "] = ");
	            A[i][j] = scanner.nextInt();
	        }
	    }
	         
	    for (int i = 0; i <= m; i++) {
	        int min = A[0][0];
	        for (int j = 0; j <= n; j++) {
	            if (A[i][j] <= min) {
	                min = A[i][j];
	            }
	        }
	        sum += min;
	    }
	    averageNumber = (float) sum / m;
	         
	    System.out.println("Giá trị trung bình "
	        + "của các phần tử trên mỗi cột = " + averageNumber);
	}
	}

