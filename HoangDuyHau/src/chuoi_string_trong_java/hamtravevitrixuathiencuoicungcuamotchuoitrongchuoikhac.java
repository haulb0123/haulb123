package chuoi_string_trong_java;

class hamtravevitrixuathiencuoicungcuamotchuoitrongchuoikhac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int result;
		    String string1 = "Happy new year and new year!";
		    String string2 = "new year!";
		         
		    result = string1.lastIndexOf(string2);
		    System.out.println("Vị trí cuối cùng xuất hiện chuỗi " + string2 + 
		        " trong chuỗi " + string1 + " = " + result);
		}
	}

