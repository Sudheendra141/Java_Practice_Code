package JuneLongOne2022Division3;

import java.util.*;
public class EQUALSTRING {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int t;
		    Scanner s=new Scanner(System.in);
		    t=s.nextInt();
		    
		    while(t>0)
		    {
		       
		     int l=s.nextInt();
		     String a=s.next();
		     String b=s.next();
		     HashSet<Character> hm=new HashSet<>();
		     for(int i=0;i<l;i++)
		     {
		    	 if(b.charAt(i)!=a.charAt(i))
		    		 hm.add(b.charAt(i));
		     }
		     
		      
		        t--;
		        System.out.println(hm.size());
		    }

	}

}
