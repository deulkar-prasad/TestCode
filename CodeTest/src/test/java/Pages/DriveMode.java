package Pages;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import cucumber.api.testng.TestNGCucumberRunner;
import net.bytebuddy.asm.Advice.Exit;

public class DriveMode
{
	static String SelectedMode;
	static String n="Normal";
	static String sa="Safe";
	static String sp="Sport";
	int sensorno;
	static Scanner mode;
	static Scanner sensor;
	static Scanner exitmode;
	
	public static void SelectMode() throws IOException
	
	{
		     
		    boolean flag=false;
		     /*if(SelectedMode.equalsIgnoreCase(n)) 
		     {
		    	NormalMode.validateInput(); 	 
		     }		    
		    */
		   do {
			   
			   System.out.println("Choose Driving Mode - NORMAL, SAFE, SPORT:");
			     mode = new Scanner(System.in);
			     SelectedMode=mode.nextLine();
		     if (SelectedMode.equalsIgnoreCase(n)||SelectedMode.equalsIgnoreCase(sa)||SelectedMode.equalsIgnoreCase(sp))
			{
		      System.out.println("You have selected Mode as : " + SelectedMode);
		      Sensorvalue();
		      
			}else {
				
				System.out.println("Invalid Input - Please enter valid Driving Mode");
			}
		   }while(flag=true);
		    
	}
	
	
	public static void Sensorvalue() throws IOException
	{
		
		if(SelectedMode.equalsIgnoreCase(n))
		{
			validateInputNormal();
		}else if(SelectedMode.equalsIgnoreCase(sa))
		{
			validateInputSafe();
		}if(SelectedMode.equalsIgnoreCase(sp))
		{
			validateInputSport();
		}
		
	}
	
	
	
	public static int getRandomNumberInRange(int min, int max) 
	{

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
	
	
	public static void TextExit () throws IOException 
	 {
		String s;
		String y="y";
		boolean flag2=false;
		exitmode= new Scanner(System.in);
		s=exitmode.nextLine();		
		do 
		{
			if(s.equalsIgnoreCase(y) ||s.isEmpty() )
			{
			   System.exit(0);
			
			}else 
		{
			SelectMode();
			Sensorvalue();	
		}
		}while(flag2=true);
			
}
	
	
	
	
	public static int validateInputNormal() throws IOException
	{
	   
			int i=0;
			int number;
			boolean error=false;
			System.out.println("Welcome. Driving Mode is " + SelectedMode );
			System.out.println(" Please enter sensor events : " );
				
			for (i=0;i<=7;i++) 
			{
				
				try {
					
					sensor=new Scanner(System.in);
					number=sensor.nextInt();
					System.out.println("sensor Event Number : "+ number );
					System.out.println("Sensor value ganerated :" + getRandomNumberInRange(5, 10)*5);
					
					}
				catch(InputMismatchException e)
					{
					// accept integer only.
					System.out.println("Invalid Input..Pls Input Integer Only..");
					error=true;
					}
				
			}
			
				System.out.println("=================================");
				System.out.println("Test Compleated");
				System.out.println("=================================");
				System.out.println(" Do you want to continue Y/N :");
				TextExit();
				
				return(i);
				
			}
	
	
	public static int validateInputSafe() throws IOException
	{
	   
			int j=0;
			int numberj;
			boolean error1=false;
			System.out.println("Welcome. Driving Mode is " + SelectedMode );
				
			for (j=0;j<=7;j++) 
			{
				
				try {
					System.out.println("Enter sensor Event Number : ");
					sensor=new Scanner(System.in);
					numberj=sensor.nextInt();
					System.out.println("Sensor value ganerated :" + getRandomNumberInRange(1, 5)*5);
					
					}
				catch(InputMismatchException e)
					{
					// accept integer only.
					System.out.println("Invalid Input..Pls Input Integer Only..");
					error1=true;
					}
				
			}
			
				System.out.println("=================================");
				System.out.println("Test Compleated");
				System.out.println("=================================");
				System.out.println(" Do you want to continue Y/N :");
				TextExit();
				return(j);
				
			}
	
	public static int validateInputSport() throws IOException
	{
	   
			int k=0;
			int numberk;
			boolean error2=false;
			System.out.println("Welcome. Driving Mode is " + SelectedMode );
				
			
			
			for (k=0;k<=7;k++) 
			{
				
				try {
					System.out.println("Enter sensor Event Number : ");
					sensor=new Scanner(System.in);
					numberk=sensor.nextInt();
					System.out.println("Sensor value ganerated :" + getRandomNumberInRange(15, 25)*5);
					}
				catch(InputMismatchException e)
					{
					// accept integer only.
					System.out.println("Invalid Input..Pls Input Integer Only..");
					error2=true;
					}
				
			}
			
				System.out.println("=================================");
				System.out.println("Test Compleated");
				System.out.println("=================================");
				System.out.println(" Do you want to continue Y/N :");
				TextExit();			
				return(k);
				
			}
	
	
	
	
	
	
}
	
	
	
	
	

