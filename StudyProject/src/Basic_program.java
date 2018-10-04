import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Basic_program {

	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		fact_rec(1);
		//fact();
		//prime();
	}
	public static void prime() throws NumberFormatException, IOException
		{
	
	
		System.out.println("enter a number");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		System.out.println(t);
				
		int k= t/2;
		int flag =0;
		{
			if(t<=1)
			{
			flag = 0;
			}
			else if(t==2)
			{
			flag =1;
			}
			else if(t>2)
			{
			for(int i =2;i<=k;i++)
				{
				if(t%i==0)
					{
					flag = 0;
					break;
					}
					else
					{
					flag =1;
					
					}
				}
			}
		}
		System.out.println("::::::::::");
		if(flag== 1)
		{System.out.println("P");}
		if(flag== 0)
		{System.out.println("NP");}
		}
	
	
	public static void fact() throws NumberFormatException, IOException
	{
		int k =1;
		System.out.println("Enter a number");
		BufferedReader ar = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(ar.readLine());
		System.out.println(t);
		for(int i=1;i<=t;i++)
		{
			k=k*i;
		}
		System.out.println(k);
	}
	
	public static int  fact_rec(int i) throws NumberFormatException, IOException
	{
		System.out.println("Enter a number");
		BufferedReader ar = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(ar.readLine());
		System.out.println(t);
		if(t==1)
		{return 1;}
		else
		{
		return (t*fact_rec(t-1));
		}
	}
	
}
