package chapter2;

public class TypeInference {
    public static void main(String[] args) {
        var i = 10;             //int i = 10
        var j = 10.0;           //double j = 10
        var str = "hello";      //String str = "hello"

        System.out.println(i);
        System.out.println(j);
        System.out.println(str);

        str = "test";
        //str = 3;  str 변수는 String형으로 먼저 사용했기 때문에 정숫값x
    }
}