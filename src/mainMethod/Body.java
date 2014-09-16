package src.mainMethod;

public class Body {
	
	/********************************************************************************
	* <b>Title</B>: Body.java 
	*Description: This object calls a process method that creates 1 new instance
	*	of a HelloWorldObj and DataBucket Objects. the process method calls 
	*	an addiional method that displays the data in the instances of DataBucket
	*		           
	*Copyright: Copyright (c) 2014 
	*Company: Silicon Mountain Technologies
	8@author: Ryan Riker
	*@version 1.0
	*@since 09/10/2014
	*last update: never
	********************************************************************************/
	
	public static void main(String[] args) {
	


		
		
		HelloWorldObj hello = new HelloWorldObj(); 
		
			System.out.println(hello.classValue);
		
		DataBucket startingBucket = new DataBucket();
		
			int bucketInt = startingBucket.i;
			double bucketDouble = startingBucket.d;
			float bucketFloat = startingBucket.f;
			char bucketChar = startingBucket.c;
			boolean bucketBool = startingBucket.b;
				
				
		bucketDump(bucketInt, bucketDouble, bucketFloat, bucketChar, bucketBool);

	}	
	
		public static void bucketDump( int bucketInt, double bucketDouble, float bucketFloat, char bucketChar, boolean bucketBool) {
			//********************************************************************************
			//The assignment requested a use of both method variables, and class variables to display the 
			//		stored data.  
			//********************************************************************************
			
			
			System.out.println("listed below are the starting values for the data bucket");
			System.out.println("The int value is " + bucketInt);
			System.out.println("The double value is " + bucketDouble);
			System.out.println("The float value is " + bucketFloat);
			System.out.println("The char value is " + bucketChar);
			System.out.println("The Boolean value is " + bucketBool);
		}


}



	
