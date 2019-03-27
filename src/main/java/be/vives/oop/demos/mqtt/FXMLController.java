package be.vives.oop.demos.mqtt;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import be.biosplanet.bioboost.mqtt.simple_mqtt_client.SimpleMQTTClient;

public class FXMLController implements Initializable {
    
    @FXML private TextField publishTopic;
    @FXML private TextArea message;
    
    private SimpleMQTTClient client = new SimpleMQTTClient();

    @FXML
    private void handlePublish(ActionEvent event) {
        client.publish(publishTopic.getText(), message.getText());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
