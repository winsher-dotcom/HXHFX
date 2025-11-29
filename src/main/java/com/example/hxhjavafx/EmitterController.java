package com.example.hxhjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class EmitterController {
    public AnchorPane emitterRoot;
    @FXML private Button homeButton;

    public void backToHome() throws IOException {
        new SceneChanger(emitterRoot, "home.fxml");
    }

}



