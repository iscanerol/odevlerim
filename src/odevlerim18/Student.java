package odevlerim18;

public class Student {

	int number;     
	static String name;   
	static String college ="ITS";

	Student(int r, String n, String college) {
		number = r;
		name = n;
		Student.college = college;
	}

	public static void main(String args[]){   
		Student s1 = new Student(111,"Karan", name);//Student s1 = new Student(111,”Karan", “MIT”);"
		Student s2 = new Student(222,"Aryan", college);//Student s2 = new Student(222,”Aryan”, “Harvard");       "
	     System.out.println(s1.number);      
	     System.out.println(s2.number);                 
	     System.out.println(s1.name);      
	     System.out.println(s2.name);              
	     System.out.println(Student.college);      
	     System.out.println(Student.college);
	}

}
