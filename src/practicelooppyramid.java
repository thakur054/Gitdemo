
public class practicelooppyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//check the execution result first
		int k=1;              //introduce seprate  variable
		for(int i=0; i<=4; i++)
		{
			//System.out.println("outer loop started");
			
			for(int j=1; j<=4-i; j++)
			{
				System.out.print(k);
				System.out.print("\t");   //we use '\t' for space
				k++;
			}
			    System.out.println( "");  //we use this for ("")blank space to point out next line
			}

	}

}


