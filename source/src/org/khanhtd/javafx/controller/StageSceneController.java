package org.khanhtd.javafx.controller;

import javafx.scene.Scene;
import javafx.stage.Stage;

public abstract class StageSceneController {
	private Stage stage;
	private Scene scene;
	
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
