package frontend.finalproject.Controllers.SubControllers;

import frontend.finalproject.Controllers.UtilsFXML;
import frontend.finalproject.Model.Env.GlobalVariablesDeclarationModel;
import frontend.finalproject.NotificationUtils;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class EditGlobalVarDeclSubController {
    @FXML private Button editBTN;
    @FXML private TextField NameGlobalVarDecTXT;
    @FXML private TextField TypeGlobalVarDecTXT;
    @FXML private TextField IsActionParameterValueTXT;
    @FXML private TextArea DefaultCodeGlobVarDecTXT;

    private GlobalVariablesDeclarationModel model;
    private Runnable callback;

    public void handleEditBTNClick(ActionEvent actionEvent) {
        model.setName(NameGlobalVarDecTXT.getText());
        model.setType(TypeGlobalVarDecTXT.getText());
        model.setActionParameterValue(IsActionParameterValueTXT.getText().equals("true"));
        model.setDefaultCode(DefaultCodeGlobVarDecTXT.getText());

        Stage stage = (Stage) editBTN.getScene().getWindow();
        stage.close();
        callback.run();
        UtilsFXML.showNotification(NotificationUtils.EDIT_GLOBAL_VAR_DEC_SUCCESS, NotificationUtils.EDIT_GLOBAL_VAR_DEC_SUCCESS_MSG,null);
    }

    public void setModel(GlobalVariablesDeclarationModel model) {
        this.model = model;
        NameGlobalVarDecTXT.setText(model.getName());
        TypeGlobalVarDecTXT.setText(model.getType());
        IsActionParameterValueTXT.setText(model.isActionParameterValue() ? "true" : "false");
        DefaultCodeGlobVarDecTXT.setText(model.getDefaultCode());
    }

    public void setOnCloseCallback(Runnable callback) {
        this.callback = callback;
    }
}
