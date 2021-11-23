package as;
public class threads extends Thread{
	public void run() 
	{
		 threading obj=new threading();
		
			try {
				obj.treeset();
			} catch (exceptionhandle e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
	}
 
	
}


class threads2 extends Thread{
	public void run() 
	{
		 threading obj=new threading();
		 try {
			obj.vectors();
		} catch (exceptionhandle e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
class threads3 extends Thread{
	public void run() 
	{
		 threading obj=new threading();
		 try {
			obj.treeset();
		} catch (exceptionhandle e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
			//System.exit(0);
			  //obj=new threading();
			   try {
				obj.vectors();
			} catch (exceptionhandle e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 obj.frequency_calculation();
	}
	
}