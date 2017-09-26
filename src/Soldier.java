abstract class Soldier {
    private String name;
    private String rank;
    private int serialNo;

    void sleep() {
        System.out.println("*snoring raucously*");
    }

    void eat() {
        System.out.println("*chews rapidly*");
    }

    void punch() {
        System.out.println("TAKE THAT!!");
    }

    abstract void speak();

}
