package ex230328;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class Main5 {

	public static void main(String[] args) throws IOException {
		//File�� sungjuk.txt�� �����
		//���� ������ "ȫ�浿 10 20 30" ���� ����Ѵ�.
		//���Ͽ��� ������ ������ ������ �и��Ͻÿ�.(���ڿ��и�)
		// ���ڴ� ������ int kor, eng, math�� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		//1.������ ����
		File f=new File("sungjuk.txt");
		System.out.println(f.exists());
		//FileReader is=new FileReader(f);
		//2.�������帧->�޸𸮰��� ������ �帧
		FileInputStream is=new FileInputStream(f);
		String s="";
		while(is.available()>0) {
			//System.out.print((char)is.read());
			//System.out.println(String.valueOf((char)is.read()));
			//�ѹ��ڸ� ���ڿ��� ������Ű�� �۾�
			s=s.concat(String.valueOf((char)is.read()));
			//s=s+String.valueOf((char)is.read());
			//System.out.println(s);
		}
		System.out.print(s);
		//3.���ڿ��� �и��ϴ� �۾�
		String[] read=s.split(" ");
		String name=read[0];
		int kor=Integer.parseInt(read[1]);
		int eng=Integer.parseInt(read[2]);
		int math=Integer.parseInt(read[3]);
		System.out.printf("%s���� ����:%d ����:%d ����:%d �հ�:%d ���:%.2f �Դϴ�.",
				name, kor, eng, math, (kor+eng+math),(float)(kor+eng+math)/3);
	}

}