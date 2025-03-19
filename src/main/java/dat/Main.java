package dat;

import com.nimbusds.jose.shaded.json.JSONUtil;
import dat.config.ApplicationConfig;
import dat.controllers.impl.ExceptionController;
import dat.exceptions.ApiException;
import dat.exceptions.Message;
import dat.routes.Routes;
import io.javalin.Javalin;
import io.javalin.http.Context;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    public static void main(String[] args) {
        ApplicationConfig.startServer(7070);
        System.out.println("hej");
    }
}