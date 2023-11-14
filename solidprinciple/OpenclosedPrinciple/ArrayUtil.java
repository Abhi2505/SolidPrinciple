package com.solidprinciple.OpenclosedPrinciple;

interface VComparator{
	public int compare(int a,int b);
	//returns +value if a>b
	//returns -value if a<b
	//return 0 if a==b
	
	//here we do not want to create another function for sorting in descending order we wanted too reuse it.
}
class AscComparator implements VComparator{

	@Override
	public int compare(int a, int b) {
		// TODO Auto-generated method stub
		if(a>b)return 1;
		else if(a<b)return -1;
		return 0;
	}
}
class DescComparator implements VComparator{

	@Override
	public int compare(int a, int b) {
		// TODO Auto-generated method stub
		if(a>b)return -1;
		else if(a<b)return 1;
		return 0;
	}
	
}
public class ArrayUtil {
	public static void sort(int ar[],VComparator vc) {
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(vc.compare(ar[i], ar[j])>0) {
					int temp=ar[j];
					ar[j]=ar[i];
					ar[i]=temp;
				}
			}
		}
		print(ar);
		
	}
	
	public static void print(int ar[]) {
		for(int v:ar) {
			System.out.print(v+" ");
		}
	}
	
	
	public static void main(String[] args) {
		//instead of creating new class we do not modify the arrayutil class and extened it for reuse and
		//extended its functionality 
		
		int a[]= {9,3,1,2,4,2,8};
		ArrayUtil.sort(a, new AscComparator());
		System.out.println();
		ArrayUtil.sort(a, new DescComparator());
	}
}
