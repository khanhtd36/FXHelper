# FXHelper

FXHelper was created to reduce the pain in the butt of repetitive work with FXMLLoader, FXThread.

## Setup:
 include FXHelper 1.0.jar in your project
 [download](https://github.com/khanhtd36/FXHelper/tree/master/dist)
 
## Usage:
 - To create a window and open it
```sh
    FXHelper.openWindowAsync(MainLauncher.class.getResource("/views/main_window.fxml"))
            .open();
```
- To create a window and do whatever you want on Window Created
```sh
    FXHelper.createWindowAsync(MainLauncher.class.getResource("/views/main_window.fxml"))
            .onDone((stage, scene, controller) -> {/*your code here*/});
            .create();
```
- To load FXML File and do whatever you want on Fxml file Loaded
```sh
    FXHelper.loadFXMLAsync(MainLauncher.class.getResource("/views/main_window.fxml"))
            .onLoaded((root, controller) -> {/*your code here*/})
            .load();
```
