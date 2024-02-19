
public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0; i<=2; i++)
		{
		System.out.println("Outer loop started");//outerloop start and then finished but there is inner loop so first out loop will start for 1 st vaklue and then inner loop will start after finishing inner then it again comes to outer for 2nd value)
		
	     for(int j=0; j<=2; j++)
           {
        	   System.out.println("Inner loop");
           }
	     System.out.println("Outer loop Finished");
		}
		
		
	}

}
