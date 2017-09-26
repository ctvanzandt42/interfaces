public interface FistFight {
    public void punch();
    public void knockOut();
    public void dropKick();
    default void slap() {
        System.out.println("Slapping isn't allowed!");
    }
}
