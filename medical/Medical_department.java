package medical;

import java.util.HashMap;

public class Medical_department {
	HashMap<Integer,String> departments = new HashMap<Integer, String>(){
		{
		put(1234, "�ܰ�");put(1345, "���Ȱ�����");put(1533, "��ǰ��������");
		put(1235, "����");put(1553, "����������");
		put(1236, "���Ű�");
		put(1237, "�Ҿư�");
		}
	};
	
	public String get_departments(int code) {
		return departments.get(code);
	}
	
	
}
