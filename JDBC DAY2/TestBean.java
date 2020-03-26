package com.sonata.Main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.sonata.Std.DuplicateException;
import com.sonata.Std.StdAdd;
import com.sonata.Model.Student;

public class TestBean {
	public static void main(String[] args) throws DuplicateException {
		StdAdd dao = new StdAdd();
			Student s1 = new Student();
			s1.setStdId(1);
			s1.setStdName("Nilesh Patil");
			s1.setMarks(75);

			Student s2 = new Student();
			s2.setStdId(2);
			s2.setStdName("Bhagyashree");
			s2.setMarks(79);
			
			Student s3= new Student();
			s3.setStdId(3);
			s3.setStdName("Hampi");
			s3.setMarks(83);
			   
			Student s4 = new Student();
			s4.setStdId(4);
			s4.setStdName("Sonu");
			s4.setMarks(89);
			
			
			int row = dao.addStudent(s1);
			
			row = dao.addStudent(s2);
			 row =dao.addStudent(s3);
			 row = dao.addStudent(s4);
			System.out.println(row); 
			
			List<Student> al= new ArrayList<Student>();
			al = dao.getStudent();
			
			al.stream().sorted(Comparator.comparing(Student::getMarks).reversed()).forEach(System.out::println);
		}


}