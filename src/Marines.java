class Marines extends Soldier implements FistFight, Bootcamp {


    @Override
    void speak() {
        System.out.println("I am in the Marines!");
    }

    @Override
    public void punch() {
        System.out.println("Punched by a Marine!!!");
    }

    @Override
    public void knockOut() {
        System.out.println("Ouch! That Marine knocked you out!");
    }

    @Override
    public void dropKick() {
        System.out.println("What a kick by that Marine!");
    }

    @Override
    public void mealTime() {
        System.out.println("Time for the Marines to eat!");
    }

    @Override
    public void pushup() {
        System.out.println("Drop and give me 20, Marine!");
    }

    public void report(){
        speak();
        punch();
        dropKick();
        knockOut();
        mealTime();
        pushup();
        slap();
    }

}
