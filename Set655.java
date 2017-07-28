package hunter;
import java.util.Scanner;
public class Set655 {
public static void main(String[] args){
	int[] arr = new int[5];
	int[] arr1 = new int[5];
	Scanner in = new Scanner(System.in);
	for(int i=0;i<5;i++){
		arr[i]= in.nextInt();
	}
	int a = in.nextInt();
	for(int i=0;i<5;i++){
		arr1[i] = arr[i]+a;
		System.out.print(arr1[i]+" ");
	}
}
}
