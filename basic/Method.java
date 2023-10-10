public class Method {
    public static void main(String[] args) {
        sayHelloWorld();
        sayHelloWorld();

        sayHello("Fahmi");
        sayHello("Idris");

        String hiFahmi = sayHi("Fahmi");
        
        System.out.println(hiFahmi);
        System.out.println(sayHi("Idris"));

        int total = sum(1, 2);

        System.out.println(total);
        System.out.println(sum(1, 2, 3, 4, 5));
    }

    static void sayHelloWorld() {
        System.out.println("Hello World");
    }

    static void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    static String sayHi(String name) {
        return "Hi " + name;
    }

    static int sum(int first, int second) {
        var total = first + second;
        
        return total;
    }

    static int sum(int... values) {
        var total = 0;

        for (var value : values) {
            total += value;
        }

        return total;
    }
}
