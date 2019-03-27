package be.vives.oop.demos.mqtt;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import be.biosplanet.bioboost.mqtt.simple_mqtt_client.IMQTTMessageHandler;
import be.biosplanet.bioboost.mqtt.simple_mqtt_client.SimpleMQTTClient;

public class FXMLController implements Initializable, IMQTTMessageHandler {
    
    @FXML private TextField subscribeTopic;
    @FXML private TextField publishTopic;
    @FXML private TextArea message;
    @FXML private TextArea log;
    
    private SimpleMQTTClient client = new SimpleMQTTClient();

    @FXML
    private void handlePublish(ActionEvent event) {
        client.publish(publishTopic.getText(), message.getText());
    }

    @FXML
    private void handleSubscribe(ActionEvent event) {
      client.subscribe(subscribeTopic.getText(), this);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @Override
    public void messageArrived(String topic, String message) {
      log.appendText("\nMessage arrived: " + message + " @ " + topic);
    }
}
