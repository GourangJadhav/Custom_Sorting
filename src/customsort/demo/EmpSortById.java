package customsort.demo;

import java.util.*;

public class EmpSortById implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		
		if(e1.id == e2.id)
		return 0;
		else if (e1.id > e2.id)
		 return 1;
		else
			return -1;
	}

}
