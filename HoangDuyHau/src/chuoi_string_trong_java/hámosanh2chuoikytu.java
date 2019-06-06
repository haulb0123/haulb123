package chuoi_string_trong_java;

class hámosanh2chuoikytu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int result;
		    String string1 = "Happy new year!";
		    String string2 = "Happy new year!";
		         
		    result = string1.compareTo(string2);
		    if (result == 0) {
		        System.out.println("Chuỗi " + string1 + " = " + string2);
		    } else if (result < 0) {
		        System.out.println("Chuỗi " + string1 + " < " + string2);
		    } else {
		        System.out.println("Chuỗi " + string1 + " > " + string2);
		    }
		}
	}


