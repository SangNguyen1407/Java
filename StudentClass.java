package StudentClass;

public class StudentClass {
	private int id;
	private String stu_name;
	private int age;
	private String address;
	private float gpa;
	
	public int getID (){
		return id;
	}
	
	public String getStuName(){
		return stu_name;
	}
	
	public int getAge(){
		return age;
	}
	
	public String getAddress(){
		return address;
	}
	
	public float getGPA(){
		return gpa;
	}
	
	public void setID(int new_id){
		this.id = new_id; 
	}
	
	public void setStuName(String stu_name){
		this.stu_name = stu_name; 
	}
	
	public void setAge (int age){
		this.age = age; 
	}
	
	public void setAddress (String address){
		this.address = address; 
	}

	public void setGPA (float GPA){
		this.gpa = GPA; 
	}
	
	public void setStu(int new_id, String stu_name, int age, String address, float f){
		if (new_id == 0){
			return;
		}
		if (stu_name == null){
			return;
		}
		
		setID(new_id);
		setStuName(stu_name);
		setAddress(address);
		setAge(age);
		setGPA(f);
		
	}

}
