package HÀM;
import java.util.*;
class timmin_max_cuaabc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = new int [] {1,2,3,4,99,6,7,8,9,10};
		int min = numbers [0];
		int max = numbers[0];
		for (int i=0; i< numbers.length; i++) {
			 if(numbers [i]<min){
				min = numbers[i];
			}
			if(numbers[i]>max) {
				max = numbers[i];
			}
		 }
		System.out.println("gia tri nho nhat: "+min);
		System.out.println("gia tri lon nhat: "+max);
			}
		}

	


