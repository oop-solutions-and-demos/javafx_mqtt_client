package be.vives.oop.demos.mqtt;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import be.biosplanet.bioboost.mqtt.simple_mqtt_client.SimpleMQTTClient;

public class FXMLController implements Initializable {
    
    @FXML private Label label;
    
    private SimpleMQTTClient client = new SimpleMQTTClient();

    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
        client.publish("test/oop2/hello_world", "Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
