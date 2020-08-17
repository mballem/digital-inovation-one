package one.innovation.java11;

import java.util.stream.Collectors;

public class StringLines {

    public static void main(String[] args) {
        // localizar uma linha dentro do html com java 11 e lines
        String html = "<div class=\"frame-container\">\n" +
                "    <div align=\"center\">\n" +
                "         <h2 class=\"highlight\">\n" +
                "             <a href=\"https://http2.akamai.com/demo/h2_demo_frame.html\">HTTP/2</a>\n" +
                "         </h2>\n" +
                "    </div>";

        System.out.println(html.lines().filter(s -> s.contains("href")).collect(Collectors.joining()));
    }
}
