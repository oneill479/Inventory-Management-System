/**
 * Class Main.java
 */

/**
 *
 * @author Caleb O'Neill
 */

import Model.Part;
import Model.Product;
import Model.InHouse;
import Model.Outsourced;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import static Model.Inventory.*;
import static Controller.AddPartsController.getRandomPartId;
import static Controller.AddProductsController.getRandomProductId;

/**
 * Javadoc located in 'docs' folder in top level directory
 * RUNTIME ERROR Needed to update the actual product and not create a new one (modify products controller)
 * RUNTIME ERROR Did not set allParts and allProducts to FXCollections.observableArrayList(); (Inventory)
 * FUTURE ENHANCEMENTS - Add photos of bikes and parks so user can make sure correct product is being checked out
 * FUTURE ENHANCEMENTS - User login for security. Also admin access to add and delete parts and products
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Part wheel = new InHouse(getRandomPartId(), "Handle Bar", 17.99, 4, 2, 8, 2593);
        addPart(wheel);
        Part tire = new Outsourced(getRandomPartId(), "Tire", 12.99, 5, 1, 6, "Sears");
        addPart(tire);
        Part light = new Outsourced(getRandomPartId(), "LED Bike Light", 4.99, 8, 2, 10, "Sears");
        addPart(light);

        Product dirtBike = new Product(getRandomProductId(), "Touring Bike", 79.99, 3, 1, 4);
        addProduct(dirtBike);
        Product cruiserBike = new Product(getRandomProductId(), "Cruiser Bike", 59.99, 5, 1, 8);
        addProduct(cruiserBike);
        Product roadBike = new Product(getRandomProductId(), "Road Bike", 99.99, 3, 1, 4);
        addProduct(roadBike);

        Parent root = FXMLLoader.load(getClass().getResource("View/MainScreen.fxml"));
        primaryStage.setTitle("Main Screen");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }

    public static void main(String[] args) { launch(args); }

}
