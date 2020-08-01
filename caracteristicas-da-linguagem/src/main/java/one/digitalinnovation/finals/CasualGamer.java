package one.digitalinnovation.finals;

public class CasualGamer extends Gamer {

    @Override
    public String keyboard() {
        return super.keyboard();
    }

    /* método mouse é final, por isso, não podemos sobrescreve-lo
    @Override
    public final String mouse() {
        return "Mouse gamer";
    }*/

    public String play(final String game) {
        // não é possível alterar o valor de uma variavel o parametro marcodos como final
        //game = "Wow";

        return "Jogando " + game;
    }
}
