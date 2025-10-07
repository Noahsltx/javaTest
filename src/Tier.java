public class Tier {
    public int pfoten;
    public String name;
    public int familienmitglieder;
    public boolean isMaennlich;

    public void macheSound(String sound) {
        System.out.println(sound);
    }

    public void bewegen() {
        System.out.println("laufen");
    }
}
