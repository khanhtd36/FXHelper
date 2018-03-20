package org.khanhtd.javafx.example;

import org.khanhtd.javafx.FXHelper;

public class MainLauncher  {
    public static void main(String[] args) {
        System.out.println("FXHelper");
        System.out.println(" - Author: Truong Duy Khanh");
        System.out.println(" - Version: 1.0");
    
        FXHelper.openWindowAsync(MainLauncher.class.getResource("/views/main_window.fxml"))
                .open();
    }
}
