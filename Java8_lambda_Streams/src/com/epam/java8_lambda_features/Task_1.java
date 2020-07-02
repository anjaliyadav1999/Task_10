package com.epam.java8_lambda_features;
import java.util.*;
public class Task_1 {
	public static double average(List<Integer>list)
	{
		return list.stream().mapToInt(i->i).average().getAsDouble();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		List<Integer>li=new ArrayList<Integer>(n);
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			li.add(a[i]);
		}
		double res=average(li);
		System.out.println(res);
	}

}
