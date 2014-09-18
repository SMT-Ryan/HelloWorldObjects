package src.mainMethod;

/**
 * <b>Title</B>: DataBucket.java 
 * Description: A mysterious object that contains 4 pre-loaded primitive units 
 * of data.  the data bucket can not be set with new data, and uses get methods 
 * dump data.
 * Copyright: Copyright (c) 2014 
 * Company: Silicon Mountain Technologies
 * @author Ryan Riker
 * @version 1.0
 * @since 09/10/2014
 * last update: 09/17/2014
 */

public class DataBucket {

		/**
		 * declares the variables in the data bucket.
		 */
	
		private int i = 0;
		private double d = 0;
		private float f = 0f;
		private char c = 'n';
		private boolean b = false;
			
		/**
		 * Constructor sets the data bucket to default numbers.
		 */
		
		public DataBucket() {

		i=1138;
		d = 11381138;
		f = 192.68f;
		c = 'r';
		b = true;
		
		
		}
	
		/**
		 * a set method, that can be used to fill the data bucket with new 
		 * numbers
		 * @param methodInt
		 * @param MethodDouble
		 * @param Methodfloat
		 * @param methodChar
		 * @param methodBool
		 */
		
		public void setDataBucket(int methodInt, double MethodDouble , 
				float Methodfloat, char methodChar, boolean methodBool) {
	
			i = methodInt;
			d = MethodDouble;
			f = Methodfloat;
			c = methodChar;
			b = methodBool;
			
		}
		
		/**
		 * a get method used to get the integer stored in the data bucket
		 * @return
		 */
		
		public int getDataBucketInt(){
			return i;
		}
		
		/**
		 * a get method used to get the double stored in the data bucket
		 * @return
		 */
		
		public double getDataBucketDouble(){
			return d;
		}
		
		/**
		 * a get method used to get the float stored in the data bucket
		 * @return
		 */

		public float getDataBucketFloat(){
			return f;
		}
		
		/**
		 * a get method used to get the char stored in the data bucket
		 * @return
		 */
		
		public char getDataBucketChar(){
			return c;
		}
		
		/**
		 * a get method used to get the boolean stored in the data bucket
		 * @return
		 */
		
		public boolean getDataBucketBool(){
			return b;
		}
		
		/**
		 * using the class itself to dump the bucket to the display.
		 */
		
		public void dumpBucket(){
		/**
		 * The assignment requested a use of both method variables, and 
		 * class variables to display the stored data.  
		 */
		
		System.out.println("listed below are the starting values for the "
				+ "	data bucket");
		System.out.println("The int value is " + i);
		System.out.println("The double value is " + d);
		System.out.println("The float value is " + f);
		System.out.println("The char value is " + c);
		System.out.println("The Boolean value is " + b);
		}
		
}
