public class Demo {

	public static void main(String[] args) {
		String name=new String();
		System.out.println(name);
		System.out.println(name.hashCode());
		System.out.println("hello "+name);
		System.out.println(name.concat("reddy"));
//      String name="Navin";
		
	}
}

//--------------//----------------//------------------//

//Mutable vs Immutable string

public class Demo {
	
	public static void main(String[] args) {
		String name="navin";
		name=name+"reddy";
		System.out.println("hello"+name);
		
		String s1="Navin";
		String s2="Navin";
		
		System.out.println(s1==s2);	
		
	}
}

//--------------//----------------//------------------//

//StringBuffer and StringBuilder

class Demo {
	public static void main(String[] args) 
	{
		StringBuffer sb= new StringBuffer("Navin");
//		System.out.println(sb.length());
//		System.out.println(sb.capacity());
		sb.append("Reddy");
		System.out.println(sb);
		
//		String str=sb.toString();
		
//		sb.deleteCharAt(2);
//		sb.insert(0,"Java");
//		sb.insert(6,"java");
//		sb.setLength(30);
		sb.ensureCapacity(100);
		
		System.out.println(sb);
	
	}
}