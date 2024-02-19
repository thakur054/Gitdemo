
public class Javaclasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Number=5;
		int New=6;
		char jan='b';
		String name="My first program";
		//float f=0.01;
		double ff=5.99;
		boolean Result=true;
		
		System.out.println(Number+ "Number");
		System.out.println(name);
		// Main funda for writting n defining the code is use like[ Datatype variable='value']
		
		
		//Arrays
		int[] Arr1=new int[4];
		Arr1[0]=1;
		Arr1[1]=2;
		Arr1[2]=3;
        Arr1[3]=4;	
        //o,2.3,4 are index of array
		//same meaning as above line dono ko aise he represent kar sakte hai
		int[] Arr2= {1,2,3,4,5};
		
		System.out.println(Arr1[0]);
		System.out.println(Arr2[3]);
		
		
		//For loop
		//int[] Arr2= {1,2,3,4,5,6.7.8.9}; // use this to find the length of array.length
		int[] Arr3= {1,2,3,4,5,6,7,8,9,22,23,55,66,88,99};
		
		for(int i=0; i<Arr3.length; i++)
		{
			
			if (Arr3[i]% 2==0)
			{		
		//make a program to show whether the array value is divisible by 2 or not		
	System.out.println(Arr3[i]);
		}
		else
		{
			System.out.println(Arr3[i]+ "is not divisible by 2");
		}
	}
		
	}
}
