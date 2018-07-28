package practice.java;

import java.util.HashMap;

public class CharOccurrence 
{

	public static void main(String[] args)
    {
        String s = "Anusha";
        HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
        s=s.toLowerCase();
        char[] strArray=s.toCharArray();
        
        for(char c:strArray)
        {
        	if(hm.containsKey(c))
        		hm.put(c, hm.get(c)+1);
        	else
        		hm.put(c, 1);
        }
        System.out.println(hm);    
    }

}
