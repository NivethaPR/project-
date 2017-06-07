package positive;
import java.io.*;
import java.util.Scanner;
public class posneg  
{
	public static void main(String args[]){
	int n;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
	n=s.nextInt();
	if(n>0)
	{
		System.out.println("positive values");
		
	}else if(n<0)
	{
		System.out.println("negative values");
	}else
	{
		System.out.println("zero");
	}
	

}
}
