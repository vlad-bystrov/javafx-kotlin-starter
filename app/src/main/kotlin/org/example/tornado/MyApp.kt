package org.example.tornado

import javafx.stage.Stage
import tornadofx.*

class MyApp : App(CounterView::class) {
    override fun start(stage: Stage) {
        with(stage) {
            isMaximized = true
            super.start(this)
        }
    }
}

fun main(args: Array<String>) {
    launch<MyApp>(args)
}
