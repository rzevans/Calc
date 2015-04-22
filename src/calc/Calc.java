//Rob Evans
//Last updated on 4/20/15
package calc;

//Calculator++ type design

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;


public class Calc extends Application {
    double [] storage = new double[10];
    int activeBuffer = 0;
    String tempStorage = "";
    String operator = "";
    double finalNumber = 0;
    
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();      
 /*----------------------- Calculator Screen -----------------------------*/

        
        TextField text = new TextField();
        text.setLayoutX(3);
        text.setLayoutY(50);
        text.setPrefWidth(195);
        text.setPrefHeight(50);
        text.setAlignment(Pos.BASELINE_RIGHT);
        text.setText("HELLO");
        
        Button b0 = new Button("0");
        Button b1 = new Button("1");
        Button b2 = new Button("2");
        Button b3 = new Button("3");
        Button b4 = new Button("4");
        Button b5 = new Button("5");
        Button b6 = new Button("6");
        Button b7 = new Button("7");
        Button b8 = new Button("8");
        Button b9 = new Button("9");
        Button bDecimal = new Button(".");
        Button bMultiply = new Button("X");
        Button bDivide = new Button("/");
        Button bPlus = new Button("+");
        Button bMinus = new Button("-");
        Button bEquals = new Button("=");
        Button bSqRt = new Button("sqrt");
        Button bCos = new Button("cos");
        Button bSin = new Button("sin");
        Button bLogTwo = new Button("log2");
        Button bLogTen = new Button("log10");
        Button bExp = new Button("^");
        Button bClear = new Button("AC");
        
        bEquals.setLayoutX(150);
        bEquals.setLayoutY(350);
        bEquals.setPrefSize(50.0, 50.0);
        bEquals.setStyle("-fx-background-color: orange; ");
        
        
        bPlus.setLayoutX(150);
        bPlus.setLayoutY(300);
        bPlus.setPrefSize(50.0, 50.0);
        bPlus.setStyle("-fx-background-color: tomato; ");
        
        
        bMinus.setLayoutX(150);
        bMinus.setLayoutY(250);
        bMinus.setPrefSize(50.0, 50.0);
        bMinus.setStyle("-fx-background-color: tomato; ");
        
        
        bDecimal.setLayoutX(100);
        bDecimal.setLayoutY(350);
        bDecimal.setPrefSize(50.0, 50.0);
        
        bMultiply.setLayoutX(150);
        bMultiply.setLayoutY(200);
        bMultiply.setPrefSize(50.0, 50.0);
        bMultiply.setStyle("-fx-background-color: tomato; ");
        
        
        bSqRt.setLayoutX(0);
        bSqRt.setLayoutY(150);
        bSqRt.setPrefSize(50.0,50.0);
        
        bCos.setLayoutX(50);
        bCos.setLayoutY(100);
        bCos.setPrefSize(50.0,50.0);
        
        bSin.setLayoutX(0);
        bSin.setLayoutY(100);
        bSin.setPrefSize(50.0,50.0);
        
        bDivide.setLayoutX(150);
        bDivide.setLayoutY(150);
        bDivide.setPrefSize(50.0, 50.0);
        bDivide.setStyle("-fx-background-color: tomato; ");
        
        
        bLogTwo.setLayoutX(50);
        bLogTwo.setLayoutY(150);
        bLogTwo.setPrefSize(50.0,50.0);
        
        
        bLogTen.setLayoutX(100);
        bLogTen.setLayoutY(150);
        bLogTen.setPrefSize(50.0,50.0);
        
        bExp.setLayoutX(100);
        bExp.setLayoutY(100);
        bExp.setPrefSize(50.0,50.0);
        
        bClear.setLayoutX(150);
        bClear.setLayoutY(100);
        bClear.setPrefSize(50.0,50.0);
        bClear.setStyle("-fx-font-weight: bold;");
        
        b0.setLayoutX(0);
        b0.setLayoutY(350);                
        b0.setPrefSize(100.0, 50.0);
        
        b1.setLayoutX(0);
        b1.setLayoutY(300);
        b1.setPrefSize(50.0, 50.0);
        
        b2.setLayoutX(50);
        b2.setLayoutY(300);
        b2.setPrefSize(50.0, 50.0);
        
        b3.setLayoutX(100);
        b3.setLayoutY(300);
        b3.setPrefSize(50.0, 50.0);
        
        b4.setLayoutX(0);
        b4.setLayoutY(250);        
        b4.setPrefSize(50.0, 50.0);
        
        b5.setLayoutX(50);
        b5.setLayoutY(250);
        b5.setPrefSize(50.0, 50.0);
        
        b6.setLayoutX(100);
        b6.setLayoutY(250);
        b6.setPrefSize(50.0, 50.0);
        
        b7.setLayoutX(0);
        b7.setLayoutY(200);
        b7.setPrefSize(50.0, 50.0);
        
        b8.setLayoutX(50);
        b8.setLayoutY(200);
        b8.setPrefSize(50.0, 50.0);
        
        b9.setLayoutX(100);
        b9.setLayoutY(200);
        b9.setPrefSize(50.0, 50.0);
        
        pane.getChildren().addAll(text,b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bPlus,bMinus,bEquals,bDivide,bMultiply,bDecimal, bSqRt, bCos,bSin,bExp,bLogTwo,bLogTen, bClear);
        Scene scene = new Scene(pane, 200, 400);
        primaryStage.setTitle("Calc");
        primaryStage.setScene(scene);
        primaryStage.show();
        
 /*--------------------Events---------------------------------*/
        b0.setOnAction(new EventHandler<ActionEvent>() {
                @Override public void handle(ActionEvent e) {
                tempStorage+= 0;
                text.setText(tempStorage);
                }
        });
        
         b1.setOnAction(new EventHandler<ActionEvent>() {
                @Override public void handle(ActionEvent e) {
               tempStorage += "1";
               text.setText(tempStorage);
                }
        });
       
        b2.setOnAction(new EventHandler<ActionEvent>() {
                @Override public void handle(ActionEvent e) {
                tempStorage += "2";
                text.setText(tempStorage);
                }
        });
        
         
          b3.setOnAction(new EventHandler<ActionEvent>() {
                @Override public void handle(ActionEvent e) {
                tempStorage += "3";
                text.setText(tempStorage);
                }
        });
          
          b4.setOnAction(new EventHandler<ActionEvent>() {
                @Override public void handle(ActionEvent e) {
                tempStorage += "4";
                text.setText(tempStorage);
                }
        });
           
          b5.setOnAction(new EventHandler<ActionEvent>() {
                @Override public void handle(ActionEvent e) {
                tempStorage += "5";
                text.setText(tempStorage);
                }
        });
            
           b6.setOnAction(new EventHandler<ActionEvent>() {
                @Override public void handle(ActionEvent e) {
                tempStorage += "6";
                text.setText(tempStorage);
                }
        });
             
          b7.setOnAction(new EventHandler<ActionEvent>() {
                @Override public void handle(ActionEvent e) {
                tempStorage += "7";
                text.setText(tempStorage);
                }
        });
              
         b8.setOnAction(new EventHandler<ActionEvent>() {
                @Override public void handle(ActionEvent e) {
                tempStorage += "8";
                text.setText(tempStorage);
                }
        });
       b9.setOnAction(new EventHandler<ActionEvent>() {
                @Override public void handle(ActionEvent e) {
                tempStorage += "9";
                text.setText(tempStorage);
                }
        });
       bDecimal.setOnAction(new EventHandler<ActionEvent>() {
                @Override public void handle(ActionEvent e) {
                tempStorage += ".";
                text.setText(tempStorage);
                }
        });
       
        bPlus.setOnAction(new EventHandler<ActionEvent>() {
                @Override public void handle(ActionEvent e) {
            if(tempStorage != ""){    
                storage[activeBuffer] = Double.parseDouble(tempStorage);
                tempStorage = "";
                activeBuffer++;
                operator = "+";
                text.setText("+");
            }
            else
                text.setText("ERROR");
                }
        });
      
      bMinus.setOnAction(new EventHandler<ActionEvent>() {
                @Override public void handle(ActionEvent e) {
            if(tempStorage != ""){
                storage[activeBuffer] = Double.parseDouble(tempStorage);
                tempStorage = "";
                activeBuffer++;
                operator = "-"; 
                text.setText("-");
            }
            else
                text.setText("ERROR");
                }
        });
      bDivide.setOnAction(new EventHandler<ActionEvent>() {
                @Override public void handle(ActionEvent e) {
            if(tempStorage != ""){
                storage[activeBuffer] = Double.parseDouble(tempStorage);
                tempStorage = "";
                activeBuffer++;
                operator = "/"; 
                text.setText("/");
                }
            else
                text.setText("ERROR");
                }
        });
      bMultiply.setOnAction(new EventHandler<ActionEvent>() {
                @Override public void handle(ActionEvent e) {
            if(tempStorage != ""){
                storage[activeBuffer] = Double.parseDouble(tempStorage);
                tempStorage = "";
                activeBuffer++;
                operator = "x"; 
                text.setText("x");
            }
            else
                text.setText("ERROR");
                }
        });
      bSqRt.setOnAction(new EventHandler<ActionEvent>() {
                @Override public void handle(ActionEvent e) {
            if(tempStorage != ""){
                storage[activeBuffer] = Double.parseDouble(tempStorage);
                double square = Math.sqrt(storage[activeBuffer]);
                tempStorage = "";
                text.setText(Double.toString(square));
                tempStorage = Double.toString(finalNumber);
                activeBuffer++;
            }
            else
                text.setText("ERROR");
                }
        });
      
      bCos.setOnAction(new EventHandler<ActionEvent>() {
                @Override public void handle(ActionEvent e) {
            if(tempStorage != ""){
                storage[activeBuffer] = Double.parseDouble(tempStorage);
                double cos = Math.cos(Math.toRadians(storage[activeBuffer]));
                tempStorage = "";
                text.setText(Double.toString(cos));
                tempStorage = Double.toString(finalNumber);
                activeBuffer++;
                }
            else
                text.setText("ERROR");
                }
        });
      bSin.setOnAction(new EventHandler<ActionEvent>() {
                @Override public void handle(ActionEvent e) {
            if(tempStorage != ""){
                storage[activeBuffer] = Double.parseDouble(tempStorage);
                double sin = Math.sin(Math.toRadians(storage[activeBuffer]));
                tempStorage = "";
                text.setText(Double.toString(sin));
                tempStorage = Double.toString(finalNumber);
                activeBuffer++;}
            else
                text.setText("ERROR");
                }
        });
      bLogTwo.setOnAction(new EventHandler<ActionEvent>() {
                @Override public void handle(ActionEvent e) {
            if(tempStorage != ""){
                storage[activeBuffer] = Double.parseDouble(tempStorage);
                double logTwo = Math.log(storage[activeBuffer])/Math.log(2);
                tempStorage = "";
                text.setText(Double.toString(logTwo));
                tempStorage = Double.toString(finalNumber);
                activeBuffer++;
                }
            else
                text.setText("ERROR");
                }
        });
      bLogTen.setOnAction(new EventHandler<ActionEvent>() {
                @Override public void handle(ActionEvent e) {
            if(tempStorage != ""){
                storage[activeBuffer] = Double.parseDouble(tempStorage);
                double logTen = Math.log10(storage[activeBuffer]);
                tempStorage = "";
                text.setText(Double.toString(logTen));
                tempStorage = Double.toString(finalNumber);
                activeBuffer++;
                }
            else
                text.setText("ERROR");
                }
        });
      bExp.setOnAction(new EventHandler<ActionEvent>() {
                @Override public void handle(ActionEvent e) {
            if(tempStorage != ""){
                storage[activeBuffer] = Double.parseDouble(tempStorage);
                tempStorage = "";
                activeBuffer++;
                operator = "^"; 
                text.setText("^");
                }
            else
                text.setText("ERROR");
                }
        });
      bClear.setOnAction(new EventHandler<ActionEvent>() {
                @Override public void handle(ActionEvent e) {
                activeBuffer = 0;
                tempStorage = "";
                operator = "";
                finalNumber = 0;
                text.setText("0");
                }
        });
       bEquals.setOnAction(new EventHandler<ActionEvent>() {
                @Override public void handle(ActionEvent e) {
                storage[activeBuffer]= Double.parseDouble(tempStorage);
                tempStorage ="";
          
            if(operator == "+"){
                finalNumber = storage[activeBuffer-1]+storage[activeBuffer];
                    text.setText(Double.toString(finalNumber));
                }
            else if(operator == "-"){
                finalNumber = storage[activeBuffer-1] - storage[activeBuffer];
                    text.setText(Double.toString(finalNumber));
                }
            else if(operator == "x"){
                finalNumber = storage[activeBuffer-1] * storage[activeBuffer];
                text.setText(Double.toString(finalNumber));
                }
            else if(operator == "/"){
                if(storage[activeBuffer] != 0){
                    finalNumber = storage[activeBuffer-1] / storage[activeBuffer];
                    text.setText(Double.toString(finalNumber));
                }
                else
                    text.setText("ERROR");
                }
            else if(operator == "^"){
                finalNumber = Math.pow(storage[activeBuffer-1], storage[activeBuffer]);
                text.setText(Double.toString(finalNumber));
                }
                tempStorage = Double.toString(finalNumber);
                activeBuffer++;
                }
        });
               
    }

    public static void main(String[] args) {
        launch(args);
    }
    public static void modOperands(Button button){
        button.setStyle("-fx-background-color:#69D5E6");
    }
    public static void modButtons(Button button){
        button.setStyle("-fx-background-color:#484856");
        
    }
}