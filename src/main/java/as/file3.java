package as; 
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.io.IOException;
import java.text.AttributedString;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;


 
 
public class file3  extends Thread  {
  @SuppressWarnings({ "null", "unlikely-arg-type" }) 
 
  
public static void main(String[] args) throws exceptionhandle  {
   
	  //creating the object of thread class
      threading obj=new threading();
   		
      
      //setter getter for the class to get the file names 
      obj.setter(args);
   		String []array=obj.getter();
   	 
	  Scanner sc=new Scanner(System.in);	  
   char a = 0;
 
 //display the total names and numbers of the files
	  System.out.println("total number of files are."+args.length);
	  for(int h=0;h<args.length;h++)
	   {

	    
	  System.out.println("the name of the files are .       "+(h+1)+"   " +args[h]);
	   } 
	  
 //showing the menu to the user  
	  System.out.println("press 1 to see the  tree built from the files     "+"\n");
	  System.out.println("press 2  see the vector built from the files  "+"\n");
	  System.out.println("press 3 to check the frequency of each word");
	  System.out.println("pree 4 to check wheather a file exiss or not ");
	  System.out.println("press 5 to exit from the program ");
	    System.out.println("press 6 to run a query");
		
	a = sc.next().charAt(0);   
 	  
	//exception handling if user enters invalid chooice
	  if(a!='1'&&a!='2'&&a!='3'&&a!='4'&&a!='5'&&a!='6'&&a!='7')
	  {
		  throw new exceptionhandle("invalid choice !   kindly enter a value from the given values");
	  }

	 obj.choiceset(a);
String r=new String();
r=args[0];
//setter function for treeset 	  
obj.set_treeset(r);
//implementing logic according to the choice
	  if(a=='1')
	  {
		  
		      threads my = new threads();     
		  my.start();
			//obj.treeset(); 
			//System.exit(0);
	  }
	  else if(a=='2')
		  {
		  
		     threads2 my = new threads2();     
				  my.start();

		   }
	  else if(a=='3')
	  {
		  threads3 my=new threads3();
			//obj.treeset(); 
			//System.exit(0);
			  //obj=new threading();
			  // obj.vectors();
		  my.start();
	  }
	  
	  //taking the filename from the user and check if the file name for this exists or not
	  else if(a=='4'){
		  System.out.println("enter the file name which you want to check ");
		  String str= sc.next(); 
		  for(int count=0;count<args.length;count++)
		  {
			  System.out.println(args[count]+"\n");
		  }
		  //promting the user if the file name exists
		  for(int count=0;count<args.length;count++)
		  {
		 	  if(str.equals(args[count]))
			  {
				System.out.println("file exists for this name\n");  
				 break;
			  }
			  else if(!(str.equals(args[count]))&&count==(args.length-1)) {
				System.out.println("file does not exists for this name");
			}
			 		 
			  
		  }
	  }
	    
 		 //exitting the program      
	  else if(a=='5')
	  {
	 	  System.out.println("you have been exitted successfully");
	 System.exit(0);
	  }
	  else if (a=='7')
	  {
		  threading h=new threading ();
		  h.start();
	
	  }
 
		
	  else if(a=='6')
	  {
		  obj.treeset();
		  obj.vectors();
		  obj.user_query();
	  }
		  
 
	  
	 
	  
 
  }
 
   
}	 
	 