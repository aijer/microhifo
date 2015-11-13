package tool;

import java.util.Random;

public class ObjectVersion {

	// generate obj's version
	
	public static String genObjVersion(int orgId,String objName, int userId) {
		String str_orgId= new Integer(orgId).toString();
		
		String str_userId = new Integer(userId).toString();
		String str_timestamp = new Long(System.currentTimeMillis()).toString();
		//String str_timestamp = new Long(timestamp).toString();
		String str_random = new Integer(getRandom()).toString();
		return str_timestamp + '-'+str_orgId+'-'+  objName + '-'
				+ str_userId + '-' + str_random;

	}
	


	// get Random from 100 to 999
	public static int getRandom() {
		int max = 999;
		int min = 100;
		Random random = new Random();
		int s = random.nextInt(max) % (max - min + 1) + min;
		return s;
	}

	// test
	public static void main(String[] args) {

/*		for (int i = 0; i < 100; i++) {
			// int s = o.getRandom();
			System.out.println(genObjVersion(111,111, 222, 333,1111111));
		}*/
	}
}
