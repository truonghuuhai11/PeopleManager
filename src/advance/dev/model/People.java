package advance.dev.model;

public class People {
	// một biến riêng tư (private)
	private String name;
	private int age;

	// một phương thức khởi tạo (constructor)
	// hàm khởi tạo đc sử dụng khi khởi tạo 1 đối tượng
	public People(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Getters and setters
	// lấy giá trị của một thuộc tính
	public String getName() {
		return name;
	}

	// thiết lập giá trị của một thuộc tính
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
