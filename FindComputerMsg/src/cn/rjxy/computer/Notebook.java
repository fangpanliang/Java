package cn.rjxy.computer;

import java.io.FileWriter;

/**
 * �ʼǱ��ࡣ
 * �̳и��� Computer�ࡣ
 * @author ��������
 */
public final class Notebook extends Computer {
	private String battery;//���оƬ
	/**
	 * �޲ι��췽����
	 */
	public Notebook() {	
	}
	/**
	 * �вι��췽����
	 * @param name ����
	 * @param brand Ʒ��
	 * @param cpu CPU����
	 * @param memory �ڴ�
	 * @param hardDisk Ӳ��
	 * @param monitor ��ʾ��
	 * @param battery ���оƬ
	 */
	public Notebook(String name,String brand,String cpu,String memory,String hardDisk,String monitor,String battery) {
		super(name,brand,cpu,memory,hardDisk,monitor);
		this.battery=battery;
	}
	/**
	 * ��д��ʾinput������
	 */
	public void input() {
		super.inputMsg();
		System.out.println(battery);
	}
	public void out(FileWriter output) {
		String[] Msg=new String[] {name,brand,cpu,memory,hardDisk,monitor,battery};
		try {
			for(int i=0;i<7;i++) {
			output.write(Msg[i]);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}
}
