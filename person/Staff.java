package person;

import java.util.HashMap;
import java.util.Map;

import medical.*;



public class Staff extends Person {
	HashMap <Integer, String> staff_ = new HashMap<Integer, String>(){
		{
			put(1, "의사");put(2,"간호사"); put(3,"보안관리직원");
		}
	};
	
	Medical_department dt = new Medical_department();
	
	protected int department_id;
	protected int age;
	protected int Staff_id;
	protected int year;
	protected String stf_code;
	
	public Staff() {};

	
	public Staff(String name, String birth, String gender, String phone,
			int department_id, int age, int stf_id, String stf_code) {
		super(name, birth, gender, phone);
		this.department_id = department_id;
		this.age = age;
		this.Staff_id = stf_id;
		this.stf_code = stf_code;
	}
	public int get_code(String job) {
	        for (Integer key : staff_.keySet()) {
	            if (job.equals(staff_.get(key))) {
	                return key;
	            }
	        }
	        return 0;
	}
	public String get_job(int key) {
		return staff_.get(key);
	}
	
	
	public void change_staff_id(int id) {
		this.Staff_id = id;
	}
	
	public int get_age() {
		return this.age;
	}
	public int get_staff_id() {
		return this.Staff_id;
	}
	
	public String get_department() {
		return dt.get_departments(this.department_id);
	}
	
	
	public void move_department(Medical_personal MP, int code) {
		Medical_department team = MP.set_team(this.get_department());
		team.delete_Member(this);
		this.department_id =code;
		System.out.println(this.get_name() + " 을(를) " + this.get_department() +"로 이동합니다.");
		Medical_department team1 = MP.set_team(this.get_department());
		team1.add_Member(this);
		
	}
	
	public void add_team(Medical_personal MP) { //팀에 추가
		Medical_department team = MP.set_team(this.get_department());
		System.out.println(this.get_name() + " 을(를) " + this.get_department() +"에 추가합니다.");
		team.add_Member(this);
	}
	
	public void get_team_member(Medical_personal MP) {
		Medical_department team = MP.set_team(this.get_department());
		team.get_Member();
	}
	
	public void delete_team(Medical_personal MP) { //팀에서 삭제
		Medical_department team = MP.set_team(this.get_department());
		System.out.println(this.get_name() + " 을(를) " + this.get_department() +"에서 삭제합니다.");
		team.delete_Member(this);
	}
	
	@Override
	public String get_name() {
		return this.name;
	}
	void searchStaff(String name) {
		if(name.equals(get_name()) ) {
			System.out.printf("%d, %s, %s\n", get_staff_id() , get_department());
		}
	}	
	
	public String get_job() {
		return stf_code;
	}
	
}






