package org.example.tornado

import javafx.scene.Parent
import tornadofx.*

class MyView : View(title = "Main View") {

    override val root = vbox {
        button("Press me")
        label("Waiting")
    }
}
