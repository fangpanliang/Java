package cn.rjxy.computer;
/**
 * �����ࡣ
 * Computer�ࡣ
 * @author ������
 */
import java.io.*;
public abstract class Computer implements MsgInput{
	public String name;//����
	public String brand;//Ʒ��
	public String cpu;//CPU
	public String memory;//�ڴ�
	public String hardDisk;//Ӳ��
	public String monitor;//��ʾ��
	/**
	 * �޲ι��췽����
	 */
	public Computer() {
	}
	/**
	 * �вι��췽����
	 * @param name ����
	 * @param brand Ʒ��
	 * @param cpu CPU����
	 * @param memory �ڴ�
	 * @param hardDisk Ӳ��
	 * @param monitor ��ʾ��
	 */
	public Computer(String name,String brand,String cpu,String memory,String hardDisk,String monitor) {
		this.name=name;
		this.brand=brand;
		this.cpu=cpu;
		this.memory=memory;
		this.hardDisk=hardDisk;
		this.monitor=monitor;
	}
	/**
	 * ��ʾ������Ϣ������
	 */
	public void inputMsg() {
		System.out.print(name+"\t"+brand+"\t"+cpu+"\t"+memory+"\t"+hardDisk+"\t"+monitor+"\t");
	}
	/**
	 * ���󷽷���
	 */
	public void out(FileWriter output) {
	}
	public abstract void input();
}
