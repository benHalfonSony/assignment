package com.sony.assignment.actions.dialogs.add;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class CalcAddDialogController{

    @FXML
    private TextField num1Txt;

    @FXML
    private TextField num2Txt;

    @FXML
    private TextField resultTxt;

    @FXML
    public void btnAddClicked() {
        int num1Value = Integer.valueOf(num1Txt.getText().trim());
        int num2Value = Integer.valueOf(num2Txt.getText().trim());
        resultTxt.setText(String.valueOf(num1Value+num2Value));
    }

}
