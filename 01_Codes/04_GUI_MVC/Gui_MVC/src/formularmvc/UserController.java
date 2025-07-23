package formularmvc;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Controller-Klasse zur Verarbeitung der Formulardaten.
 */
public class UserController {
    private UserModel model;
    private UserView view;
    public UserController(UserModel model, UserView view) {
        this.model = model;
        this.view = view;
        this.view.getSubmitButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.setName(view.getNameField().getText());
                model.setEmail(view.getEmailField().getText());
                view.showMessage("Gespeichert: " + model.getName() + " (" +
                        model.getEmail() + ")");
            }
        });
    }
}