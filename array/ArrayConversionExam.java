package array;

public class ArrayConversionExam {
    public static void main(String[] args) {
        String resource1 = "[]";
        String resource2 = "[[123,456]]";
        String resource3 = "[[123,456], [321,654]]";

        String result2 = resource2.replaceAll("\\[\\[", "[").replaceAll("\\]\\]", "]");
        String result3 = resource3.replaceAll("\\[\\[", "[").replaceAll("\\]\\]", "]");
        System.out.println(result2);
        System.out.println(result3);
    }
}
