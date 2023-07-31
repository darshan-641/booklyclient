
import java.sql.DriverManager;
import java.util.List;

public class StudentTest {
		public static void main(String[] args) {
			
//			SaveStudent student = new SaveStudent();
		}
}


 interface StudentDetails {
    void saveStudent(Student student);
    void updateStudent(Student student);
    void deleteStudent(int studentId);
    Student getStudentById(int studentId);
    List<Student> getAllStudents();
}

class Student {
	private int studentRollNo;
	private String studentName;
	private String CollegeName;
	private String studentDepartment;
	private static int studentCount = 0;
	
	Student(String studentName, String collegeName, String studentDepartment){
		this.studentRollNo= studentCount;
		this.studentName = studentName;
		this.CollegeName= collegeName;
		this.studentDepartment = studentDepartment;
	}
	
	
}

class SaveStudent extends Student implements StudentDetails{

	SaveStudent(String studentName, String collegeName, String studentDepartment) {
		super(studentName, collegeName, studentDepartment);
		
	}
	
	
	try {
		//1. Load the Driver
		System.out.println("Trying to load the driver...");
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
		System.out.println("Driver loaded....");
		
		//2. Acquire the connection
		System.out.println("Trying to connect....");
		Connection conn = 	DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/mydb", "SA", "");
		System.out.println("Connected : "+ conn);
		
		//3. make a desired statement (insert/update/delete/select)
		
		PreparedStatement pst = 
				conn.prepareStatement("INSERT INTO DEPT10 VALUES (?,?,?)");
		
		pst.setInt(1, 40);
		pst.setString(3, "TESTING");
		pst.setString(2,"PUNE");
		
		System.out.println("PreparedStatement is created : "+ pst);
		
		//4. execute that statement //  UR TABLENAME IS MYDEPT120
		int rows = pst.executeUpdate();
		
		System.out.println("Rows created : "+rows);
		
		//6. close the statement, and connection
		
		pst.close();
		conn.close();
		System.out.println("Disconnected from the database....");
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	@Override
	public void saveStudent(Student student) {
		
		
	}

	@Override
	public void updateStudent(Student student) {

		
	}

	@Override
	public void deleteStudent(int studentId) {
		
		
	}

	@Override
	public Student getStudentById(int studentId) {
		
		return null;
	}



	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}


