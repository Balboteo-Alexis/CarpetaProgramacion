package Calculadora;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class Controller {

    @FXML
    private Text output;

    private long number1 = 0;
    private String operator = "";
    private boolean start = true;

    private Model model = new Model();

    @FXML
    private void processNumpad(ActionEvent event) {
        if (start) {
            output.setText("");
            start = false;
        }

        String value = ((Button) event.getSource()).getText();
        output.setText(output.getText() + value);
    }

    @FXML
    private void processOperator(ActionEvent event) {
        String value = ((Button) event.getSource()).getText();

        if (!"=".equals(value)) {
            if (output.getText().isEmpty()) {
                return;
            }

            if (!operator.isEmpty()) {
                return;
            }

            operator = value;
            number1 = Long.parseLong(output.getText());
            output.setText("");
        } else {
            if (operator.isEmpty() || output.getText().isEmpty()) {
                return;
            }

            output.setText(String.valueOf(model.calculate(number1, Long.parseLong(output.getText()), operator)));
            operator = "";
            start = true;
        }
    }

    @FXML
    private void processClear(ActionEvent event) {
        String currentText = output.getText();

        if (!currentText.isEmpty()) {
            output.setText(currentText.substring(0, currentText.length() - 1));
        }
    }

    @FXML
    private void processAllClear(ActionEvent event) {
        output.setText("");
        number1 = 0;
        operator = "";
        start = true;
    }
}