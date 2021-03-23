import java.util.Scanner;

public class peekfinder {
	protected int binarysearching(int a[],int l) {
		int left = 0;
		int right = l-1;
		while(left<right) {
			int mid = (left+right)/2;
			if(a[mid]<=a[mid+1]) {
				left = mid+1;
			}
			else {
				right = mid;
			}
		}
		return a[left];
	}
	public static void main(String args[]) {
		try(Scanner sc = new Scanner(System.in)){
			peekfinder ob = new peekfinder();
			int l = sc.nextInt();
			//int value = sc.nextInt();
			int a[] = new int[l];
			for(int i=0;i<l;i++) {
				a[i] = sc.nextInt();
			}
			
			System.out.println(ob.binarysearching(a,l));
		}
	}
}

