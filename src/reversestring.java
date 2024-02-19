
public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//here we are using length and charat method
		
		String str="anshulreversed";
		String rev="";
		
        int len=str.length();   //6 characters 
        //System.out.println(str.charAt(0)); just to show the concept to print according to the index
        
        for(int i=len-1; i>=0; i--)
        {
        
        	rev=rev+str.charAt(i);
        }
        
        System.out.println("Reversed value willl be:"+rev);
        
        }
}
