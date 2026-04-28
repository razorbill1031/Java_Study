package staticex;

public class StudentTest4 {
    public static void main(String[] args) {
        Student2 studenLee = new Student2();
        studenLee.setStudentName("이지원");
        System.out.println(Student2.getSerialNum());
        System.out.println(studenLee.studentName + " 학번:" + studenLee.studentID);

        Student2 studentSon = new Student2();
        studentSon.setStudentName("손수경");
        System.out.println(Student2.getSerialNum());
        System.out.println(studentSon.studentName + " 학번:" + studentSon.studentID);
    }
}