package com.abhtri2009;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicTabbedPaneUI;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String b = s.nextLine();
		String r ="";
		 r = reverse(b,r);
		System.out.println(r);
	}
	
	public static String reverse(String b,String r) {
		if(b.length()>1) {
			 r= reverse(b.substring(1, b.length()),r);
			  return r=r+b.substring(0,1);
		}
		else {
			r = r + b;
			return r;
		}
	}

}
