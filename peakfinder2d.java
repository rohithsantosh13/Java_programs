import java.util.Scanner;

public class peakfinder2d {
	
	static int findIndex(int arr[][],int rows,int mid,int max) {
		int index = 0;
		for(int i=0;i<rows;i++) {
			if(max<arr[i][mid]) {
				index = i;
				max = arr[i][mid];
			}
		}	
		return index;
	}
	static int findMaxEle(int arr[][],int rows,int mid,int max) {
		for(int i=0;i<rows;i++) {
			if(max<arr[i][mid]) {
				max = arr[i][mid];
			}
		}
		return max;
	}
	static int peakFind(int a[][],int rows,int cols,int mid) {
		int max=0;
	    max = findMaxEle(a,rows,cols/2,max);
		int index = findIndex(a,rows,cols/2,max);
		if(mid==0 || mid==cols-1){
			return max;
		}
		if((max>=a[index][mid+1] && max>=a[index][mid-1])) {
			return max;
		}
		if(max<a[index][mid+1]) {
			return peakFind(a,rows,cols,(int)(mid+(Math.ceil((double)mid/2))));
		}
		
		return peakFind(a,rows,cols,(int)(mid-(Math.ceil((double)mid/2))));
	}
	
	public static void main(String arhs[]) {
		try(Scanner sc = new Scanner(System.in)){
			int rows =sc.nextInt();
			int cols = sc.nextInt();
			int []a[] = new int[rows][cols];
			for(int i=0;i<rows;i++) {
				for(int j=0;j<cols;j++) {
					a[i][j] = sc.nextInt(); 
				}
			}
			System.out.println(peakFind(a,rows,cols,cols/2));
		}
	}

}
