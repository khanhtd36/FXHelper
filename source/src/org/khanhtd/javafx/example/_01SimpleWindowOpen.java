package org.khanhtd.javafx.example;

import org.khanhtd.javafx.FXHelper;

public class _01SimpleWindowOpen {
    public static void main(String[] args) {
        FXHelper.openWindowAsync(
                _01SimpleWindowOpen.class.getResource(
                        "/views/main_window.fxml"
                )
        ).open();
    }
}
