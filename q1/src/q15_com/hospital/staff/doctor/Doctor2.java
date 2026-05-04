package q15_com.hospital.staff.doctor;

import q15_com.hospital.staff.doctor.salary.Salary;

//using import
public class Doctor2 extends Salary {
	public static void main(String[] args) {
		Doctor2 doctor2 = new Doctor2();
		System.out.println("Salary for doctor 2 via import");
		System.out.println(doctor2.calculateSalary(30000, 200));
	}
}
