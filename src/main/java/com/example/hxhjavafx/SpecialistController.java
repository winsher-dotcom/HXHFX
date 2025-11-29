package com.example.hxhjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class SpecialistController {
    public AnchorPane specialistRoot;
    @FXML private Button homeButton;

    public void backToHome() throws IOException {
        new SceneChanger(specialistRoot, "home.fxml");
        if (specialistRoot == null) {
            throw new IllegalArgumentException("currentView is null");
        }
    }


}



