public class NumberDataType {
    public static void main(String[] args) {
        // Integer
        byte a = 100;
        short b = 1000;
        int c = 1000000;
        long d = 1000000;
        long e = 1000000000L;

        // Floating point
        float f = 10.5F;
        double g = 10.5;

        // Literals
        int decimal = 100;
        int hex = 0xFFFFFF;
        int binary = 0b1100100;

        // Underscores
        int thousand = 1_000;
        int million = 1_000_000;

        // Conversion
        byte i = 10;
        short l = i;
        int m = l;
        byte n = (byte) m;
        short o = (short) n;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(decimal);
        System.out.println(hex);
        System.out.println(binary);
        System.out.println(thousand);
        System.out.println(million);
        System.out.println(i);
        System.out.println(l);
        System.out.println(m);
        System.out.println(n);
        System.out.println(o);
    }
}
