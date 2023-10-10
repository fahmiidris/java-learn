public class ArrayDataType {
    public static void main(String[] args) {
        String[] names = {
            "Fahmi",
            "Idris",
        };

        System.out.println(names[0]);
        System.out.println(names[1]);

        String[] ages = new String[2];
        ages[0] = "20";
        ages[1] = "21";

        System.out.println(ages[0]);
        System.out.println(ages[1]);

        int[] numbers = new int[] {
            1, 2, 3,
        };

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers.length);

        String[][] members = {
            {"Fahmi", "Idris"},
            {"20", "21"},
        };

        System.out.println(members[0][0]);
        System.out.println(members[0][1]);
        System.out.println(members[1][0]);
        System.out.println(members[1][1]);
    }
}
