package org.example

import javafx.application.Application
import javafx.scene.Scene
import javafx.stage.Stage
import javafx.scene.control.Label
import javafx.scene.layout.VBox


class App : Application() {

    override fun start(stage: Stage) {
        val layout = VBox().apply {
            children.add(Label("Hello, World!"))
        }

        stage.run {
            scene = Scene(layout, 600.0, 400.0)
            show()
        }
    }
}

fun main() {
    Application.launch(App::class.java)
}
