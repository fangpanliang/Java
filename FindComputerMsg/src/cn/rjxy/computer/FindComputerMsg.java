package cn.rjxy.computer;
import java.util.*;
import java.io.*;
/**
 * ����
 * @author ������
 */
public class FindComputerMsg {
	public static void main(String[] args) {
		List<Computer> compu=new ArrayList<Computer>();
		//Computer[] compu=new Computer[7];
		int count=6;
		//��ʼ��6̨����
		Notebook a1=new Notebook("T61 ","	IBM ","Intel���2 ","2GB ","160GB ","14.1Ӣ�� ","6о ");
		Notebook a2=new Notebook("X60 ","	IBM ","Intel���2 ","512MB ","60GB ","12.1Ӣ�� ","6о ");
		Dasktop a3=new Dasktop("Lenovo5050 ","���� ","AMD����64	","1GB ","160GB ","22Ӣ�� ","��ʽ");
		Dasktop a4=new Dasktop("530MT ","	���� ","Intel���2 ","512MB ","80GB ","19Ӣ�� ","��ʽ");
		Notebook a5=new Notebook("u4000 ","	��˶ ","���i5	","4G ","160G ","14Ӣ�� ","9о");
		Dasktop a6=new Dasktop("Lenovo���� ","���� ","���i5	","8GB ","1T ","22Ӣ�� ","��ʽ");
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
			System.out.println("���û�ѡ�������1���鿴������Ϣ     2�����ӵ�����Ϣ     3��ɾ��������Ϣ      4���˳�");
			num=inputln.nextInt();
			switch(num) {
			case 1://��ʾ������Ϣ
				System.out.println("��ӳɹ�����ǰ������Ϣ����:");
				System.out.println("���\t�ͺ�����\t\tƷ��\tCPU\t\t�ڴ�\tӲ��\t��ʾ��\t���оƬ\t��������");
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
			case 2://��ӵ�����Ϣ
				System.out.println("������������ͣ�1���ʼǱ�      2��̨ʽ��");
				int a=0;
				a=inputln.nextInt();
				if(a==1) {
					System.out.print("������������ƣ�");
					String name1=inputln.next();
					System.out.print("������Ʒ�����ƣ�");
					String brand1=inputln.next();
					System.out.print("������CPU��");
					String cpu1=inputln.next();
					System.out.print("�������ڴ棺");
					String memory1=inputln.next();
					System.out.print("������Ӳ�̣�");
					String hardDisk1=inputln.next();
					System.out.print("��������ʾ��:");
					String monitor1=inputln.next();
					System.out.print("�������أ�");
					String battery1=inputln.next();
					Notebook a7=new Notebook(name1,brand1,cpu1,memory1,hardDisk1,monitor1,battery1);
					compu.add(a7);
					count++;
				}else if(a==2) {
					System.out.print("������������ƣ�");
					String name1=inputln.next();
					System.out.print("������Ʒ�����ƣ�");
					String brand1=inputln.next();
					System.out.print("������CPU��");
					String cpu1=inputln.next();
					System.out.print("�������ڴ棺");
					String memory1=inputln.next();
					System.out.print("������Ӳ�̣�");
					String hardDisk1=inputln.next();
					System.out.print("��������ʾ��:");
					String monitor1=inputln.next();
					System.out.print("������������ͣ�");
					String hosttype1=inputln.next();
					Dasktop a7=new Dasktop(name1,brand1,cpu1,memory1,hardDisk1,monitor1,hosttype1);
					compu.add(a7);
					count++;
				}else {
					System.out.println("��������");
				}
				break;
			case 3://ɾ��������Ϣ
				System.out.print("�������ɾ����ţ�");
				int b=inputln.nextInt();
				compu.remove(b-1);
				count--;
				System.out.println("ɾ������Ϣ���£�");
				System.out.println("���\t�ͺ�����\t\tƷ��\tCPU"+"\t\t�ڴ�\tӲ��\t��ʾ��\t���оƬ\t��������");
				for(int i=0;i<count;i++) {
					System.out.print(i+1+"\t");
					compu.get(i).input();
				}
				break;
			case 4:
				System.out.println("��лʹ�ã�");
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