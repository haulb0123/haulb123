package HÀM;
import java.util.*;
class random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
			    Random rd = new Random();  
			    int number = rd.nextInt(); 
			    System.out.println("So vua duoc sinh ra la " + number);
			         
			    int number1 = rd.nextInt(4); 
			    System.out.println("So vua duoc sinh ra la " + number1);
			    int number2 = -4 + rd.nextInt(4);   
			    System.out.println("So vua duoc sinh ra la " + number2);
			}			
	}

