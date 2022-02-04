package com.revature;
import com.revature.controllers.UserController;
import com.revature.util.LogginUtil;
import io.javalin.Javalin;
import static io.javalin.apibuilder.ApiBuilder.*;

public class JavalinApp {

    private UserController userController = new UserController();
    private LogginUtil loggingUtil = new LogginUtil();

    private Javalin app = Javalin.create().routes(()->{
        path("user",()->{
            path("{id}",()->{
                get(userController::handleGetOne);
            });
        });
    });

    public void start(int port){
        app.start(port);
    }
}
