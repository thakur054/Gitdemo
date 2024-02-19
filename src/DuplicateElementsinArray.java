
public class DuplicateElementsinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean flag=false;
		String arr[]= {"java","c","python","java","kava"};
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("we have found duplicate Element:"+arr[i]);
					flag=true;
				}
			}
		}
		if(flag==false)
		{
			System.out.println("Not found duplicate Element");
		}
	}

}
