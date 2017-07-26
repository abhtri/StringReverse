package com.abhtri2009.graphs;

import java.util.Scanner;

public class Gridconnected {
	static boolean visited[];
	static int no,mo;
	static int a[][];
	static int ff(int i, int j) {
		
		if( i<0||j<0|| i>=no||j>=mo ||a[i][j]==0)
			return 0;
		a[i][j]= 0;
			return 1+ff(i-1,j-1)+ff(i-1,j)+ff(i-1,j+1)+ff(i,j-1)
					+ff(i,j+1)+ff(i+1,j-1)+ff(i+1,j)+ff(i+1,j+1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		visited = new boolean[n];
		int e=  s.nextInt();
		no=n;mo=e;
		a= new int[n][e];
		for(int i = 0;i<n;i++) {
			for(int j=0;j<e;j++) {
				a[i][j]=s.nextInt();
			}
		}
		int large=0;
		for(int i = 0;i<n;i++) {
			for(int j=0;j<e;j++) {
				large = Math.max(large, ff(i,j));
			}
			
		}
		System.out.println(large);
		
	}

}
