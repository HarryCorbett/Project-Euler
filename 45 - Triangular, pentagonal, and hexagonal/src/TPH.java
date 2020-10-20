public class TPH {

    public static void main(String[] args) {

        int i = 286;
        int j = 166;
        int k = 144;

        while (true) {
            long triangle = (long) i * (i + 1) / 2;
            long pentagon = (long) j * (3 * j - 1) / 2;
            long hexagon  = (long) k * (k * 2 - 1);
            long lowest = Math.min(Math.min(triangle, pentagon), hexagon);
            if (triangle == pentagon && pentagon == hexagon) {
                System.out.println("Next triangle number that is pentagonal and hexagonal is " + triangle);
                break;
            }
            if (lowest == triangle) { i++; }
            if (lowest == pentagon) { j++; }
            if (lowest == hexagon)  { k++; }

        }
    }
}
