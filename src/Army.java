class Army extends Soldier implements FistFight, Bootcamp, Bomb {

    @Override
    void speak() {
        System.out.println("I am in the Army!");
    }

    @Override
    public void punch() {
        System.out.println("Wow, that Army man punches hard!");
    }

    @Override
    public void dropKick() {
        System.out.println("WOW! Is that an army man or Chuck Norris?");
    }

    @Override
    public void knockOut() {
        System.out.println("ARMY WINS, GAME OVER!");
    }

    @Override
    public void mealTime() {
        System.out.println("Time for the Army to eat!");
    }

    @Override
    public void pushup() {
        System.out.println("Drop and give me 20, Army!");
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

    @Override
    public String Bomb() {
        System.out.println("OH NO! A BOMB!!!!!");
        return "OH NO! A BOMB!!!!!";
    }

    @Override
    public String toString(){
        return Bomb();
    }

    @Override
    public void slap() {
        System.out.println("SLAPPING IS NOT ALLOWED IN THE ARMY!!!!");
    }
}
