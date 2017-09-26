class Navy extends Soldier implements FistFight, Bootcamp{

    @Override
    void speak() {
        System.out.println("I am in the Navy!");
    }

    @Override
    public void punch() {
        System.out.println("Punched by a Navy man!!!");
    }

    @Override
    public void knockOut() {
        System.out.println("Ouch! That Navy guy knocked you out!");
    }

    @Override
    public void dropKick() {
        System.out.println("What a kick by that Navy guy!");
    }

    @Override
    public void mealTime() {
        System.out.println("Time for the Navy to eat!");
    }

    @Override
    public void pushup() {
        System.out.println("Drop and give me 20, Navy!");
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
