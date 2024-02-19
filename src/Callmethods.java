
public class Callmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Now Startingto create the object
		
		Callmethods m = new Callmethods();
		 String name = m.newmethod();
		 System.out.println(name);
		 demomethod d = new demomethod();
		 d.getuserdata();//this will call from different class ex.demomethods class and we are using the use case for this function o/p method working,addreturnstring,Testing Methods
	}

   public String newmethod()
   {
   System.out.println("method working");// for getting method to call we need to create the object of the respective class first
return "addreturnstring";
   }
}

