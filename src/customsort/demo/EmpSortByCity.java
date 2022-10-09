package customsort.demo;

import java.util.*;

public class EmpSortByCity implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
			
		return e1.city.compareTo(e2.city);

	}

}
