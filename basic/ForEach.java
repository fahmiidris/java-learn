public class ForEach {
    public static void main(String[] args) {
        String[] names = {
            "Fahmi",
            "Idris",
            "Awikwok"
        };

        // withold for each
        for (var i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // with for each
        for (var name : names) {
            System.out.println(name);
        }
    }
}
