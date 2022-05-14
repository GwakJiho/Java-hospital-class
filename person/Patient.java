package person;

import hospital.Room;
import hospital.Room_person;
import medical.Medical_department;
import medical.Medical_personal;

public class Patient extends Person{
	private int patient_id;
	private int age;
	private String sickness;
	private int department;
	
	private int doctor_id = 0;
	private int room_num = 0;
	
	Medical_department dt = new Medical_department();
	//생성자
	public Patient(String name, String birth, String gender , String phone, 
			int id, int age, String sick, int depart) {
		super(name, birth,  gender,  phone);
		this.patient_id = id;
		this.age = age;   
		this.sickness = sick;
		this.department = depart;
		
	}
	
	public void Search_patient(String name) {  //환자 검색
		if(this.name.equals(name)) {
			System.out.printf("%s %s %d %s ", sickness, dt.get_departments(department), age, birthDate);
		}
	}
	
	public void setting_Admission(int manager,  int num, Room_person r) { // 입원처리
		this.doctor_id = manager;
		this.room_num =num;
		Room room = r.set_room(num);
		System.out.println(this.get_name() + " 을(를) " + this.room_num +"호실에 추가합니다.");
		room.add_Member(this);
	}
	
	
	public void Discharge() {
		this.doctor_id = 0;
		this.room_num = 0;
	}

	@Override
	public String get_name() {
		return this.name;
	}
	
}
