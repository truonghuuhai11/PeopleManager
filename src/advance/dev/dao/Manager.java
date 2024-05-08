package advance.dev.dao;

import advance.dev.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Manager {
	private List<Teacher> teacherList = new ArrayList<>(); // Danh sách giáo viên

	// Phương thức thêm giáo viên vào danh sách
	public void addTeacher(Teacher teacher) {
		teacherList.add(teacher);
	}

	// Phương thức in danh sách giáo viên
	public void printTeacherList() {
		for (Teacher teacher : teacherList) {
			System.out.println("Name: " + teacher.getName() + ", Age: " + teacher.getAge() + ", Teacher ID: "
					+ teacher.getTeacherID());
		}
	}

	// Phương thức lấy số lượng giáo viên trong danh sách
	public int getNumberOfTeachers() {
		return teacherList.size();
	}

	// Phương thức lấy tên của giáo viên có tuổi cao nhất
	public String getOldestTeacherName() {
		int maxAge = Integer.MIN_VALUE;
		String oldestTeacherName = "";

		for (Teacher teacher : teacherList) {
			if (teacher.getAge() > maxAge) {
				maxAge = teacher.getAge();
				oldestTeacherName = teacher.getName();
			}
		}

		return oldestTeacherName;
	}
}
