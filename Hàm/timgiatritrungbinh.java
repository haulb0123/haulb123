package HÀM;
import java.util.*;
import java.text.DecimalFormat;
import java.util.Scanner;
class timgiatritrungbinh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
void calAvarage(float[] sconreTable, int lengthOfscoreTable)
{ 
	float sum = 0.0f;
	int i;
	for (i = 0;i< lengthOfscoreTable; i++ )
	{
         sum = sum + sconreTable[i];
}
	System.out.println("gia tri trung binh cua mang: "+ (sum/lengthOfscoreTable));
}
float [] x =new float[100];
calAvarage(x,100);
float [] x =new float[10];
calAvarage(x,10);
 
}
	
   System.out.println("Trung bình cộng = " + (sum/lengthOfscoreTable));
}	

