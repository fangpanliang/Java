package cn.rjxy.computer;
/**
 * 台式机类。
 * 继承父类Computer类。
 * @author 方潘亮
 */
import java.io.*;
public final class Dasktop extends Computer implements MsgInput{
	public String hosttype;//机箱类型
	/**
	 * 无参构造函数。
	 */
	public Dasktop() {	
	}
	/**
	 * 有参构造方法。
	 * @param name 名称
	 * @param brand 品牌
	 * @param cpu CPU名称
	 * @param memory 内存
	 * @param hardDisk 硬盘
	 * @param monitor 显示器
	 * @param hosttype 机箱类型
	 */
	public Dasktop(String name,String brand,String cpu,String memory,String hardDisk,String monitor,String hosttype) {
		super(name,brand,cpu,memory,hardDisk,monitor);
		this.hosttype=hosttype;
	}
	/**
	 * 重写抽象方法input。
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
