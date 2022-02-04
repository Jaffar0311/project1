package com.revature;

import com.revature.controllers.AppExceptionHandler;
import com.revature.controllers.AuthController;
import com.revature.controllers.UserController;
import com.revature.util.LoggingUtil;
import io.javalin.Javalin;

import static io.javalin.apibuilder.ApiBuilder.*;

public class JavalinApp {

    private final LoggingUtil loggingUtil = new LoggingUtil();
    private final AppExceptionHandler appExceptionHandler = new AppExceptionHandler();
    private AuthController authController = new AuthController();
    private final UserController userController = new UserController();

    private Javalin app = Javalin.create().routes(()->{

        //TODO: UPDATE ADMIN ACCESS ROUTES
        /*path("admin-access",()->{
            before(authController::authorizeManageToken);
            path("account",()->{
                get(accountController::handleGetAllAccounts);
                post(accountController::handleCreate);
                delete(accountController::handleDelete);
                path("{id}",()->{
                    get(accountController::handleGetOne);
                    put(accountController::handleUpdate);
                });
            });
        });*/

        path("employee-access",()->{
            before(authController::authorizeEmployeeToken);
            path("user",()->{
                path("{id}",()->{
                    get(userController::handleGetOne);
                    put(userController::handleUpdate);
                });
            });
        });

        path("login", ()->{
            post(authController::authenticateLogin);
        });
        before("*",loggingUtil::logRequest);
    }).exception(NumberFormatException.class, appExceptionHandler::handleNumberFormatException);

    public void start(int port){
        app.start(port);
        }


}
