package person;

abstract class Person {
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
	
	abstract String get_name();
}
