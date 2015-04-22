//Rob Evans
//Last updated on 4/20/15
package calc;

//Calculator++ type design

import java.util.ArrayList;
import java.util.ListIterator;
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
    ArrayList<Button> otherButtons = new ArrayList<>();
    ArrayList<Button> buttons = new ArrayList<>();
    double [] storage = new double[10];
    int activeBuffer = 0;
    String tempStorage = "";
    String operator = "";
    double finalNumber = 0;
    
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 215, 400);
        pane.setStyle("-fx-background-color: black");
 /*----------------------- Calculator Screen -----------------------------*/

        
        TextField text = new TextField();
        text.setLayoutX(5);
        text.setLayoutY(10);
        text.setPrefWidth(215);
        text.setPrefHeight(50);
        text.setAlignment(Pos.BASELINE_RIGHT);
        //text.setText("0");
        
 /*-----------------------Buttons-----------------------------------------*/     
       Button b0 = new Button("0");
        buttons.add(b0);
       Button bDecimal = new Button(".");
        buttons.add(bDecimal);
       Button bNegative = new Button("(-)");
        buttons.add(bNegative);
       Button bEquals = new Button("=");
        buttons.add(bEquals);
        bEquals.setStyle("-fx-background-color: orange; ");
       Button b1 = new Button("1");
        buttons.add(b1);
       Button b2 = new Button("2");
        buttons.add(b2);
       Button b3 = new Button("3");
        buttons.add(b3); 
       Button bPlus = new Button("+");
        buttons.add(bPlus); 
        bPlus.setStyle("-fx-background-color: tomato; ");
       Button b4 = new Button("4");
        buttons.add(b4);
       Button b5 = new Button("5");
        buttons.add(b5);
       Button b6 = new Button("6");
        buttons.add(b6);
       Button bMinus = new Button("-");
        buttons.add(bMinus);
        bMinus.setStyle("-fx-background-color: tomato; ");
       Button b7 = new Button("7");
        buttons.add(b7);
       Button b8 = new Button("8");
        buttons.add(b8);
       Button b9 = new Button("9");
        buttons.add(b9);
       Button bMultiply = new Button("X");
        buttons.add(bMultiply);
       Button bSqRt = new Button("sqrt");
        buttons.add(bSqRt);
        bMultiply.setStyle("-fx-background-color: tomato; ");
       Button bLogTwo = new Button("log2");
        buttons.add(bLogTwo);
       Button bLogTen = new Button("log10");
        buttons.add(bLogTen);
       Button bDivide = new Button("/");
        buttons.add(bDivide);
        bDivide.setStyle("-fx-background-color: tomato; ");
       Button bSin = new Button("sin");
        buttons.add(bSin);
       Button bCos = new Button("cos");
        buttons.add(bCos);
       Button bExp = new Button("^");
        buttons.add(bExp);
       Button bClear = new Button("AC");
        buttons.add(bClear);
       
        int count = 0;
        int x = 5;
        int y = 350;
        for(int i=0;i<24;i++){
            if(count < 3){
                modButtons(buttons.get(i),x,y);
                x+=55;
                count++;
            }
            else{
                modButtons(buttons.get(i),x,y);
                x =5;
                y -= 55;
                count=0;
            }
            
        }
        
        pane.getChildren().addAll(text,b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bPlus,bMinus,bEquals,bDivide,bMultiply,bDecimal, bSqRt, bCos,bSin,bExp,bLogTwo,bLogTen, bClear,bNegative);
        primaryStage.setTitle("Calc");
        primaryStage.setResizable(false);
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
                    text.setText("CANNOT DIVIDE BY ZERO");
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
    public static void modButtons(Button button, int x, int y){
        //button.setStyle("-fx-background-color:#484856");
        button.setPrefSize(50.00,50.00);
        button.setLayoutX(x);
        button.setLayoutY(y);
        
    }
}