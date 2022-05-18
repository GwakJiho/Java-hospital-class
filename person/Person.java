package person;

public class Person {
	protected String name;
	protected String birthDate;
	protected String gender;
	protected String phone_num;
	
	
	public Person(String name, String birth, String gender, String phone) {
		this.name = name;
		this.birthDate = birth;
		this.gender = gender;
		this.phone_num = phone;
	}
	
	public String get_name() {
		return this.name;
	}
	public String get_birth() {
		return this.birthDate;
	}
	public String get_gender(){
		return this.gender;
	}
	public String get_phone_num(){
		return this.phone_num;
	}
	
	public void set_name(String name){
		this.name = name;
	}
	public void set_birth(String date){
		this.birthDate = date;
	}
	public void set_gender(String gender){
		this.gender = gender;
	}
	public void set_phone_num(String num){
		this.phone_num = num;
	}
	
}
	
