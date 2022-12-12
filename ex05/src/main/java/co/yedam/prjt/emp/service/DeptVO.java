package co.yedam.prjt.emp.service;

import lombok.Data;

@Data
public class DeptVO {
	int departmentId;
	String departmentName;
	int managerId;
	int locationId;
	
	Integer first = 1;
	Integer last = 10;
}
