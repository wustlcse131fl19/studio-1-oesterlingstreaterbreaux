package studio1;
import support.cse131.ArgsProcessor;
public class Average {
    public static void main(String[] args) {
        ArgsProcessor ap = new ArgsProcessor(args);
        Integer v0 = ap.nextInt("Enter Value 1");
        Integer v1 = ap.nextInt("Enter Value 2");
        Double v2 = (v0 +v1)/2.0;
        System.out.println(v2);
}
}
