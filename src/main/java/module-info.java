module ni.edu.uam.practicahilo {
    requires javafx.controls;
    requires javafx.fxml;


    opens ni.edu.uam.practicahilo to javafx.fxml;
    exports ni.edu.uam.practicahilo;
}