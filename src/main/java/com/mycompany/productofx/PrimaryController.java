// CONTRERAS MARTINEZ BRYAN DANIEL
package com.mycompany.productofx;
import java.net.URL;
import java.util.*;
import javafx.collections.*;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.scene.control.cell.*;

public class PrimaryController implements Initializable {
@FXML private TableView<Producto> tvProduct;
@FXML private TableColumn<Producto, String> tcName, tcMarca;
@FXML private TableColumn<Producto, Double> tcPrice;
@FXML private TableColumn<Producto, Integer> tcQuantity;

@FXML private TextField tfName, tfPrice, tfQuantity, tfMarca;

private final ObservableList<Producto> productList = FXCollections.observableArrayList(
new Producto("Apple", 1.99, 100, "Apple Inc"),
new Producto("Pear", 2.99, 200, "Frutales"),
new Producto("Orange", 3.99, 300, "Citrus")        
);

@Override
public void initialize(URL url, ResourceBundle rb){
tcName.setCellValueFactory(new PropertyValueFactory<>("name"));
tcPrice.setCellValueFactory(new PropertyValueFactory<>("price"));
tcQuantity.setCellValueFactory(new PropertyValueFactory<>("quantity"));
tcMarca.setCellValueFactory(new PropertyValueFactory<>("marca"));
tvProduct.setItems(productList);

tvProduct.setEditable(true);
tcName.setCellFactory(TextFieldTableCell.forTableColumn());
tcName.setOnEditCommit(e -> e.getRowValue().setName(e.getNewValue()));
tcMarca.setCellFactory(TextFieldTableCell.forTableColumn());
tcMarca.setOnEditCommit(e -> e.getRowValue().setMarca(e.getNewValue()));
}

@FXML
private void handleBtnAdd(ActionEvent event){
    productList.add(new Producto(tfName.getText(), Double.parseDouble(tfPrice.getText()), Integer.parseInt(tfQuantity.getText()), tfMarca.getText()));
    handleBtnReset(null);
}
@FXML
private void handleBtnReset(ActionEvent event){
    tfName.clear(); tfPrice.clear(); tfQuantity.clear(); tfMarca.clear();
}

@FXML
private void handleBtnDel(ActionEvent event){
    List<Integer> indices = new ArrayList<>(tvProduct.getSelectionModel().getSelectedIndices());
    indices.sort(Collections.reverseOrder());
    for(int i : indices) productList.remove(i);
}
}
