package ex230424;

import java.nio.ByteBuffer;
import java.util.Arrays;

public class Main1 {

	public static void main(String[] args) {
		byte[] b=new byte[100];
		b[0]=1;//'A' -> ���� 1�� �Է� : �ƽ�Ű�ڵ� 49
		b[10]=66; //'B'
		System.out.println(b);
		System.out.println(new String(b));
		b[20]=67;//'C'
		b[21]=68;//'D'
		System.out.println(new String(b));
		
		//�迭�� ��ġ���� �ٸ������͸� �и�
		byte[] p=new byte[100];
		//b[0]:���� �и�, b[10]°�� �ִ� ���� �и�, b[20]���ڿ��� �и�
		System.arraycopy(b, 0, p, 0, 1); 
		//b�ȿ��� ���� �����Ͱ� ���縦 �ϰ� 
		//b�� 0��° ���� p�� 0��°�� 1�ڸ� ���縦 �Ѵ�.
		int protocol=p[0]; //�ƽ�ũ�ڵ� 1(soh)�� int������ �����ϸ� ����1�� ����
		System.out.println(protocol);//���� 1�� �ǹ�
		System.out.println((char)protocol); //soh

		System.arraycopy(b, 10, p, 0, 10); 
		//b�� 10��°���� p�� 0��°�� ����, b�� 10������� 10�ڸ� ��������
		System.out.println(new String(p));
		
		//b�� 20��° 10�ڸ� p�� �����ϼ���.
		System.arraycopy(b, 20, p, 0, 10); 
		System.out.println(new String(p));
		
		byte[] barray= {0x44,0x43,0x42,0x41}; //128�̻��� �ƽ�Ű�ڵ带 �Է½� �����߻�
		//barray[0]=0x00,barray[1]=0x00,barray[2]=0x00,barray[3]=0x01
		//int i=barray;//�迭�� ���ڷ� �ٲٴ� ���´� �����߻�
		//int i=barray[3];//�ϳ��� ����Ʈ�� ���ڷ� �����ϴ� ���� �����߻�����
		//int i=ByteBuffer.wrap(barray).getInt();
		//System.out.println(i);
		System.out.println(Arrays.toString(barray));
		System.out.println(new String(barray));
		
	}

}