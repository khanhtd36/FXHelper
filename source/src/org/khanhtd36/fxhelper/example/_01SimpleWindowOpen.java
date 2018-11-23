package org.khanhtd36.fxhelper.example;

import org.khanhtd36.fxhelper.FXHelper;

public class _01SimpleWindowOpen {
    public static void main(String[] args) {
        FXHelper.openWindowAsync(
                _01SimpleWindowOpen.class.getResource(
                        "/org/khanhtd36/fxhelper/views/main_window.fxml"
                )
        ).open();
    }
}
