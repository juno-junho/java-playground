package JavaLang;

public class StringBufferExercise {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer(10);
        System.out.println(stringBuffer.capacity());
        stringBuffer.append("hello junho");
        System.out.println(stringBuffer.capacity());
        System.out.println(stringBuffer);
    }
}
