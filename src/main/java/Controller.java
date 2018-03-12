import com.animals.Animal;
import com.animals.Gender;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ListChangeListener;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.awt.*;
import java.net.URL;
import java.util.Observable;
import java.util.Observer;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public TextField txtName;
    public TextField txtReserve;
    public TextField txtBadHabits;
    public Button btnReserveAnimal;
    public ComboBox cmbSpecies;
    public ComboBox<Gender> cmbGender;
    public Button btnAddAnimal;
    @FXML
    private ListView lstAnimals;
    private Reservation reservations = new Reservation();

    public Controller() {
        reservations.addObserver(new Observer() {
            @Override
            public void update(Observable o, Object arg) {
                RefreshControls();
            }
        });
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    private void RefreshControls() {

        lstAnimals.getItems().clear();
        for (Animal animal : this.reservations.Animals) {
            lstAnimals.getItems().add(animal);
        }
        btnReserveAnimal.setVisible(lstAnimals.getSelectionModel().getSelectedItem() != null);
    }

    public void AddAnimal(ActionEvent actionEvent) {
        Gender gender = cmbGender.getSelectionModel().getSelectedItem();
        if (this.cmbSpecies.getSelectionModel().getSelectedItem().equals("Cat")) {
            this.reservations.NewCat(
                    txtName.getText(), gender, txtBadHabits.getText());
        } else if (this.cmbSpecies.getSelectionModel().getSelectedItem().equals("Dog")) {
            this.reservations.NewDog(txtName.getText(), gender);
        }
    }

    public void ReserveAnimal(ActionEvent actionEvent) {
        Animal animal = (Animal) lstAnimals.getSelectionModel().getSelectedItem();

        if (animal != null) {
            animal.reserve(txtReserve.getText());
            this.RefreshControls();
        }
    }


    public void cmbSpeciesChanged(ActionEvent actionEvent) {
        this.txtBadHabits.setVisible(this.cmbSpecies.getValue().equals("Cat"));
    }

    public void lstAnimalsClicked(MouseEvent mouseEvent) {
        btnReserveAnimal.setVisible(!lstAnimals.getSelectionModel().getSelectedItem().equals(null));

    }
}
