package com.abhtri2009.graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class evenTree {

	public static boolean  visited[];
	public static int g=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		visited = new boolean[n];
		int e=  s.nextInt();
		List<Integer> nodes[]=new ArrayList[n];
		for(int i =0 ;i<n ; i++){
			nodes[i]=new ArrayList();
		}
		for(int i=0;i<e;i++){
			int n1= s.nextInt();
			int n2= s.nextInt();
			 nodes[n1-1].add(n2);
			 nodes[n2-1].add(n1);
			
		}
		
		DFS(nodes,1,1);
		System.out.println(g-1);
		/*for(int i =0 ; i<n ;i++) {
			if(!(nodes[i].size()>1)) {
				System.out.println(i+1);
			}
		}*/
		
	}
	
	
	public static int DFS(List<Integer>[] adjGraph,int s,int n){
		
		
		visited[s-1]=true;
		int count = 0 ;
		int v=0;
		for(int i:adjGraph[s-1]){   
			if(!visited[i-1]) {
				
				v += DFS(adjGraph,i,n);
				count++;
			
			}
			
		    
			
		}
		
		n = count + v;
		if((n+1)%2 == 0) {
			g+=1;
		}
	//	 System.out.println(s +" " +count + " " + n);
		return n;
	}

}
