import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;


public class InterCoviddk{
	
	//The following are global fields that will parse data throughout all of the methods
	
	//establishes the nodes of each coordinate
	static int NodeA[] = new int [22500];
	static int NodeB[] = new int [22500];
	 
	//Parses calculated distances of the three groups
	static double Center_1[] = new double[22500];
	static double Center_2[] = new double[22500];
	static double Center_3[] = new double[22500];
	static double distance = 0;
	static int select = 0;
	
	static double temp[] = new double[22500]; //will be used to store A[i] of previous iteration
	static double A[] = new double[22500];
	
	//Temporarily stores distances
	static double x1_D1[] = new double[22500];
	static double y1_D1[] = new double[22500];
	static double w1_D1[] = new double[22500];
	static double z1_D1[] = new double[22500];
	static double g1_D1[] = new double[22500];
	
	//parses coordinates for new centers/average value
	static double S1_D1[] = new double[3];
	static double T1_D1[] = new double[3];
	static double E1_D1[] = new double[3];
	static double V1_D1[] = new double[3];
	static double N1_D1[] = new double[3];
	
	
	//Stores initialized coordinates
	static double Init_x1_D1[] = new double[22500];
	static double Init_y1_D1[] = new double[22500];
	static double Init_w1_D1[] = new double[22500];
	static double Init_z1_D1[] = new double[22500];
	static double Init_g1_D1[] = new double[22500];
	
	//Dimensions for Group 1
	static double x1_G1[] = new double[22500];
	static double y1_G1[] = new double[22500];
	static double w1_G1[] = new double[22500];
	static double z1_G1[] = new double[22500];
	static double g1_G1[] = new double[22500];
	
	//Dimensions for Group 2
	static double x1_G2[] = new double[22500];
	static double y1_G2[] = new double[22500];
	static double w1_G2[] = new double[22500];
	static double z1_G2[] = new double[22500];
	static double g1_G2[] = new double[22500];
	
	//Dimensions for Group 3
	static double x1_G3[] = new double[22500];
	static double y1_G3[] = new double[22500];
	static double w1_G3[] = new double[22500];
	static double z1_G3[] = new double[22500];
	static double g1_G3[] = new double[22500];
	
	
	
	static int iterations = 0;
	static int temp_iterations = -1;
	
	//used to store amount of centers of previous iteration
	static int temp1 = 0;
	static int temp2 = 0;
	static int temp3 = 0;
	
	
	static int counter1 = 0; //counts amount of members in group1
	static int counter2 = 0; //counts amount of members in group2
	static int counter3 = 0; //counts amount of members in group3
	
	static boolean condition = false; //used to break loop when A[] is equal to previous iteration
	
	
	
	public static void main(String args[]) throws FileNotFoundException 
	{
		Scanner Input = new Scanner(System.in); //Inputs which file you want to execute
		String file;
		System.out.println("Enter the file you want to use: ");
		file = Input.nextLine();
		
		System.out.println("Here are the results: \n");
	
		if(file.equals("Data1.txt"))
		{
		Average(); //executes average method
		}
		else if(file.equals("Data2.txt"))
		{
		InterCovidData2.Average(); //calls InterCovidData2.Average class object to execute Data2.txt
		}
		else if(file.equals("Data3.txt"))
		{
		InterCovidData3.Average(); //calls InterCovidData2.Average class object to execute Data3.txt
		}
		
		GraphExample graph = new GraphExample(); //calls graph object to display coordinates in panel
	}//end main
	
	//------------------------------------------------------------------------------------
	
	//Initializes the values with random lines and calculate the distance between the center values
	public static void Distance1() throws FileNotFoundException 
	{
		double Manhattan_1; //used to store the distance
		double Manhattan_2; //used to store the distance
		double Manhattan_3; //used to store the distance
		int nodeB = 0;
		int nodeA = 0;
		
		//create a string that will read data file, Data1.txt
		String fileName1 = "Data1.txt";
		File file1 = new File(fileName1);
		Scanner inputStream = new Scanner(file1);
		
		String result = null;
		 int x = 0;
		 int c = 0;
		 
		 Random rand = new Random();

		 final int Max_Rand = 15;
		 final int Min_Rand = 0;
		 int random = 0;
		 int count = 0;
		 int center = 1;
		 
		//Here the initialization of the centers takes place
		while(inputStream.hasNext())
		{		
			
			c++;
			random = ((int) (Math.random() * (Max_Rand - Min_Rand +1))) + Min_Rand;
			
			//saves each line in to the values array and removes the ,  
			String data = inputStream.nextLine();
			
			//Initialize centers with random lines from the file Data1.txt
			if(rand.nextInt(c) > 13  || rand.nextInt(c) == random )
			{
			
				result = data;
				String values_Data1[] = result.split(",");
				x1_D1[x] = Double.parseDouble(values_Data1[0]);
				y1_D1[x] = Double.parseDouble(values_Data1[1]);
				w1_D1[x] = Double.parseDouble(values_Data1[2]);
				z1_D1[x] = Double.parseDouble(values_Data1[3]);
				g1_D1[x] = Double.parseDouble(values_Data1[4]);
				
				//saves initializes coordinates
				if(iterations == 0)
				{
					Init_x1_D1[0] = x1_D1[0];
				    Init_y1_D1[0] = y1_D1[0];
					Init_w1_D1[0] = w1_D1[0];
					Init_z1_D1[0] = z1_D1[0];
					Init_g1_D1[0] = g1_D1[0];
					
				}
				
				if(iterations >=1)
				{
					x1_D1[0] = S1_D1[0];
					y1_D1[0] = T1_D1[0];
					w1_D1[0] = V1_D1[0];
					z1_D1[0] = E1_D1[0];
					g1_D1[0] = N1_D1[0];
					
					x1_D1[1] = S1_D1[1];
					y1_D1[1] = T1_D1[1];
					w1_D1[1] = V1_D1[1];
					z1_D1[1] = E1_D1[1];
					g1_D1[1] = N1_D1[1];
					
					x1_D1[2] = S1_D1[2];
					y1_D1[2] = T1_D1[2];
					w1_D1[2] = V1_D1[2];
					z1_D1[2] = E1_D1[2];
					g1_D1[2] = N1_D1[2];
				}
				
				
				x++;
			}
		}
		
		inputStream.close();
		
		//This for loop calculates the distance of the centers with Manhattan formula
		for(int i = 0; i < 150; i++)
		{
			for(int j = 0; j < 150; j++)
			{ 
				Manhattan_1 = Math.abs((x1_D1[0]-x1_D1[j])) + Math.abs((y1_D1[0] - y1_D1[j])) + 
						Math.abs((w1_D1[0]-w1_D1[j])) + Math.abs((z1_D1[0]-z1_D1[j]))    + Math.abs((g1_D1[0]-g1_D1[j]));
				
				Manhattan_1 = Math.round(Manhattan_1*100.0)/100.0;
				
				
				Manhattan_2 = Math.abs((x1_D1[1]-x1_D1[j])) + Math.abs((y1_D1[1] - y1_D1[j])) + 
						Math.abs((w1_D1[1]-w1_D1[j])) + Math.abs((z1_D1[1]-z1_D1[j]))   + Math.abs((g1_D1[1]-g1_D1[j]));
				
				Manhattan_2 = Math.round(Manhattan_2*100.0)/100.0;
				
				
				Manhattan_3 = Math.abs((x1_D1[2]-x1_D1[j])) + Math.abs((y1_D1[2] - y1_D1[j])) + 
						Math.abs((w1_D1[2]-w1_D1[j])) + Math.abs((z1_D1[2]-z1_D1[j]))    + Math.abs((g1_D1[2]-g1_D1[j]));
				
				Manhattan_3 = Math.round(Manhattan_3*100.0)/100.0;
				
				nodeA = i;
				nodeB = j;
				
				
				NodeA[count] = nodeA;
				NodeB[count] = nodeB;
				Center_1[count] = Manhattan_1;
				Center_2[count] = Manhattan_2;
				Center_3[count] = Manhattan_3;
		
				count++;
			}
		}
		
	}//end Distance1
	

	//-------------------------------------------------------------
	
	//Here we determine which groups the distances will be assigned, assuming there are 3 groups
	public static void Join() throws FileNotFoundException
	{
		double Center1[] = new double[22500];
		double Center2[] = new double[22500];
		double Center3[] = new double[22500];

		Distance1();

		if(temp_iterations < iterations)
		{
			//stores previous iterations of A[i] to temp[i]
			for(int x = 0; x < 22500; x++)
			{
				temp[x] = A[x];
				
				if(temp[x] == 1)
				{
					temp1++;
				}
				else if(temp[x] == 2)
				{
					temp2++;
				}
				else if(temp[x] == 3)
				{
					temp3++;
				}
			}
		}
		
		//Assigns Manhattan distances to Center1 array
		for(int i = 0; i < 22500; i++)
		{
				Center1[i] = Center_1[i];
		}
		
		//Assigns Manhattan distances to Center2 array
		for(int i = 0; i < 22500; i++)
		{
			Center2[i] = Center_2[i];
		}
		
		//Assigns Manhattan distances to Center3 array
		for(int i = 0; i < 22500; i++)
		{
			Center3[i] = Center_3[i];
			
		}
		
		//Joining Centers
		for(int i = 0; i < 22500; i++)
		{
			if(Center1[i] < Center2[i] && Center1[i] < Center3[i])
			{
				distance = Center1[i];
				select = 0;
				A[i] = 1;
				
				x1_G1[i] = x1_D1[i];
				y1_G1[i] = y1_D1[i];
				w1_G1[i] = w1_D1[i];
				z1_G1[i] = z1_D1[i];
				g1_G1[i] = g1_D1[i];
				counter1++;
				
			}
			else if(Center2[i] < Center1[i] && Center2[i] < Center3[i])
			{
				distance = Center2[i];
				select  = 1;
				A[i] = 2;
				
				x1_G2[i] = x1_D1[i];
				y1_G2[i] = y1_D1[i];
				w1_G2[i] = w1_D1[i];
				z1_G2[i] = z1_D1[i];
				g1_G2[i] = g1_D1[i];
				counter2++;
			}
			else if(Center3[i] < Center1[i] && Center3[i] < Center2[i])
			{
				distance = Center3[i];
				select = 2;
				A[i] = 3;
				
				x1_G3[i] = x1_D1[i];
				y1_G3[i] = y1_D1[i];
				w1_G3[i] = w1_D1[i];
				z1_G3[i] = z1_D1[i];
				g1_G3[i] = g1_D1[i];
			
				counter3++;
			
			}
	
		}
	}	//end Join method
	
	
	//Here we find the average of the values assigned to A[]
	public static void Average() throws FileNotFoundException
	{
		//Field arrays are meant to substitute original Center
		double newX1_D1[] = new double[100];
		double newY1_D1[] = new double[100];
		double newW1_D1[] = new double[100];
		double newZ1_D1[] = new double[100];
		double newG1_D1[] = new double[100];
		double sum_D1[] = new double[100];
		double sum_D2[] = new double[100];
		double sum_D3[] = new double[100];
		double sum_D4[] = new double[100];
		double sum_D5[] = new double[100];
		
		
		for(int i = 0; i<100; i++)
		{	
			
			Join(); //executes join method 100 times
			
						for(int x = 0; x < 100; x++)
						{
						//average of the center   
						 sum_D1[0]+=x1_G1[x];
						 sum_D2[0]+=y1_G1[x];
						 sum_D3[0]+=w1_G1[x];
						 sum_D4[0]+=z1_G1[x];
						 sum_D5[0]+=g1_G1[x];
						 
						
						 sum_D1[1]+=x1_G2[x];
						 sum_D2[1]+=y1_G2[x];
						 sum_D3[1]+=w1_G2[x];
						 sum_D4[1]+=z1_G2[x];
						 sum_D5[1]+=g1_G2[x];
						 
						 sum_D1[2]+=x1_G3[x];
						 sum_D2[2]+=y1_G3[x];
						 sum_D3[2]+=w1_G3[x];
						 sum_D4[2]+=z1_G3[x];
						 sum_D5[2]+=g1_G3[x];
						 
						}
						
						//Distance1();
						//System.out.println("new cent1");
						newX1_D1[0] = (sum_D1[0]/counter1);
						newY1_D1[0] = (sum_D2[0]/counter1);
						newW1_D1[0] = (sum_D3[0]/counter1);
						newZ1_D1[0] = (sum_D4[0]/counter1);
						newG1_D1[0] = (sum_D5[0]/counter1);
						
						newX1_D1[1] = (sum_D1[1]/counter1);
						newY1_D1[1] = (sum_D2[1]/counter1);
						newW1_D1[1] = (sum_D3[1]/counter1);
						newZ1_D1[1] = (sum_D4[1]/counter1);
						newG1_D1[1] = (sum_D5[1]/counter1);
						
						newX1_D1[2] = (sum_D1[2]/counter1);
						newY1_D1[2] = (sum_D2[2]/counter1);
						newW1_D1[2] = (sum_D3[2]/counter1);
						newZ1_D1[2] = (sum_D4[2]/counter1);
						newG1_D1[2] = (sum_D5[2]/counter1);
					
						//arrays used to assign new centers
						x1_D1[0] = newX1_D1[0];
						y1_D1[0] = newY1_D1[0];
						w1_D1[0] = newW1_D1[0];
						z1_D1[0] = newZ1_D1[0];
						g1_D1[0] = newG1_D1[0];
						
						
						x1_D1[1] = newX1_D1[1];
						y1_D1[1] = newY1_D1[1];
						w1_D1[1] = newW1_D1[1];
						z1_D1[1] = newZ1_D1[1];
						g1_D1[1] = newG1_D1[1];
						
						x1_D1[2] = newX1_D1[2];
						y1_D1[2] = newY1_D1[2];
						w1_D1[2] = newW1_D1[2];
						z1_D1[2] = newZ1_D1[2];
						g1_D1[2] = newG1_D1[2];
						
						S1_D1[0] = x1_D1[0];
						T1_D1[0] = y1_D1[0];
						E1_D1[0] = w1_D1[0];
						V1_D1[0] = z1_D1[0];
						N1_D1[0] = g1_D1[0];
						
						S1_D1[1] = x1_D1[1];
						T1_D1[1] = y1_D1[1];
						E1_D1[1] = w1_D1[1];
						V1_D1[1] = z1_D1[1];
						N1_D1[1] = g1_D1[1];
						
						S1_D1[2] = x1_D1[2];
						T1_D1[2] = y1_D1[2];
						E1_D1[2] = w1_D1[2];
						V1_D1[2] = z1_D1[2];
						N1_D1[2] = g1_D1[2];
						
			
			
			Accuracy(); //determines if A[] is equal to the previous array
			
			//breaks loop if A[] is equal to previous A[] matrix
			if(condition == true)
			{
				break;
			}
		
			counter1 = 0;
			counter2 = 0;
			counter3 = 0;
			iterations++; //Keeps count of the programs iterations
			
			
			temp_iterations++; //test variable to see if it works
			temp1 = 0;
			temp2 = 0;
			temp3 = 0;
					
		}	
	}//end Average method
	
	//This method determines the accuracy of the Files
	public static void Accuracy() throws FileNotFoundException
	{
		boolean equals = false;
		double accuracy = 0;
		double equalsCounter = 0;
		
		

			if(temp1 == counter1 && temp2 == counter2 && temp3 == counter3)
			{
				equals = true;
			}
		
		
		if(equals == true)
		{
			System.out.println("Data1.txt:");
			System.out.println("Its equal to the last iteration");
			for(int i = 0; i < 22500; i++)
			{
				if(A[i] == g1_D1[i])
				{
					equalsCounter++;
				}
			}
			//System.out.println(equalsCounter);
			System.out.println("Initialization: " + Init_x1_D1[0] + ", " + Init_y1_D1[0] + ", " + Init_w1_D1[0] + ", " + Init_z1_D1[0] + ", " + Init_g1_D1[0]);
			System.out.println("Average: " + S1_D1[select] + ", " +  T1_D1[select] + ", " +  E1_D1[select] + ", " +  V1_D1[select] + ", " + N1_D1[select]);
			System.out.println("The distance is:" + distance);
			accuracy = equalsCounter/100;
			System.out.println("The accuracy of Data1.txt is: " + accuracy);
			
			System.out.println("Iterations: "+ iterations);
			condition = true;
			System.out.println("____________________________________________________");
		}
		else if(equals == false && iterations ==99)   
		{
			System.out.println("It is not equal");
			
			for(int i = 0; i < 22500; i++)
			{
				if(A[i] == g1_D1[i])
				{
					equalsCounter++;
				}
				
			}
			
			accuracy = equalsCounter/100;
			System.out.println("Initialization: " +  Init_x1_D1[0] + ", " + Init_y1_D1[0] + ", " + Init_w1_D1[0] + ", " + Init_z1_D1[0] + ", " + Init_g1_D1[0]);
			System.out.println("Average: " + S1_D1[select] + ", " +  T1_D1[select] + ", " +  E1_D1[select] + ", " +  V1_D1[select] + ", " + N1_D1[select]);
			System.out.println("The distance is:" + distance);
			System.out.println("The accuracy of Data1.txt is: " + accuracy);
			condition = true;
			System.out.println("____________________________________________________");
			
		}		
	}//end Accuracy method	
	
}//end class
