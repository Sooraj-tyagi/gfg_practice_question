/*https://practice.geeksforgeeks.org/problems/rotate-array-by-n-elements/0#*/
package gfg;
import java.util.*;


public class Fc {
		public static void main (String[] args) {
			Scanner scn=new Scanner(System.in);
			int t=scn.nextInt();
			while(t--!=0){
			int n=scn.nextInt();
			int k=scn.nextInt();
			int []a= new int[n+k];
			for(int i=0;i<n;i++){
			    a[i]=scn.nextInt();
			}
			
			for(int i=0;i<k;i++){
			    a[n+i]=a[i];
			}
			for(int i=k;i<n+k;i++){
			    System.out.print(a[i]+" ");
			}
			System.out.println();
		   }
	    }

	}

