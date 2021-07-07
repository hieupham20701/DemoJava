package Mypack;

import java.util.ArrayList;
import java.util.List;

public class Bean {
	public static List<Users> ExportUsers(){
		List<Users> list = new ArrayList<Users>();
		list.add(new Users("Hiệu", "Thành viên"));
		list.add(new Users("JavaWeb", "Myclass.vn"));
		return list;
	}
	
}
