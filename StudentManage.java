package StudentClass;

import java.util.*;

public class StudentManage extends StudentClass implements Comparable<StudentManage>{
	private Vector<StudentClass> stuList = new Vector<StudentClass>();
	
	public Vector<StudentClass> getStuList(){
		return stuList;
	}
	
	public void addStu2StuList(StudentClass stu){
		if (stu == null){
			return;
		}
		StudentClass stuTemp = new StudentClass();
		if (stu.getID() != 0 && stu.getStuName() != null){
			stuTemp.setID(stu.getID());
			stuTemp.setStuName(stu.getStuName());
			stuTemp.setAddress(stu.getAddress());
			stuTemp.setAge(stu.getAge());
			stuTemp.setGPA(stu.getGPA());
		}
		stuList.add(stuTemp);
	}
	
	public void removeStuFromStuList(StudentClass stu){
		if (stu == null){
			return;
		}
		
		for (int pos = 0; pos < stuList.size(); pos++){
			StudentClass stuTemp = stuList.elementAt(pos);
			if (stuTemp.getID() == stu.getID()){
				stuList.remove(pos);
			}
		}
	}
	
	public StudentClass showStudentByID (int stu_id){
		if (stu_id == 0){
			return null;
		}
		
		for (int pos = 0; pos < stuList.size(); pos++){
			StudentClass stuTemp = stuList.elementAt(pos);
			if (stuTemp.getID() == stu_id){
				System.out.println(stuTemp.getID() + " " + stuTemp.getStuName() + " " + stuTemp.getGPA() + " " + stuTemp.getAge());
				return stuTemp;
			}
		}
		
		return null;
	}
	
	public Vector<StudentClass> showStudentByName (String stu_name){
		if (stu_name == null){
			return null;
		}
		
		Vector<StudentClass> listTheSameStuName = new Vector<StudentClass>();
		for (int pos = 0; pos < stuList.size(); pos++){
			StudentClass stuTemp = stuList.elementAt(pos);
			if (stuTemp.getStuName() == stu_name){
				listTheSameStuName.add(stuTemp);
			}
		}
		
		return listTheSameStuName;
	}
	
	public static void shortStuByGPAIncrease(final String field, Vector<StudentClass> stuList){
        Collections.sort(stuList, new Comparator<StudentClass>() {
        	public int compare(StudentClass object1, StudentClass object2) {
                try {
                	if (field.equals("name")){
                		return object1.getStuName().compareTo(object2.getStuName());
                	}
                	if (field.equals("gpa")){
                		return (int) (object1.getGPA() - object2.getGPA());
                	}
                	if (field.equals("age")){
                		return (int) (object1.getAge() - object2.getAge());
                	}
                	if (field.equals("id")){
                		return (int) (object1.getID() - object2.getID());
                	}
                } catch (SecurityException e) {
                    e.printStackTrace();
                }
                return 0;
            }
        });
    }

	public int compareTo(StudentClass arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int compareTo(StudentManage arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
//	public Vector<StudentClass> shortStuByGPAIncrease (){
//		Vector<StudentClass> stuListTemp = new Vector<StudentClass>();
//		
//		for (int pos = 0; pos < stuList.size(); pos++){
//			stuListTemp.add(stuList.get(pos));
//		}
//		Collections.sort(stuListTemp, new Comparator<StudentClass>(){
//			@Override
//			public int compare(StudentClass stu1, StudentClass stu2){
//				return stu1.getGPA()stu1.compare;
//			}
//
//		});
//		
//		Vector<StudentClass> shortStuList = new Vector<StudentClass>();
//		int posStu = 0;
//		
//		for (int pos = 0; pos < stuListTemp.size(); pos++){
//			StudentClass stu = new StudentClass();
//			stu = stuListTemp.get(pos);
//			posStu = pos;
//			for(int pos1 = 0; pos1 < stuListTemp.size(); pos1++){
//				if (stu.getGPA() < stuListTemp.get(pos1).getGPA()){
//					stu = stuListTemp.get(pos1);
//					posStu = pos1;
//				}
//			}
//			shortStuList.add(stu);
//			stuListTemp.remove(posStu);
//			pos = -1;
//		}
//		
//		return shortStuList;
//	}
}
