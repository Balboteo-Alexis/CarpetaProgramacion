package Calculadora;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class Controller {

    @FXML
    private Text pantalla;

    private long primerNumero = 0;
    private String operadorActual = "";
    private boolean inicio = true;

    private Model calculadoraModel = new Model();

    @FXML
    private void procesarNumero(ActionEvent evento) {
        if (inicio) {
            pantalla.setText("");
            inicio = false;
        }

        String valorBoton = ((Button) evento.getSource()).getText();
        pantalla.setText(pantalla.getText() + valorBoton);
    }

    @FXML
    private void procesarOperador(ActionEvent evento) {
        String valorBoton = ((Button) evento.getSource()).getText();

        if (!"=".equals(valorBoton)) {
            if (pantalla.getText().isEmpty()) {
                return;
            }

            if (!operadorActual.isEmpty()) {
                return;
            }

            operadorActual = valorBoton;
            primerNumero = Long.parseLong(pantalla.getText());
            pantalla.setText("");
        } else {
            if (operadorActual.isEmpty() || pantalla.getText().isEmpty()) {
                return;
            }

            pantalla.setText(String.valueOf(calculadoraModel.calcular(primerNumero, Long.parseLong(pantalla.getText()), operadorActual)));
            operadorActual = "";
            inicio = true;
        }
    }

    @FXML
    private void borrarUltimoCaracter(ActionEvent evento) {
        String textoActual = pantalla.getText();

        if (!textoActual.isEmpty()) {
            pantalla.setText(textoActual.substring(0, textoActual.length() - 1));
        }
    }

    @FXML
    private void limpiarTodo(ActionEvent evento) {
        pantalla.setText("");
        primerNumero = 0;
        operadorActual = "";
        inicio = true;
    }
}