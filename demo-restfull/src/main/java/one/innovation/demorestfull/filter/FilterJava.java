package one.innovation.demorestfull.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class FilterJava implements Filter {

    private Logger logger = LoggerFactory.getLogger(FilterJava.class);

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
        logger.info("Entrou no Filtro");
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        Enumeration<String> headerNames = request.getHeaderNames();
        Map<String, String> mapHeaders = Collections
                .list(headerNames)
                .stream()
                .collect(Collectors.toMap(it -> it, request::getHeader));

        if (mapHeaders.get("authorization") != null && mapHeaders.get("authorization").equals("JAVA")) {
            logger.info("Processando o consumo do webservice");
            chain.doFilter(servletRequest, servletResponse);
        } else {
            HttpServletResponse response = (HttpServletResponse) servletResponse;
            response.sendError(403);
        }
        logger.info("Saiu do Filtro");
    }
}
