package com.epam.TDDTask;
import java.lang.String;

public class RemoveFirstTwoA {

	public Object removeA(String string) {
		String result="";
		
			for(int i=0;i<string.length();i++)
			{
				if(string.charAt(i)=='A' && i<2)
				{
					result+="";
				}
				else
				{
					
				   result+=""+string.charAt(i);
				}
			}
			
			
			return result;
			
		}
		
		
	}


