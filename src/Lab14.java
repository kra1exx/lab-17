<?xml version="1.0" encoding="UTF-8"?>
        <?import javafx.scene.control.*?>
        <?import javafx.scene.layout.*?>
<GridPane alignment="center" hgap="10" vgap="10" xmlns="http://javafx.com/javafx/11.0.1" xmlns:fx="http://javafx.com/fxml/1" fx:controller="sample.Controller">
   <children>
      <Pane prefHeight="353.0" prefWidth="360.0">
         <children>
            <Button fx:id="buttonMinus" layoutX="107.0" layoutY="152.0" mnemonicParsing="false" onAction="#ClickMinus" text="-1" />
            <Button fx:id="buttonPlus" layoutX="107.0" layoutY="106.0" mnemonicParsing="false" onAction="#ClickPlus" text="+1" />
            <Label fx:id="addLabel" layoutX="105.0" layoutY="69.0" prefHeight="17.0" prefWidth="165.0" text="Число" />
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