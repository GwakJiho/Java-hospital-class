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
	public Patient(String name, String birth, String gender , String phone,  // 환자 추가
			int id, int age, String sick, int depart) {
		super(name, birth,  gender,  phone);
		
		this.patient_id = id;
		this.age = age;   
		this.sickness = sick;
		this.department = depart;
	}
	
	
	public void Search_patient(String name) {  //이름으로 환자 검색
		if(this.name.equals(name)) {
			System.out.printf("%s %s %d %s ", sickness, dt.get_departments(department), age, birthDate);
		}
	}
	
	public void renewal_Room(Room_person r, int num, int department) { //환자에서 person 에 상속받은 데이터는 고유적이기 떄문에 가변데이터 Room ,sickenss, department 만 변경
		Room room = r.set_room(r.get_room_num());
		room.delete_room(this);
		Room new_room = r.set_room(num);
		new_room.add_Member(this);
		this.department = department;	
	}
	
	public void renewal_sickness(String sick) {
		this.sickness = sick;
	}
	
	
	public void setting_Admission(int manager,  int num, Room_person r) { // 입원처리
		this.doctor_id = manager;
		this.room_num =num;
		Room room = r.set_room(num);
		System.out.println(this.get_name() + " 을(를) " + this.room_num +"호실에 추가합니다.");
		room.add_Member(this);
	}
	
	
	public void Discharge() { // 퇴원처리
		this.doctor_id = 0;
		this.room_num = 0;
	}

	
}
