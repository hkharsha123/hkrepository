package com.spacejetframework;

import java.util.HashSet;

public class CompareString {

	public static void main(String[] args) {
		String s = "this is fun show";
		String s1 = "fun tv show";
		
		String[] ss1 = s.split(" ");
		String[] ss2 = s1.split(" ");
		
		for(int i=0;i<ss1.length;i++)
		{
			int c=0;
			for(int j=0;j<ss2.length;j++)
			{
				if(ss1[i].equals(ss2[j]))
				{
					c++;
				}
				
			}if(c==0) {
				System.out.print(ss1[i]+" ");
			}
			
		}
		for(int i=0;i<ss2.length;i++)
		{
			int d=0;
			for(int j=0;j<ss1.length;j++)
			{
				if(ss2[i].equals(ss1[j]))
				{
					d++;	
				}
			}if(d==0) {
				System.out.print(ss2[i]+" ");
				
			}	
		}
	}

}
