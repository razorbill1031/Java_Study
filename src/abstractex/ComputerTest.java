package abstractex;

public class ComputerTest {
    public static void main(String[] args) {
        Computer c1 = new Computer();
        Computer c2 = new DeskTop();
        Computer c3 = new NoteBook();
        Computer c4 = new MyNoteBook();
    }
}
//추상클래스로는 인스턴스 생성 불가 (오류)