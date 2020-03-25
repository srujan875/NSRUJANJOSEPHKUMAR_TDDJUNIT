package com.epam.tddjunittesting;


public class RemoveChars 
{
	public String remove(String string) {

    	
    	StringBuilder result=new StringBuilder();
    	for(int i=0;i<string.length();i++)
    	{
    		if(!((i==0 || i==1) && (string.charAt(i)=='A' || string.charAt(i)=='a')))
    		{
    			result.append(string.charAt(i));
    		}
    	}
    	return result.toString();
	
}}
