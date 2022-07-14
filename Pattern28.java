package Lacture3;

import java.util.Scanner;

public class Pattern28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int star=1;
        int space=n-1;
        int  row=1;
        while (row<=n) {
            int i = 1;
            while (i <= space) {
                System.out.print("\t");
                i++;
            }
            int j = 1;
            int val=row;
            while (j <= star) {
                System.out.print(val+"\t");
                if(j<(star/2)+1){
                    val++;
                }else{
                    val--;
                }
                j++;
            }
            space--;
            star+=2;
            row++;
            System.out.println();
        }
    }
}


	
