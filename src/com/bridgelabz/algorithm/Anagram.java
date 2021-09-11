package com.bridgelabz.algorithm;

import java.util.Scanner;
import java.util.Arrays;
public class Anagram {
	
		public static void main(String ar[]){
              Scanner sc=new Scanner(System.in);
			System.out.println("Enter the first String");
			String first=sc.next();
			System.out.println("Enter second string");
			String second=sc.next();
			String angrams= Anagram.checkGivenStringAreAngramOrNot(first, second);
			System.out.println(angrams);
			sc.close();
			}
		
		 public static String checkGivenStringAreAngramOrNot(String first,String second)
		 {
			 String valueone="String Are angram";
			 String valuetwo="String are not angram";
			 
			    String firstone =first.replaceAll("\\s", "");
			      String secondone=second.replaceAll("\\s", "");
			      boolean status=true;
			      if(firstone.length()!=secondone.length())
			      {
			     
			     status=false;
			     
			      }
			      else{
			     
			     char one[]=firstone.toLowerCase().toCharArray();
			     char two[]=secondone.toLowerCase().toCharArray();
			     
			     Arrays.sort(one);
			     Arrays.sort(two);
			     status=Arrays.equals(one, two);
			      }

			if(status)
			{
	         return valueone;
	

			}
			else
			{
				return valuetwo;
			

			}

			 
		 }

}
