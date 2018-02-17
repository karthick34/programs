package temp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.SystemPropertyUtils;



public class databaseInsert {

	
	public static void main(String[] args) throws ClassNotFoundException {
		
		
		Class.forName("oracle.jdbc.driver.OracleDriver");

		try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "SYSTEM",
				"Yogesh");) {

			PreparedStatement ps = connection.prepareStatement("INSERT INTO list VALUES(?,?)");
			
			PreparedStatement ps2 = connection.prepareStatement("select e_name from list where city=?");
			List<Employee> ls = new ArrayList<Employee>(); 
			
			Employee e = new Employee();
			e.setName("karthik");
			e.setCity("kark");
			

			Employee e2 = new Employee();
			e2.setName("yogesh");
			e2.setCity("chennai");
			
			ls.add(e);
			ls.add(e2);
/*			
		
			for (Employee employee : ls) {
				ps.setString(1, employee.getName());
				ps.setString(2, employee.getCity());
				ps.executeQuery();
				
			}
		
		*/
		String city="kark1";
			
			ps2.setString(1, city);
			int rs=ps2.executeUpdate();
			if(rs!=1){

				ps.setString(1, "karthik");
				ps.setString(2, city);
				ps.executeQuery();
			}
			else{
				System.out.println("user not allowed");
			}
			
			System.out.println();
		

		} catch (Exception e) {
			// TODO: handle exception
		}

		
	}
}
