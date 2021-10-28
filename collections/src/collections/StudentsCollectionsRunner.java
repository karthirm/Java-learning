package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class AscendingStudentComparator implements Comparator<Student> {

	public int compare(Student student1, Student student2) {
		return Integer.compare(student1.getId(), student2.getId());
	}

	
}


public class StudentsCollectionsRunner {

	public static void main(String[] args) {
		
		Student student = new Student(1,"karthi");
		//System.out.println(student1.toString());
		
		List<Student> students = List.of(new Student(1, "kar"),new Student(102,"tg"),
				new Student(3,"ado"));
		ArrayList<Student> studentsAl = new ArrayList<>(students);
		System.out.println("unsorted one is "+students);
		Collections.sort(studentsAl);
		System.out.println("ascending " + studentsAl);
	//	Collections.sort(studentsAl, new AscendingStudentComparator());
		
		studentsAl.sort(new AscendingStudentComparator());
		System.out.println("AscendingStudentComparator " + studentsAl);
	}

}
