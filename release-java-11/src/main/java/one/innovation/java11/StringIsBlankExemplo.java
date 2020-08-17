package one.innovation.java11;

public class StringIsBlankExemplo {

    public static void main(String[] args) {
        // antes java 11
        String espaco = "             ";
        System.out.println(espaco != null || espaco.length() == 0 || espaco.chars().allMatch(c -> c == ' '));

        // java 11
        System.out.println(espaco.isBlank());
    }

}
