package Decorator;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class EncryClient {
	public static void main(String[] args) throws Exception{
		DataOutputStream dos = new DataOutputStream(
				new BufferedOutputStream(
						new EncryptOutputStream(
								new FileOutputStream("src/Decorator/IODecorator.txt"))));
		dos.write("helloworldxyz".getBytes());
		dos.close();
	}
}
