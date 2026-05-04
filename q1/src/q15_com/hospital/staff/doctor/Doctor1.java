package q15_com.hospital.staff.doctor;

//direct access
public class Doctor1 extends q15_com.hospital.staff.doctor.salary.Salary {
	public static void main(String[] args) {
		Doctor1 doctor1 = new Doctor1();
		System.out.println("Salary for doctor 1 via direct access");
		System.out.println(doctor1.calculateSalary(20000, 200));
	}
}
