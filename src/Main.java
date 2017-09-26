public class Main {
    public static void main(String[] args) {
        Army army = new Army();
        Navy navy = new Navy();
        Marines marines = new Marines();

        army.report();
        System.out.println("----------------");
        navy.report();
        System.out.println("----------------");
        marines.report();
        System.out.println("----------------");
        army.toString();
    }

}
