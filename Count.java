/*
 * Ram has passed in certain subjects and failed in a few. Write a program
 *  to count the no of subjects he passed in and the no of subjects he has
 *  failed in. Marks scored below 50 is considered as failed. If Ram has
 *  passed in all the subjects print "Ram passed in all subjects" and
 *  if failed print "Ram failed in all subjects".
 *
 *	Assume maximum size of array is 20,
 */

import java.util.Scanner;
public class Count {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int passCount = 0 ;
		int failCount = 0 ;
		int n;
		System.out.println("Enter the no of subjects:");
		n=sc.nextInt();
		if(n<=0) {
			System.out.println("Invalid input range");
		}
		else 
		{
			int[] marks = new int[n];
			for(int i=0;i<marks.length;i++) {
				marks[i]=sc.nextInt();
			}
			
			for(int m :marks) {
				if(m<50)
					failCount++;
				else if(m >= 50 && m <= 100)
					passCount++;
			}
		if(failCount==marks.length)
			System.out.println("Ramm failed in all subjects");
		else if(passCount==marks.length)
			System.out.println("Ramm passed in all subjects");
		else 
			System.out.println("Ram passed in "+passCount+" subjects and failed in "+failCount+" subjects");
			
		}	
	}
}
