
<?xml version="1.0" encoding="UTF-8"?>

        <?import javafx.scene.control.*?>
        <?import javafx.scene.layout.*?>

<GridPane alignment="center" hgap="10" vgap="10" xmlns="http://javafx.com/javafx/11.0.1" xmlns:fx="http://javafx.com/fxml/1" fx:controller="sample.Controller">
   <children>
      <Pane prefHeight="353.0" prefWidth="606.0">
         <children>
            <Button id="Button2" fx:id="Button2" layoutX="277.0" layoutY="82.0" mnemonicParsing="false" onAction="#clickbutton2" text="Button 2" />
            <Button id="Button3" fx:id="Button3" layoutX="481.0" layoutY="82.0" mnemonicParsing="false" onAction="#clickbutton3" text="Button 3" />
            <Button id="Button1" fx:id="Button1" layoutX="63.0" layoutY="82.0" mnemonicParsing="false" onAction="#clickbutton1" text="Button 1" />
            <Label fx:id="Label" layoutX="269.0" layoutY="245.0" prefHeight="53.0" prefWidth="90.0" text="Click the Button" textFill="RED" />
         </children>
      </Pane>
   </children>
   <columnConstraints>
      <ColumnConstraints />
   </columnConstraints>
   <rowConstraints>
      <RowConstraints />
   </rowConstraints>
</GridPane>