public class NonPrimitiveDataTypes {
    public static void main(String[] args) {
        Integer age = 20;
        Boolean isMarried = false;

        System.out.println("Age: " + age);
        System.out.println("Is Married: " + isMarried);

        int a = 10;
        Integer b = a;

        System.out.println("a: " + a);
        System.out.println("b: " + b);

        short c = b.shortValue();
        
        System.out.println("c: " + c);
    }
}
