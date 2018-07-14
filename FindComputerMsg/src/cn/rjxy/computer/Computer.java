package cn.rjxy.computer;
/**
 * 抽象类。
 * Computer类。
 * @author 方潘亮
 */
import java.io.*;
public abstract class Computer implements MsgInput{
	public String name;//名称
	public String brand;//品牌
	public String cpu;//CPU
	public String memory;//内存
	public String hardDisk;//硬盘
	public String monitor;//显示器
	/**
	 * 无参构造方法。
	 */
	public Computer() {
	}
	/**
	 * 有参构造方法。
	 * @param name 名称
	 * @param brand 品牌
	 * @param cpu CPU名称
	 * @param memory 内存
	 * @param hardDisk 硬盘
	 * @param monitor 显示器
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
	 * 显示电脑信息函数。
	 */
	public void inputMsg() {
		System.out.print(name+"\t"+brand+"\t"+cpu+"\t"+memory+"\t"+hardDisk+"\t"+monitor+"\t");
	}
	/**
	 * 抽象方法。
	 */
	public void out(FileWriter output) {
	}
	public abstract void input();
}
