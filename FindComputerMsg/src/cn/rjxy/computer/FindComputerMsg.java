package cn.rjxy.computer;
import java.util.*;
import java.io.*;
/**
 * 主类
 * @author 方潘亮
 */
public class FindComputerMsg {
	public static void main(String[] args) {
		List<Computer> compu=new ArrayList<Computer>();
		//Computer[] compu=new Computer[7];
		int count=6;
		//初始化6台电脑
		Notebook a1=new Notebook("T61 ","	IBM ","Intel酷睿2 ","2GB ","160GB ","14.1英寸 ","6芯 ");
		Notebook a2=new Notebook("X60 ","	IBM ","Intel酷睿2 ","512MB ","60GB ","12.1英寸 ","6芯 ");
		Dasktop a3=new Dasktop("Lenovo5050 ","联想 ","AMD速龙64	","1GB ","160GB ","22英寸 ","立式");
		Dasktop a4=new Dasktop("530MT ","	戴尔 ","Intel酷睿2 ","512MB ","80GB ","19英寸 ","卧式");
		Notebook a5=new Notebook("u4000 ","	华硕 ","酷睿i5	","4G ","160G ","14英寸 ","9芯");
		Dasktop a6=new Dasktop("Lenovo天逸 ","联想 ","酷睿i5	","8GB ","1T ","22英寸 ","立式");
		compu.add(a1);
		compu.add(a2);
		compu.add(a3);
		compu.add(a4);
		compu.add(a5);
		compu.add(a6);
		Scanner inputln=new Scanner(System.in);
		int num=0;
		try {
		do{
			System.out.println("请用户选择操作：1：查看电脑信息     2：增加电脑信息     3：删除电脑信息      4：退出");
			num=inputln.nextInt();
			switch(num) {
			case 1://显示电脑信息
				System.out.println("添加成功，当前电脑信息如下:");
				System.out.println("序号\t型号名称\t\t品牌\tCPU\t\t内存\t硬盘\t显示器\t电池芯片\t机箱类型");
				for(int i=0;i<count;i++) {
					System.out.print((i+1)+"\t");
					compu.get(i).input();
				}
				File file=new File("D:/word.txt");
				if(!file.exists()) {
				try {
					file.createNewFile();
				}catch(Exception e) {
					e.printStackTrace();
				}
				}else {
					try {
						FileWriter put=new FileWriter(file);
						for(int i=0;i<count;i++) {
							compu.get(i).out(put);
						}
						put.close();
					}catch(Exception e) {
						e.printStackTrace();
					}
				}
				break;
			case 2://添加电脑信息
				System.out.println("请输入电脑类型：1：笔记本      2：台式机");
				int a=0;
				a=inputln.nextInt();
				if(a==1) {
					System.out.print("请输入电脑名称：");
					String name1=inputln.next();
					System.out.print("请输入品牌名称：");
					String brand1=inputln.next();
					System.out.print("请输入CPU：");
					String cpu1=inputln.next();
					System.out.print("请输入内存：");
					String memory1=inputln.next();
					System.out.print("请输入硬盘：");
					String hardDisk1=inputln.next();
					System.out.print("请输入显示器:");
					String monitor1=inputln.next();
					System.out.print("请输入电池：");
					String battery1=inputln.next();
					Notebook a7=new Notebook(name1,brand1,cpu1,memory1,hardDisk1,monitor1,battery1);
					compu.add(a7);
					count++;
				}else if(a==2) {
					System.out.print("请输入电脑名称：");
					String name1=inputln.next();
					System.out.print("请输入品牌名称：");
					String brand1=inputln.next();
					System.out.print("请输入CPU：");
					String cpu1=inputln.next();
					System.out.print("请输入内存：");
					String memory1=inputln.next();
					System.out.print("请输入硬盘：");
					String hardDisk1=inputln.next();
					System.out.print("请输入显示器:");
					String monitor1=inputln.next();
					System.out.print("请输入机箱类型：");
					String hosttype1=inputln.next();
					Dasktop a7=new Dasktop(name1,brand1,cpu1,memory1,hardDisk1,monitor1,hosttype1);
					compu.add(a7);
					count++;
				}else {
					System.out.println("输入有误！");
				}
				break;
			case 3://删除电脑信息
				System.out.print("请输入待删除序号：");
				int b=inputln.nextInt();
				compu.remove(b-1);
				count--;
				System.out.println("删除后信息如下：");
				System.out.println("序号\t型号名称\t\t品牌\tCPU"+"\t\t内存\t硬盘\t显示器\t电池芯片\t机箱类型");
				for(int i=0;i<count;i++) {
					System.out.print(i+1+"\t");
					compu.get(i).input();
				}
				break;
			case 4:
				System.out.println("感谢使用！");
				break;
			default:
					break;
			}
		}while(num<=3&&num>=1);
		}finally {
			inputln.close();
		}
	}
}