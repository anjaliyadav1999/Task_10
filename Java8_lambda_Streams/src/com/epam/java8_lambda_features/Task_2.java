package com.epam.java8_lambda_features;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task_2 {
	public static List<String> findElement(List<String>str)
	{
		return str.stream().filter(s->s.startsWith("a")).filter(s->s.length()==3).collect(Collectors.toList());
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
		List<String>result=findElement(li);
		System.out.println(result);
	}
}
