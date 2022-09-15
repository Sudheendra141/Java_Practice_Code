package JuneLongOne2022Division3;
import java.util.*;
 public class ALTERADD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int t;
	    Scanner s=new Scanner(System.in);
	    t=s.nextInt();
	    while(t>0)
	    {
	    	int a=s.nextInt(),b=s.nextInt();
	    	int i=1;
	    	int dif=(b-a)%3;
	    	
	    	if(dif!=2)
	    	{
	    		System.out.println("YES");
	    	}
	    	else
	    	{
	    		System.out.println("no");
	    	}
	       
	     
	      
	        t--;
	        
	    }

	}

}
