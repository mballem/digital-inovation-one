package one.innovation.functional;

public class ExecutaFuncao {
    public static void main(String[] args) {
        // classe anonima (anterior ao java 8)
        Funcao colocarPrefixoSrNoNome = new Funcao() {
            @Override
            public String gerar(String valor) {
                return "Sr. " + valor;
            }
        };
        System.out.println(colocarPrefixoSrNoNome.gerar("João Souza"));

        // lambda com interface funcional java 8+
        Funcao colocarPrefixoSenhorNoNome = valor -> "Sr. " + valor;
        System.out.println(colocarPrefixoSenhorNoNome.gerar("Marco Silva"));
    }


}
