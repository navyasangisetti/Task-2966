package inheritance;

public class inherit {
	   String color = "Red";
	    public void honk() {
	    	System.out.println("Car has break");
	    }

}

 class Java extends inherit {
	   String name = "BMW";
	   public static void main(String args[]) {
		   Java obj = new Java();
	       obj.honk();
	       System.out.println("Car has accelerator");
	 
	
}
 }
