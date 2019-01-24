import java.util.Scanner;

public class Methods 
{

	public static void main(String[] args) 
	{
		System.out.print("enter your name:  ");
		Scanner in = new Scanner(System.in);
		
		String name = in.nextLine();
		greeting(name);
		
		System.out.println(sumThree(2,4,6));
		int whatsTheAnswer = sumThree(sumThree(1,2,3),sumThree(4,5,6),sumThree(7,8,9));
		System.out.println(whatsTheAnswer);
		System.out.print("enter four doubles:  ");
		
		
			
	}
	
	public static void greeting(String arg1)
	{	//arg1 = name
		System.out.println("hello, " + arg1);
	}

	
	public static int sumThree(int int1, int int2, int int3)
	{
		int sum = int1 + int2 + int3;
		return sum;
	}
	
	//create a method that will find the average of 4 doubles
	public static double averageFour(double double1, double double2, double double3, double double4)
	{
		double average = double1 + double2 + double3 + double4;
		average = average / 4;
		return average;
	}
}
