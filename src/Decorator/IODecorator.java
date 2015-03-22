package Decorator;

import java.io.*;

public class IODecorator {
	public static void main(String[] args) {
		DataInputStream dataInputStream = null;
		try {
			dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream("src/Decorator/IODecorator.txt")));
			
			byte bs[] = new byte[dataInputStream.available()];
			dataInputStream.read(bs);
			String content = new String(bs);
			System.out.println("ÎÄ¼þÄÚÈÝ£º" + content);
		} catch (Exception e) {
			// TODO: handle exception
		} 
	}
}
