public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static class test {
        public static void main(String[] args) {
            Main m = new Main();
            Teacher t = new Teacher();
            Student s = new Student();
            System.out.println(m instanceof t);
            System.out.println(t instanceof m);
            System.out.println(s instanceof m);
            System.out.println(s instanceof m);
        }
    }
}