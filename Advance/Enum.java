enum Status{
	Running, Failed, Pending, Success;
}

public class Demo {
    public static void main(String[] args) {

    	int i=5;
//    	Status s= Status.Running;
//    	Status s= Status.Failed;
//    	Status s= Status.NoIdea;
//    	Status s= Status.Success;
    	
//    	System.out.println(s);
//    	System.out.println(s.ordinal());
    	
    	Status[] ss=Status.values();
    	System.out.println(ss);
    	
    	for(Status s:ss)
    	{
    		System.out.println(s);
    		System.out.println(s+" : "+s.ordinal());
    	}

//--------------//--------------------//-----------------//

enum Status{
	Running, Failed, Pending, Success;
}

public class Demo {
    public static void main(String[] args) {

    	Status s=Status.Pending;
    	
    	switch(s)
    	{
    		case Running:
    			System.out.println("All Good");
    			break;
    			
    		case Failed:
    			System.out.println("Try Again");
    			break;
    			
    		case Pending:
    			System.out.println("Please Wait");
    			break;
    		
    		default:
    			System.out.println("Done");
    			break;
    	}
    	
    	if(s==Status.Running)
    		System.out.println("All Good");
    	else if(s==Status.Failed)
    		System.out.println("Try Again");
    	else if ( s==Status.Pending)
    		System.out.println("Please Wait");
    	else
    		System.out.println("Done");
    	
    }
}

//--------------//--------------------//-----------------//

enum Laptop{
    //	Mackbook(2000), XPS(2200), Surface(1500), ThinkPad(1800);
        Mackbook(2000), XPS(2200), Surface, ThinkPad(1800);
        
        private int price;
        
        private Laptop()
        {
            price=500;
        }
        
        private Laptop(int price)
        {
            this.price=price;
        }
        
        public int getPrice()
        {
            return price;
        }
        public void setPrice(int price)
        {
            this.price=price;
            System.out.println("in Laptop" + this.name());
        }
    }
    
    public class Demo {
        public static void main(String[] args) {
    
    //    	Laptop lap=Laptop.Mackbook;
    //    	System.out.println(lap+ " : "+lap.getPrice());
            
            for(Laptop lap : Laptop.values())
            {
                System.out.println(lap+" : "+lap.getPrice());
            }
        }
    }
    