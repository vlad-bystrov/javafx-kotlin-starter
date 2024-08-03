package org.example.tornado

import javafx.scene.layout.BorderPane
import tornadofx.*

class CounterView : View() {

//    override var root: Parent = FXMLLoader.load(javaClass.getResource("/CounterView.fxml"))
    override val root : BorderPane by fxml("/view/CounterView.fxml")
}
