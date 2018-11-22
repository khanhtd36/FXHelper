package org.khanhtd36.fxhelper.controller;

import javafx.scene.Scene;
import javafx.stage.Stage;

public abstract class StageSceneController {
    protected Stage stage;
    protected Scene scene;
    
    public Stage getStage() {
        return stage;
    }
    
    public void setStage(Stage stage) {
        this.stage = stage;
    }
    
    public Scene getScene() {
        return scene;
    }
    
    public void setScene(Scene scene) {
        this.scene = scene;
    }
}
