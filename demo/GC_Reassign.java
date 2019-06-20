package Demo_package;

public class GC_Reassign
{
	// to store object name 
	String obj_name; 
	      
	    public void Test(String obj_name)  
	    { 
	        this.obj_name = obj_name; 
	    } 
	      
	    // Driver method 
	    public static void main(String args[]) 
	    { 
	        Test t1 = new Test("t1"); 
	        Test t2 = new Test("t2"); 
	          
	        //t1 now referred to t2 
	        t1 = t2; 
	          
	        // calling garbage collector 
	        System.gc(); 
	    } 
}
