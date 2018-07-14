package cn.rjxy.computer;

import java.io.FileWriter;

/**
 * 笔记本类。
 * 继承父类 Computer类。
 * @author 方潘亮。
 */
public final class Notebook extends Computer {
	private String battery;//电池芯片
	/**
	 * 无参构造方法。
	 */
	public Notebook() {	
	}
	/**
	 * 有参构造方法。
	 * @param name 名称
	 * @param brand 品牌
	 * @param cpu CPU名称
	 * @param memory 内存
	 * @param hardDisk 硬盘
	 * @param monitor 显示器
	 * @param battery 电池芯片
	 */
	public Notebook(String name,String brand,String cpu,String memory,String hardDisk,String monitor,String battery) {
		super(name,brand,cpu,memory,hardDisk,monitor);
		this.battery=battery;
	}
	/**
	 * 重写显示input函数。
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
