package Pract7.Composite;

public class Tester {
    public static void main(String[] args) {
        Dancers dancerVogue1 = new VogueDance("Olya");
        Dancers dancerVogue2 = new VogueDance("Kate");
        Dancers dancerContemporary = new ContemporaryDancer("Masha");

        Dancing dancers = new Dancing();
        dancers.add(dancerVogue1);
        dancers.add(dancerVogue2);
        dancers.add(dancerContemporary);

        dancers.dance();

        System.out.println();
        dancers.remove(dancerVogue2);
        dancers.dance();
    }
}
