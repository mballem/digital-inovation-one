package one.innovation.springbootprofiles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @Value("${app.message}")
    private String appMessage;

    @Value("${ENV_DB_URL:NOT_FOUND}")
    private String dbEnvironmentVariable;

    @Value("${JAVA_HOME:NOT_FOUND}")
    private String javaHomeEnv;

    @GetMapping("/")
    public String getAppMessage() {
        return appMessage;
    }

    @GetMapping("/envVariable")
    public String getDbEnvironmentVariable() {
        return "A seguinte variavel de ambiente foi passada: " + dbEnvironmentVariable;
    }

    @GetMapping("/javaHome")
    public String getJavaHome() {
        return "O valor de Java Home é: " + javaHomeEnv;
    }
}
