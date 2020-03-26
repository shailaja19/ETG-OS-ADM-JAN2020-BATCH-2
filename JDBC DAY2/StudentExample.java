package StdEx;

import java.util.List;

import com.sonata.Model.Student;
import com.sonata.Std.DuplicateException;

public interface StudentExample {
	public interface StuDAO {
		public int addStudent(Object obj) throws DuplicateException;
		public List<Student> getStudent();
}
}
