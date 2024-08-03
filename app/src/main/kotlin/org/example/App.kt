package org.example

import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import javafx.application.Application
import javafx.event.EventHandler
import javafx.geometry.Insets
import javafx.geometry.Pos
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.stage.Stage
import javafx.scene.control.Label
import javafx.scene.layout.VBox
import kotlinx.coroutines.*
import kotlinx.coroutines.javafx.JavaFx

class App : Application() {

    override fun start(stage: Stage) {
        val button = Button().apply {
            text = "Click Me!"
            prefWidth = 100.0
            padding = Insets(0.0, 0.0, 0.0, 30.0)
        }

        val layout = VBox().apply {
            alignment = Pos.CENTER
            spacing = 10.0
            children.addAll(
                Label("Hello, World!"),
                button
            )
        }

        stage.run {
            scene = Scene(layout, 600.0, 400.0)
            title = "Title"
            show()
        }

        setup(button)
    }

    @OptIn(DelicateCoroutinesApi::class)
    fun setup(button: Button) {
        button.onAction = EventHandler {
            println("before Coroutine")

            GlobalScope.launch(Dispatchers.JavaFx){
                delay(200L)
                callServer()
            }

            println("after Coroutine")
        }
    }

    suspend fun callServer() {
        val client = HttpClient(CIO)
        val response: HttpResponse = client.get("https://ktor.io/")
        println(response.status)
        client.close()
    }
}

fun main() {
    Application.launch(App::class.java)
}
