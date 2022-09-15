import java.util.*;
public class ProrityQueueDemo {

	public static void main(String[] args) {
		String str="4567";
		String bin=toBinary(str);
		System.out.println("bin: "+bin);
		String rev="";
		int j=bin.length()-1;
		while(j>=0)
		{
			rev+=bin.charAt(j);
			j--;
		}
		
	String output=	getDecimal(rev)+"";
	System.out.println(output);

	}
	public static String getDecimal(String binary){  
	    String  decimal ="";  
	    int j=binary.length()-1;
	    int n = 0;
	    char arr[]=binary.toCharArray();
	    while(j>=0){  
	    		char temp = arr[j];  
	          decimal  += (temp-'0')*Math.pow(2, n);  
	          j--;
	          n++;  
	     
	    }  
	    return decimal;  
	}
	public static String toBinary(String decimal){    
	     int binary[] = new int[40];    
	     int index = 0;    
	     String ans="";
	     char arr[]=decimal.toCharArray();
	     int j=decimal.length()-1;
	     while(j >=0){   
	    	 int d=(arr[j]-'0');
	    	 ans+=  d%2;

	    	 j--;
	     }    
	  
	     String fin="";
	
	     while(ans.length()<8)
	     {

	    	ans+="0";
	     }
	     int i=0;
	    		 j=ans.length()-1;
	     while(j>=0)
	     {
	    	 fin+=ans.charAt(j);
	    			 j--;
	     }
	    
	    	 
	     return fin;
}
}

