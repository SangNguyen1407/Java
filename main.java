package StudentClass;

import java.io.*; 
import java.util.*; 

public class main {
	public static void main (String[] args){
		StudentClass stu1 = new StudentClass();
		StudentClass stu2 = new StudentClass();
		StudentClass stu3 = new StudentClass();
		StudentClass stu4 = new StudentClass();
		
		StudentManage stuManage = new StudentManage();
		
		stu1.setStu(123450, "NGUYEN VAN TEO", 20, "1 NGUYEN VAN CONG, PHUONG 2, GO VAP, HCM", (float) 7.5);
		stu2.setStu(123451, "NGUYEN THI A", 27, "1 PHAN DANG LUU, PHUONG 1, BINH THANH, HCM", (float) 3.0);
		stu3.setStu(123452, "NGUYEN VAN TEO EM", 23, "1-1-4 SHIZUMI, MINAMIKU, FUKUOKA, JAPAN", (float) 5.5);
		stu4.setStu(123453, "NGUYEN THI A", 21, "2 NGUYEN VAN CONG, PHUONG 2, Go VAP, HCM", (float) 10.0);
		
		
		stuManage.addStu2StuList(stu1);
		stuManage.addStu2StuList(stu2);
		stuManage.addStu2StuList(stu3);
		stuManage.addStu2StuList(stu4);
		
		stuManage.showStudentByID(123450);
		System.out.println("--LIST DANH SACH SV TRUNG TEN--");
		Vector<StudentClass> listStuName = stuManage.showStudentByName("NGUYEN THI A");
		for (int pos = 0; pos < listStuName.size(); pos ++){
			StudentClass stu = listStuName.get(pos);
			stuManage.showStudentByID(stu.getID());
		}
		
		Vector<StudentClass> stuListTemp = new Vector<StudentClass>();
		for (int pos = 0; pos < stuManage.getStuList().size(); pos++){
			stuListTemp.add(stuManage.getStuList().get(pos));
		}
		
		System.out.println("\n--SORT NAME TRONG LIST DANH SACH--");
		stuManage.shortStuByGPAIncrease("name",stuListTemp);
		for (int pos = 0; pos < stuListTemp.size(); pos ++){
			StudentClass stu = stuListTemp.get(pos);
			stuManage.showStudentByID(stu.getID());
		}
		
		System.out.println("\n--SORT GPA TRONG LIST DANH SACH--");
		stuManage.shortStuByGPAIncrease("gpa",stuListTemp);
		for (int pos = 0; pos < stuListTemp.size(); pos ++){
			StudentClass stu = stuListTemp.get(pos);
			stuManage.showStudentByID(stu.getID());
		}
		
		System.out.println("\n--SORT AGE TRONG LIST DANH SACH--");
		stuManage.shortStuByGPAIncrease("age",stuListTemp);
		for (int pos = 0; pos < stuListTemp.size(); pos ++){
			StudentClass stu = stuListTemp.get(pos);
			stuManage.showStudentByID(stu.getID());
		}
		
		System.out.println("\n--SORT ID TRONG LIST DANH SACH--");
		stuManage.shortStuByGPAIncrease("id",stuListTemp);
		for (int pos = 0; pos < stuListTemp.size(); pos ++){
			StudentClass stu = stuListTemp.get(pos);
			stuManage.showStudentByID(stu.getID());
		}
	}

}
