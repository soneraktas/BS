module vildan.fxandgpio3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens vildan.fxandgpio3 to javafx.fxml;
    exports vildan.fxandgpio3;
}