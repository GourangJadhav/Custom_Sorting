package customsort.demo;

import java.util.*;

public class EmpSortByName implements Comparator<Employee>{

	@Override
	public int compare(Employee s1, Employee s2) {
		
		return s1.name.compareTo(s2.name);
	}
}
