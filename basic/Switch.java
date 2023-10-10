public class Switch {
    public static void main(String[] args) {
        var nilai = "A";

        // without lambda
        switch (nilai) {
            case "A":
                System.out.println("Wow, Anda lulus dengan baik");
                break;
            case "B":
            case "C":
                System.out.println("Anda lulus");
                break;

            default:
                System.out.println("Anda tidak lulus");
                break;
        }

        // with lambda
        switch (nilai) {
            case "A" -> System.out.println("Wow, Anda lulus dengan baik");
            case "B", "C" -> System.out.println("Anda lulus");
            default -> {
                System.out.println("Anda tidak lulus");
                System.out.println("Semangat belajar");
            }
        }

        String ucapan;
        
        // without yield
        switch (nilai) {
            case "A" -> ucapan = "Wow, Anda lulus dengan baik";
            case "B", "C" -> ucapan = "Anda lulus";
            default -> {
                ucapan = "Anda tidak lulus";
            }
        }

        System.out.println(ucapan);

        // with yield
        ucapan = switch (nilai) {
            case "A" -> {
                yield "Wow, Anda lulus dengan baik";
            }
            case "B", "C" -> {
                yield "Anda lulus";
            }
            default -> {
                yield "Anda tidak lulus";
            }
        };

        System.out.println(ucapan);
    }
}
