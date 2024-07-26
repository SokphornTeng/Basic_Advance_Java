public class Demo {
	public static void main(String[] args) {
//      int nums[]= {3,7,2,4};
//		nums[1]=6;
//		System.out.println(nums[1]);
		
		int nums[]=new int[4];
		nums[0]=4;
		nums[1]=8;
		nums[2]=3;
		nums[3]=9;
		
//		System.out.println(nums[0]);
//		System.out.println(nums[1]);
//		System.out.println(nums[2]);
//		System.out.println(nums[3]);
		
		for (int i=0;i<4;i++) {
			System.out.println(nums[i]);
		}
		
	}
}

//--------------//--------------//----------------//-----------------//

// Multi Dimensional Array

public class Demo {
	public static void main(String[] args) {
		int nums[][]=new int [3][4];
		//inr random=0;
		//int random=(int)Math.random()*100;
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				nums[i][j]=(int)Math.random()*100;
				System.out.println(nums[i][j]);
			}
			System.out.println();
		}
		
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.println(nums[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int n[]:nums)
		{
			for(int m:n)
			{
				System.out.println(m+" ");
			}
			System.out.println();
		}
	}
}

//--------------//--------------//----------------//-----------------//

//  jagged and 3D Array

public class Demo {
	public static void main(String[] args) 
	{
//		int nums[][]=new int [3][]; //jagged
//		nums[0]=new int [3];
//		nums[1]=new int [4];
//		nums[2]=new int [2];
		
		int nums[][]=new int [3][4];
//		int nums[][]=new int [3][4][5]; // three dimensional
		
		for(int i=0;i<nums.length;i++)
		{
			for(int j=0;j<nums[i].length;j++)
			{
				nums[i][j]=(int)(Math.random()*10);
			}
		}
	}
}

//--------------//--------------//----------------//-----------------//

//  drawbacks of Array

public class Demo {
	public static void main(String[] args) 
	{
		int nums[]=new int[4];
	}
}


Drawbacks:-
- The memory allocation is contiguous.
- The size of an array is fixed. Array size cannot be expand.
- Searching takes time.
- Array can store values of only same type. It can store homogeneous type value only.

//--------------//--------------//----------------//-----------------//

//  Array Of Objects

class Student
{
	int rollno;
	String name;
	int marks;	
}

public class Demo {
	public static void main(String[] args) 
	{
		Student s1=new Student();
		s1.rollno=1;
		s1.name="Navin";
		s1.marks=88;
		
		Student s2=new Student();
		s2.rollno=2;
		s2.name="Harsh";
		s2.marks=67;
		
		Student s3=new Student();
		s3.rollno=3;
		s3.name="Kiran";
		s3.marks=97;
		
		System.out.println(s1.name + ":"+ s1.marks);
		
		Student students[]=new Student[3];
		students[0]=s1;
		students[1]=s2;
		students[2]=s3;
		
		for(int i=0;i<students.length;i++)
		{
			System.out.println(students[i].name+":"+students[i].marks);
		}
		
		
		
//		int nums[] = new int[6];
//		nums[0]=4;
//		nums[1]=8;
//		nums[2]=3;
//		nums[3]=9;
//		
//		for(int i=0;i<nums.length;i++)
//		{
//			System.out.println(nums[i]);
//		}
	}
}