package temp;

public class Stringwrokout {

	public static void main(String[] args) {
		
		String s ="yogeshwaran";
		
		String temp=s.substring(0, 6);
		String temp2=s.substring(6, s.length());
		
	
		String first="";
		String second="";
		for(int i=temp.length()-1; i>=0;i--){
			
			first+=s.charAt(i);
			
		}
		for(int i=temp2.length()-1; i>=0;i--){
			second+=temp2.charAt(i);
			
			
		}
		System.out.println(s );
		System.out.println(first+second);
		
		
	}
	
	
}
