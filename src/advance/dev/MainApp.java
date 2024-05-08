package advance.dev;

import advance.dev.dao.Manager;
import advance.dev.model.Teacher;

// Lớp chính MainApp để chạy các phương thức đã được tạo trong câu 4
public class MainApp {
	public static void main(String[] args) {
		// Tạo instance của Manager
		Manager manager = new Manager();

		// Thêm các giáo viên
		Teacher teacher1 = new Teacher("John", 35, "T001");
		Teacher teacher2 = new Teacher("Emma", 40, "T002");

		manager.addTeacher(teacher1);
		manager.addTeacher(teacher2);

		// In danh sách giáo viên
		manager.printTeacherList();

		// Lấy số lượng giáo viên
		int numberOfTeachers = manager.getNumberOfTeachers();
		System.out.println("Số lượng giáo viên: " + numberOfTeachers);

		// Lấy tên của giáo viên có tuổi cao nhất
		String oldestTeacherName = manager.getOldestTeacherName();
		System.out.println("Tên của giáo viên có tuổi cao nhất: " + oldestTeacherName);
	}
}
