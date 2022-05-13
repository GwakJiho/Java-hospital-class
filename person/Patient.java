package person;

import medical.Medical_department;

public class Patient extends Person{
	private int patient_id;
	private int age;
	private String sickness;
	private int department;
	
	private int doctor_id = 0;
	private int room_num = 0;
	
	Medical_department dt = new Medical_department();
	//»ý¼ºÀÚ
	public Patient(String name, String birth, String gender , String phone, 
			int id, int age, String sick, int depart) {
		super(name, birth,  gender,  phone);
		this.patient_id = id;
		this.age = age;   
		this.sickness = sick;
		this.department = depart;
		
	}
	
	public void Search_patient(String name) {
		if(this.name.equals(name)) {
			System.out.printf("%s %s %d %s ", sickness, dt.get_departments(department), age, birthDate);
		}
	}
	
	public void setting_Admission(int manager,  int room) {
		this.doctor_id = manager;
		this.room_num = room;
	}
	
	public void Discharge() {
		this.doctor_id = 0;
		this.room_num = 0;
	}
	
}
