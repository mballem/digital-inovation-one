package one.digitalinnovation.finals;

public class Programa {

    public static void main(String[] args) {
        final HardcoreGamer hardcoreGamer = new HardcoreGamer();

        final Gamer gamer = new Gamer();

        final CasualGamer casualGamer = new CasualGamer();

        final var game = "BETA";

        //game = "GAMA";

        System.out.println(casualGamer.play(game));
    }
}
