import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws NumberFormatException {   
    	
    	int i=0;
    	int j=0;
    	try
    	{
    		j=18/i;
    		
    	}
    	catch(Exception e)
    	{
    		System.out.println("Someting went wrong.");
    		System.out.println("Bye");
    	}
    	finally
    	{
    		System.out.println("Bye");
    	}
    	
    	
    	int num=0;
    	//BufferedReader br=null;
    	try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in)))
    	{
//    		InputStreamReader in =new InputStreamReader(System.in);
//    		BufferedReader br=new BufferedReader(in);
    		num=Integer.parseInt(br.readLine());
    		System.out.println(num);
    	}
    	finally
    	{
    		//br.close();
    	}
    }
    
}
//-------------//-----------//-----------//

//Exception Handling with try catch

public class Demo {
    public static void main(String[] args) {
    
    int i=0;
    int j=0;
   
    try
    {
    	j=18/i;
    }
    catch(Exception e)
    {
    	System.out.println("Something went wrong");
    }
    System.out.println(j);
    
    System.out.println("Bye");
    }
}

//------------//---------------//--------------//

//try with multiple catch block

public class Demo {
    public static void main(String[] args) {
    	
    	int i=2;
  //  	int i=0;
    	int j=0;
    	
    	int nums[]=new int[5];
    	String str=null;
    	
    	try
    	{
    		j=18/i;
    		System.out.println(str.length());
    		System.out.println(nums[1]);
    		System.out.println(nums[5]);
    	}
//    	catch(Exception e)
//    	{
//  
//    		System.out.println("Something went wrong."+e);
//    	}
    	catch(ArithmeticException e)
    	{
    		System.out.println("Cannot divide by zero");
    	}
    	catch(ArrayIndexOutOfBoundsException e)
    	{
    		System.out.println("Stay in your limit.");
    	}
    	catch(Exception e)
    	{
  
    		System.out.println("Something went wrong."+e);
    	}
    	System.out.println(j);
    	System.out.println("Bye");
    }
}


//------------//--------------//-------------//

//  Exception Hierarchy

Error and Exception extends Throwable class.
Throwable class is extended by Object class.

Error is divided into :-
1. Thread Death
2. Virtual Machine error ( Out of memory)
3. IO Error

Exception is divided into:-
1. Runtime Exception  (Unchecked Exception)
	- Arithmetic 
	- ArrayIndexOutOfBound
	- Null POinter
- It is your choose to handle or not

2. SQL Exception   (Checked Exception)
- It is necessary to handle

3. IO Exception  (Checked Exception)
- It is necessary to handle


//------------//--------------//-------------//

//  Exception throw keyword

public class Demo {
    public static void main(String[] args) {
    	
//    	int i=2;
    	int i=0;
    	int j=0;
 
    	
    	try
    	{
    		j=18/i;
    		if(j==0)
    			throw new ArithmeticException("I don't want to do print zero");
    	}

    	catch(ArithmeticException e)
    	{
    		j=18/i;
    		System.out.println("that is default output"+e);

//    		System.out.println("Cannot divide by zero");
    	}
    	
    	catch(Exception e)
    	{
  
    		System.out.println("Something went wrong."+e);
    	}
    	System.out.println(j);
    	System.out.println("Bye");
    }
}


//------------//--------------//-------------//

//  Custom Exception

class NavinException extends Exception
{
	public NavinException(String string)
	{
		super(string);
	}
}
public class Demo {
    public static void main(String[] args) {
    	
//    	int i=2;
//   	int i=0;
    	int i=20;
    	int j=0;
 
    	
    	try
    	{
    		j=18/i;
    		if(j==0)
//    			throw new Exception("I don't want to do print zero");
    			throw new NavinException("I don't want to do print zero");
    	}

    	catch(ArithmeticException e)
    	{
    		j=18/i;
    		System.out.println("that is default output"+e);

//    		System.out.println("Cannot divide by zero");
    	}
    	
    	catch(Exception e)
    	{
  
    		System.out.println("Something went wrong."+e);
    	}
    	System.out.println(j);
    	System.out.println("Bye");
    }
}


//------------//--------------//-------------//

//  Ducking Exception using throws

class NavinException extends Exception
{
	public NavinException(String string)
	{
		super(string);
	}
}

class A
{
	public void show() throws ClassNotFoundException
	{
//    	try
//    	{
//    		Class.forName("Calc");
//    	}
//    	catch(ClassNotFoundException e)
//    	{
//    		System.out.println("Not able to find theh class");
//    	}
		
		Class.forName("Calc");
	}
}

public class Demo {
	
	static {
		System.out.println("Class Loader");
	}
	
    public static void main(String[] args) {
    	
//    	try
//    	{
//    		Class.forName("Class");
//    	}
//    	catch(ClassNotFoundException e)
//    	{
//    		System.out.println("Not able to find theh class");
//    	}
    	
    	A obj=new A();
    	try {
    		obj.show();
    	}catch(ClassNotFoundException e)
    	{
    		e.printStackTrace();
    	}
    	
    	
    }
}
