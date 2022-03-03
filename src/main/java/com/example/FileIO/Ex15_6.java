package FileIO;

import java.io.*;

class Ex15_6 {
	public static void main(String args[]) {
		try {
		     FileOutputStream fos = new FileOutputStream("123.txt");
		     // BufferedOutputStream�� ���� ũ�⸦ 5�� �Ѵ�.
		     BufferedOutputStream bos = new BufferedOutputStream(fos, 5);
		     // ���� 123.txt��  1 ���� 9���� ����Ѵ�.
		     for(int i='1'; i <= '9'; i++) {
			     bos.write(i);
		     }

		     fos.close();  // FileOutputStream�� �ݴ´�
		} catch (IOException e) {
		     e.printStackTrace();		
		}
	}
}