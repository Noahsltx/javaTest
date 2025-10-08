public class Tier {
    public int pfoten;
    public String name;
    public int familienmitglieder;
    public boolean isMaennlich;

    Tier(int pfoten, String name, int familienmitglieder, boolean isMaennlich) {
        this.pfoten = pfoten;
        this.name = name;
        this.familienmitglieder = familienmitglieder;
        this.isMaennlich = isMaennlich;
    }

    public void macheSound(String sound) {
        System.out.println(sound);
    }

    public void bewegen() {
        System.out.println("laufen");
    }
}
