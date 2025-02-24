package arrays;

import java.util.Scanner;

public class All_subarrays_sum {
	public static void subarray(int[] a) {
		for(int size=1;size<=a.length;size++) {
		 for(int i=0;i<=a.length-size;i++) {
			 int sum=0;
			for(int j=i;j<i+size;j++) {
				sum=sum+a[j];
			}
			System.out.println(sum);
		 	}
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter array size");
		int n = scan.nextInt();
		System.out.println("enter array elements");
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}
		subarray(a);
	}

}
