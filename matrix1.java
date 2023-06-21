package day6;
import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;
public class matrix1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int g=0;
	int m=0;
int a[][]=new int[3][3];
	for(int i=0;i<=a.length-1;i++) {
		for(int j=0;j<=a[i].length-1;j++) {
			a[i][j]=sc.nextInt();}
		}
	for(int i=0;i<=a.length-1;i++) {
		for(int j=0;j<=a[i].length-1;j++) {
			System.out.print(a[i][j]+" ");}
		System.out.println();
		}
	for(int k=1;k<=3;k++) {
		int n=a[m][m];
		g=g+n;
		m=m+1;
		
	}
	System.out.println(g);
}
}
