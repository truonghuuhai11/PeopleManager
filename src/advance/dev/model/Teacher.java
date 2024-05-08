package advance.dev.model;

import advance.dev.dao.IPeople;

// Lớp giáo viên kế thừa từ lớp People và triển khai(implement) từ interface IPeople
public class Teacher extends People implements IPeople {
	private String teacherID; // Mã số giáo viên

	public Teacher(String name, int age, String teacherID) {
		// constructor của lớp cha (superclass) của 'Teacher'
		super(name, age);
		this.teacherID = teacherID;
	}

	// Getters và setters
	public String getTeacherID() {
		return teacherID;
	}

	public void setTeacherID(String teacherID) {
		this.teacherID = teacherID;
	}

	// Implement các phương thức từ interface IPeople
	@Override
	public void add() {
		// Thêm giáo viên logic
	}

	@Override
	public void printPeople() {
		// In thông tin giáo viên logic
	}
}
