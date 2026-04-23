package hiding;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student( );
        /* studentLee.studentName = "이상원";
        studentName 접근 제어자가 private 이므로 오류가 발생해 주석 처리 */
        studentLee.setStudentName("이상원");
        //setStudentName( ) 메서드를 활용해 private 변수에 접근 가능

        System.out.println(studentLee.getStudentName( ));
    }
}