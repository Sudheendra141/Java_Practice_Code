import java.util.*;
public class RepeatedDnaSequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"));

	}
	 public static List<String> findRepeatedDnaSequences(String s) {
         List<String> al=new ArrayList<>();
        if(s.length()<10)
        {
            return al;
        }
        int i=0,j=0,n=s.length();
        HashMap<String,Integer> hm=new HashMap<>();
       
        String temp="";
        while(j<n)
        {
        	System.out.println("21");
            if(j<10)
            {
                while(j<10)
                {	System.out.println("25");
                    temp+=s.charAt(j);
                    j++;
                }
               hm.put(temp,1);
            }
            else
            {
                
                temp=temp.substring(1);
                temp+=s.charAt(j);
                
                if(hm.containsKey(temp))
                {
                    int x=hm.get(temp);
                    hm.put(temp,++x);
                }
                else
                {
                    hm.put(temp,1);
                }
                
                j++;
                i++;
            }
        }
        
        Iterator it=hm.entrySet().iterator();
        System.out.println(hm);
         while(it.hasNext())
         {
             Map.Entry mp=(Map.Entry)it.next();
             int c=(int)(mp.getValue());
             if(c>1)
             {
                 al.add((String)mp.getKey());
             }
         }
        return al;
    }

}
