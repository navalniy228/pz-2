public class LabTasks {
    public static void main(String[] args) {
        // Завдання 25
        double a1 = 2.98, b1 = 5.55, c1 = 0.045, d1 = 0.129;
        double y1 = Math.pow(a1, b1) / Math.cosh(Math.abs(b1))
                + 4 * (Math.log10(c1) / Math.pow(d1, 1.0/5));
        System.out.println("Завдання 25: y = " + y1);

        // Завдання 26
        double a2 = 1.27, b2 = 10.99, c2 = 4, d2 = -25.32;
        double y2 = Math.sqrt(Math.log10(a2))
                / (2 - (Math.sinh(b2) / (Math.log(Math.abs(d2)) + c2)));
        System.out.println("Завдання 26: y = " + y2);

        // Завдання 27
        double a3 = 0.478, b3 = -1.26, c3 = 2.68, d3 = 18.24;
        double y3 = Math.sin(Math.pow(a3, -b3))
                + 3 * Math.abs(Math.acos(-Math.sqrt(c3 / d3)));
        System.out.println("Завдання 27: y = " + y3);
    }
}
