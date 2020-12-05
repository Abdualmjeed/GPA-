import java.util.Scanner;
public class GPA {

	public static void main(String[] args) {

		Scanner read= new Scanner(System.in);
		System.out.println("Enter the number of your courses");
		int NoOfC =read.nextInt();//5
		System.out.println("Enter the total hours of your courses");
		int NoOfH =read.nextInt();//5
			
		int grades [] = new int [NoOfC];
		int hours [] = new int [NoOfC];
		
		//ÊÚÈÆÉ
		for(int i=0 ; i< NoOfC; i++) {
			
			System.out.println("Enter your grade:");
			grades[i]=read.nextInt();
			System.out.println("Enter its hour:");
			hours[i]=read.nextInt();

			
		}

		getGPA(grades,hours,NoOfC,NoOfH);
			
			}

			public static void getGPA (int[]arr,int[]h,int c,int th) {
				
				double point=0,gpa=0,GPA=0;
				
				for(int i=0 ; i<c ; i++)
				{
				if (arr[i]>=95 && arr[i]<=100) {
					
					point=5;
				}
				else if (arr[i]>=90 && arr[i]<=94) {
					
					point=4.75;
				}
				else if (arr[i]>=85 && arr[i]<=89) {
					
					point=4.5;
				}
				
				else if (arr[i]>=80 && arr[i]<=84) {
					
					point=4;
				}
				
				else if (arr[i]>=75 && arr[i]<=79) {
					point=3.5;
				}
				
				else if (arr[i]>=70 && arr[i]<=74) {
					point=3;
				}
				
				else if (arr[i]>=65 && arr[i]<=69) {
					point=2.5;
				}
				
				else if (arr[i]>=60 && arr[i]<=64) {
					point=2;
				}
				else if (arr[i]<60) {
					point=1;
				}
				
				gpa+=(point*h[i]);
			
				}
				 GPA=gpa/th;
				 
				    System.out.println();
				    System.out.println("\t--Final result--");
					System.out.println("Total Points: " + gpa);
					System.out.println("Total hours: " + th);
					System.out.printf("GPA is : %.2f" , GPA);
	
		}
	}
		