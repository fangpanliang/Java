package cn.rjxy.computer;
/**
 * ̨ʽ���ࡣ
 * �̳и���Computer�ࡣ
 * @author ������
 */
import java.io.*;
public final class Dasktop extends Computer implements MsgInput{
	public String hosttype;//��������
	/**
	 * �޲ι��캯����
	 */
	public Dasktop() {	
	}
	/**
	 * �вι��췽����
	 * @param name ����
	 * @param brand Ʒ��
	 * @param cpu CPU����
	 * @param memory �ڴ�
	 * @param hardDisk Ӳ��
	 * @param monitor ��ʾ��
	 * @param hosttype ��������
	 */
	public Dasktop(String name,String brand,String cpu,String memory,String hardDisk,String monitor,String hosttype) {
		super(name,brand,cpu,memory,hardDisk,monitor);
		this.hosttype=hosttype;
	}
	/**
	 * ��д���󷽷�input��
	 */
	public void input() {
		super.inputMsg();
		System.out.println("\t"+hosttype);
	}
	public void out(FileWriter output) {
		String[] Msg=new String[] {name,brand,cpu,memory,hardDisk,monitor,hosttype};
		try {
			for(int i=0;i<7;i++) {
			output.write(Msg[i]);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}
	
}
