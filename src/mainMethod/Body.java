package src.mainMethod;

public class Body {
	
	/**
	* <b>Title</B>: Body.java 
	*Description: This object calls a process method that creates 1 new instance
	*	of a HelloWorldObj and DataBucket Objects. The process method calls 
	*	an additional method that displays the data in the instances of 
	*	DataBucket
	*		           
	*Copyright: Copyright (c) 2014 
	*Company: Silicon Mountain Technologies
	8@author: Ryan Riker
	*@version 1.0
	*@since 09/10/2014
	*last update: never
	*/
	
	public static void main(String[] args) {
		
		
		Body enviroment = new Body();
		enviroment.process();
		
	}
	
	/**
	 * The process controls the class and methods 
	 */
	
	public void process() {
	
		
		
		HelloWorldObj hello = new HelloWorldObj(); 
		
			System.out.println(hello.classValue);
		
		DataBucket startingBucket = new DataBucket();
		
			int bucketInt = startingBucket.getDataBucketInt();
			double bucketDouble = startingBucket.getDataBucketDouble();
			float bucketFloat = startingBucket.getDataBucketFloat();
			char bucketChar = startingBucket.getDataBucketChar();
			boolean bucketBool = startingBucket.getDataBucketBool();
				
				
		bucketDump(bucketInt, bucketDouble, bucketFloat, bucketChar, 
				bucketBool);
		
		
		bucketInt = 12;
		bucketDouble = 123456;
		bucketFloat = (float) 77.52;
		bucketChar = 'Z';
		bucketBool = false;
		
		
		
		startingBucket.setDataBucket(bucketInt, bucketDouble, bucketFloat, 
				bucketChar, bucketBool);

		startingBucket.dumpBucket();
	}	
	
	
		/**
		 * 
		 * Calling this method dumps the data in the bucket to the display
		 * @param bucketInt
		 * @param bucketDouble
		 * @param bucketFloat
		 * @param bucketChar
		 * @param bucketBool
		 */
		public static void bucketDump( int bucketInt, double bucketDouble, 
					float bucketFloat, char bucketChar, boolean bucketBool) {

			
			/**
			 * The assignment requested a use of both method variables, and 
			 * class variables to display the stored data.  
			 */
			
			System.out.println("listed below are the starting values for the "
					+ "	data bucket");
			System.out.println("The int value is " + bucketInt);
			System.out.println("The double value is " + bucketDouble);
			System.out.println("The float value is " + bucketFloat);
			System.out.println("The char value is " + bucketChar);
			System.out.println("The Boolean value is " + bucketBool);
		}


}



	
