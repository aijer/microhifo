package tool;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;

public class JsonTool {

	/**
	 * @param args
	 */

	public static String gnerateJsonFromObject(Object object) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		return mapper.writeValueAsString(object);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		List<Person> arrList = new ArrayList<Person>();
		Person person = new Person("kang", 24);
		arrList.add(person);
		String str = null;
		try {
			str = gnerateJsonFromObject(arrList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(str);*/

	}

}
