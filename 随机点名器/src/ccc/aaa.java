package ccc;

import java.util.*;
public class ccc {
	public static void main(String[] args)
	{
		System.out.println("20201101289 Ԭ���");
		Scanner sc=new Scanner(System.in);
		String[] name = new String[3];
		for(int i=0;i<3;i++)
		{
			System.out.println("�����"+(i+1)+"��ѧ��������");
			name[i]=sc.next();
		}
		for(int i=0;i<3;i++)
		{
			System.out.println("��"+(i+1)+"��ѧ������Ϊ��"+name[i]);
		}
		int ran=new Random().nextInt(3);
		System.out.printf("���㵽����ͬѧ������Ϊ��"+name[ran]);
	}
}