package tool;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.*;

public class ObjTool {

	/**
	 * @param args
	 */

	/**
	 * 序列化对象
	 * 
	 * ＠throws IOException
	 */

	public static byte[] serializeObject(Object object) throws IOException {

		ByteArrayOutputStream saos = new ByteArrayOutputStream();

		ObjectOutputStream oos = new ObjectOutputStream(saos);

		oos.writeObject(object);

		oos.flush();

		return saos.toByteArray();

	}

	/**
	 * 反序列化对象
	 * 
	 * ＠throws IOException
	 * 
	 * ＠throws ClassNotFoundException
	 */

	public static Object deserializeObject(byte[] buf) throws IOException,
			ClassNotFoundException {

		Object object = null;

		ByteArrayInputStream sais = new ByteArrayInputStream(buf);

		ObjectInputStream ois = new ObjectInputStream(sais);
//		object = (Object)ois.readObject();
		object = ois.readObject();

		return object;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
