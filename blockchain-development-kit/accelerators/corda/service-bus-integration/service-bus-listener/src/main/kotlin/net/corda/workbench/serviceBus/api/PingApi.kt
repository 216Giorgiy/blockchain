package net.corda.workbench.serviceBus.api

import io.javalin.ApiBuilder
import io.javalin.Javalin


class PingApi {

    fun register(app: Javalin) {

        app.routes {
            ApiBuilder.get("ping") { ctx ->
                ctx.result("pong")
            }
        }
    }
}