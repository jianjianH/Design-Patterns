package Decorator;

import java.io.*;

public class EncryptOutputStream extends OutputStream{
	protected OutputStream os = null;
	
	protected EncryptOutputStream(OutputStream os) {
		this.os = os;
	}
	
	@Override
	public void write(int b) throws IOException {
		b += 2;
		if (b >= (97 + 26)) {
			b -= 26;
		}
		os.write(b);
	}
}
