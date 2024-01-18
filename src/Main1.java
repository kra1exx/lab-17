import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.text.Text;
public class Main1 extends Application{
    @Override
    public void start(Stage stage) {
        Scene.scene = new Scene(group);
        stage.setScene(scene);
        stage.setTitle("Firs Application");
        stage.setWidth(300);
        stage.setHeight(250);
        stage.show();
    }
    public static void main(String[] args){
        Application.launch(args);
    }
}