package com.epam.java8_lambda_features;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Task_3 {
	public static List<String>getPalindrome(List<String>s)
	{
		ListIterator<String>it=s.listIterator();
		List<String>ans=new ArrayList<>();
		while(it.hasNext())
		{
			String str=it.next();
			if(isPalindrome(str))
			{
				ans.add(str);
			}
		}
		return ans;
	}
	public static boolean isPalindrome(String s)
	{
		int i=0,j=s.length()-1;
		while(i<j)
		{
			if(s.charAt(i)!=s.charAt(j))
			{
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	public static void main(String args[])
	{
	  	Scanner sc=new Scanner(System.in);
	  	int n=sc.nextInt();
	  	String a[]=new String[n];
	  	List<String>li=new ArrayList<String>(n);
	  	for(int i=0;i<n;i++)
	  	{
	  		a[i]=sc.next();
	  		li.add(a[i]);
	  	}
	  	List<String>result=getPalindrome(li);
	  	System.out.println(result);
	}
}
