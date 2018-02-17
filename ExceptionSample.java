import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ExceptionSample {

	public static void main(String[] args) throws CustomException  {
		System.out.println("Enter ur age");
		Scanner s = new Scanner(System.in);
		
		if(s.nextInt()<18){
			throw new CustomException("you r not right to vote");
		}
		else{
			System.out.println("thanks fro voting");
		}
		
	}

}



class CustomException extends Exception{
	
	public CustomException(String string) {
		super(string);
	}
	
	
}
