public class Variable {
    public static void main(String[] args) {
        String name = "Fahmi Idris";
        int age = 20;
        double height = 165.2;
        String address = "Bogor Regency, West Java, Indonesia";

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Address: " + address);

        name = "Gapunya Nama";

        System.out.println("Name: " + name);

        var firstName = "Fahmi";
        var lastName = "Idris";

        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);

        final String application = "Belajar Java";

        System.out.println("Application: " + application);
    }
}
