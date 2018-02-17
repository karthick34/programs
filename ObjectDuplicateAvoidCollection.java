package temp;

import java.util.HashSet;
import java.util.Set;


public class ObjectDuplicateAvoidCollection {

 public static void main(String[] args) {
		Set<Employee> set = new HashSet<>();
		
			Employee employee = new Employee();
			employee.setName("KARTHIK");
			employee.setCity("KARAIKUDI");
			

			Employee employee1 = new Employee();
			employee1.setName("KARTHIK");
			employee1.setCity("KARAIKUDI");
			

			Employee employee2 = new Employee();
			employee2.setName("KARTHIK");
			employee2.setCity("KARAIKUDI");
			
			
			set.add(employee);
			set.add(employee1);
			set.add(employee2);
			
		
		
		
		
		for (Employee string :set) {
			System.out.println(string.getName()+"   >>>>"+ string.getCity());
		}
}
	
}


class Employee {

	private String name;
	private String city;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub

		

		Employee employee = (Employee) obj;

		return (this.city.equalsIgnoreCase(employee.city) && this.name.equalsIgnoreCase(employee.name));
		
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.name.hashCode();
	}

}
