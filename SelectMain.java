package test;

import java.util.Scanner;

public class SelectMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("请输入您想查询的人员");
//		String name = scanner.next();
		
	    Course course = new Course();
	    
		System.out.println(course.toString());
		Student stu0 = new Student(1001,"Lily","计算机","女");
        Student stu1 = new Student(1002,"Tom");
        Student stu2 = new Student(1003,"Marry");
        Student stu3 = new Student(1004,"HaHa");
        Teacher tea0 = new Teacher(001,"张老师","性别：男");
        Teacher tea1 = new Teacher(002,"王老师","性别：女");
        Teacher tea2 = new Teacher(002,"刘老师","性别：女");
        Course cour0 = new Course(001,"高数");
        Course cour1 = new Course(002,"离散");
        Course cour2 = new Course(003,"java");
        stu0.addCourse(cour0);
        stu0.addCourse(cour2);
        stu0.addCourse(cour1);
        stu1.addCourse(cour2);
        stu1.addCourse(cour0);
        stu2.addCourse(cour1);
        stu3.addCourse(cour0);
        stu3.addCourse(cour1);
        tea0.addCourse(cour2);
        tea1.addCourse(cour1);
        tea2.addCourse(cour0);
        stu1.removeCourse(cour2);
        
        
        stu0.displayCourse();
        tea0.displayCourse();
        tea1.displayCourse();
        tea2.displayCourse();
        cour0.removeStudent(stu1);
        cour1.displayStudent();
        
	}

}
