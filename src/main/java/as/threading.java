
package as;

import java.io.File;
import java.io.FileNotFoundException;
import java.security.PublicKey;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;
import java.util.zip.CheckedOutputStream;

public class threading extends Thread {
 //member variables for the class 
	static int g=0;
	static char choice;
   static String tree_array[] = new String [g];
  static String []vector_array=null;
	static String []array=null;
    static Set<String> ts1 = new TreeSet<String>();
    static String b ;
    //setter for the treeset
    public void set_treeset(String r)
    {
    this.b=r;	
    }
    //getter for the treeset 
    public static String treegetter()

    {
    return b;	
    }
    //setter for the vector
    	public void setter(String [] array) {
    
        this.array = array;
    }
//getter for the vector
    public static String[] getter() {
        return array;
    }
    
 public void choiceset(char choice)
 {
	 this.choice=choice;
 }
 public static char choice_getter()

 {
return choice;
		//handling custom exceptions in the treeset  function
 }
	public static void treeset() throws exceptionhandle  
	{
		
		  
		  try {
	      File myObj = new File(treegetter());
	      //tree getter and handling custom exceptions 
	   
	      if(treegetter()==null)
	      {
	    	  throw new exceptionhandle("file name not recieved it is null");
	      }
	      Scanner myReader = new Scanner(myObj);
	      while (myReader.hasNextLine()) {
	        String data = myReader.nextLine();
	      
	         
	         ts1.add(data);
	         try {
				if(choice_getter()=='1')
				 {
				System.out.println("th tree build from the vocabulary is "+ts1);
				 }
			} catch (Exception a) {
				// TODO Auto-generated catch block
				a.printStackTrace();
			}
	        
	        
	        
	        
	        
	      }
 
	      
	 
	      
	 
	      
	      myReader.close();
	    } catch (FileNotFoundException a) {
	      System.out.println("An error occurred.");
	     
	     a.printStackTrace();
	    }
	}
	
	
 
      
     
	
	
	
	
	
	
	
	
	
	
	
	
	//function for the vectors
	public static void vectors() throws exceptionhandle
	{
		//setting the array equal to the getter function to access the index of array
		 String []array = getter();
	     
		 
		  try {
			  //reading vocabulary.txt
	      File myObj = new File(array[0]);
	      Scanner myReader = new Scanner(myObj);
	      while (myReader.hasNextLine()) {
	        String data = myReader.nextLine();
	      
	         //addaing data to treeset
	         ts1.add(data);
	       }

	 
	 
	      
	      myReader.close();
	    } catch (FileNotFoundException a) {
	      System.out.println("An error occurred.");
	     
	      a.printStackTrace();
	    }
		
		
		
		
		//getting the size of array
	  	 g= ts1.size(); 
	  	 
	  	 if(g==0)
	  	 {
	  		 throw new exceptionhandle("size is null");
	  	 }
tree_array=new String[g];
		  	  	    int h=0;
		  	      
		  	      for (String ele : ts1) 
		  	      {
		  	    	tree_array[h++] = ele; 
		  	    
		  	      } 
		  
	 
		  Vector<String> v = new Vector<String>();
		    
		  	  
	       
	 String data = null ; 
	 String op;   
	 vector_array=new String[array.length];
	  try {
		  File myObj = new File(array[1]);
	      Scanner myReader = new Scanner(myObj);
	      int s=0;
		  for(int count=0;count<array.length;count++)
		  {
			    
			   
			  myObj = new File(array[count]);
			  myReader = new Scanner(myObj);
			  if(count>=1)
			  {
	       while (myReader.hasNextLine()) {
	       data = myReader.nextLine();
	       vector_array[s]=data;
  	       
	       }
	      
	       
	      if(choice_getter()=='2')
	      {
	       System.out.println("vector build from the input files   "+"{"+vector_array[s]+"}");  
	      }
	       s++;
			
			  }
	          
		  }
 
		  
		   StringBuilder e = new StringBuilder();

		  for(int i=0;i<(vector_array.length-1);i++)
		  {
			  e.append(vector_array[i]);
		  }
		   b=e.toString();
		  
		   vector_array = b.split(" ");    
	         
		     
	        
	         for(int j=0;j<vector_array.length;j++)
	        {
	        	v.add(vector_array[j]);
	        	
	        	
	        }
	        
	      
	      
	      myReader.close();
	    } catch (FileNotFoundException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
 
	}
	 public static void frequency_calculation()
	  {
	  
	  
 int []size=new int [20];  
String[] result = new String[20];
int y=0;
int w=0; 

for(int i=0;i<tree_array.length;i++)
{
for(int count=0;count<vector_array.length;count++)
{
	  if(tree_array[i].equals(vector_array[count]))
	 {
		  w++;
		   
		   
	        result[i]=vector_array[count];
	       
} 
	  
}
size[i]=w;
w=0;
}

 

for(int count=0;result[count]!=null;count++)
{
	System.out.println("the frequency of    "+result[count] +"  is   " +size[count]);
y++;
}
	
	
	 
	}
	 
	
	 
	 public static void user_query()
	 {
		 Scanner sc =new Scanner(System.in); 
		 int []size=new int [200];  
		String[] result = new String[200];
		int y=0;
		int w=0; 
		int x;
		int u;
String input; 
String []arra;
System.out.println("enter the string which you want to check ");
input= sc.nextLine();  
	arra=input.split(" ");
	
 
	int d=0;
	
		for(int i=0;i<arra.length;i++)
		{
		for(int count=0;count<vector_array.length;count++)
		{
			  
			 
				
				 if(arra[i].equals(vector_array[count]))
				 {
					  w++;
					   
					   
				        result[i]=vector_array[count];
				       
			} 
				
				
		 	 
			 
		}
		size[i]=w;
		w=0;
		}

	 
		for(int i=0;i<arra.length;i++)
		{
		for(int count=0;count<tree_array.length;count++)
		{
			  
			 
				
				 if(arra[i].equals(tree_array[count]))
				 {
					  w++;
					   
					   
				        result[i]=tree_array[count];
				       
			} 
				
				
		 	 
				 
			 
		}
		size[i]+=w;
		w=0;
		}

		
		
		 for(int i=0;i<size.length;i++)
		 {
			 if(size[i]==0)
			 {
				 if(i==(size.length-1))
				 {
				 System.out.println("no word had match frequecy \n");
			 }
			 }
				 
		 }
		
		for(int count=0;result[count]!=null;count++)
		{
			System.out.println("the frequency of    "+result[count] +"  is   " +size[count]);
		y++;
		}
		
		
		
		
			
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	//thread function
	 public void run()
	 {
	 	  try {
			treeset();
			
		} catch (exceptionhandle e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 	try {
	 		
			vectors();
		} catch (exceptionhandle e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 	frequency_calculation();
	 }
	 
	 
	               
	
}
 
