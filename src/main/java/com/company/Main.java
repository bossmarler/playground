package com.company;
import io.javalin.*;

public class Main {
    public static void main(String[] args) {
	Javalin app = Javalin.create().start(7000);
	app.get("/", ctx -> ctx.result("Hello World!"));
    }
}
