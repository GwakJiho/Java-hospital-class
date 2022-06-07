package medical;

import java.util.ArrayList;

import person.Staff;

public class Medical_personal{
		
	ArrayList<Medical_department> teams = new ArrayList<>();
	
	public Medical_department set_team(String name) { // ÆÀ ¼¼ÆÃ
		for (Medical_department team : teams) {
			if(team.get_name().equals(name)) {
				return team;
			}
		}
		Medical_department tm = new Medical_department(name);
		teams.add(tm);
		return tm;
	}

}
 