import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.*;

public class LoanCalculator extends Application {
  private TextField tfAnnualInterestRate = new TextField();
  private TextField tfNumberOfYears = new TextField();
  private TextField tfLoanAmount = new TextField();
  private TextField tfMonthlyPayment = new TextField();
  private TextField tfTotalPayment = new TextField();
  private Button btCalculate = new Button("Calculate");
  private Button btSave = new Button("Save");
  private Button btLoad = new Button("Load");
  Loan loan;
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create UI
    GridPane gridPane = new GridPane();
    gridPane.setHgap(5);
    gridPane.setVgap(5);
    gridPane.add(new Label("Annual Interest Rate:"), 0, 0);
    gridPane.add(tfAnnualInterestRate, 1, 0);
    gridPane.add(new Label("Number of Years:"), 0, 1);
    gridPane.add(tfNumberOfYears, 1, 1);
    gridPane.add(new Label("Loan Amount:"), 0, 2);
    gridPane.add(tfLoanAmount, 1, 2);
    gridPane.add(new Label("Monthly Payment:"), 0, 3);
    gridPane.add(tfMonthlyPayment, 1, 3);
    gridPane.add(new Label("Total Payment:"), 0, 4);
    gridPane.add(tfTotalPayment, 1, 4);
    gridPane.add(btCalculate, 0, 5);
    gridPane.add(btSave, 1, 5);
    gridPane.add(btLoad, 2, 5);

    // Set properties for UI
    gridPane.setAlignment(Pos.CENTER);
    tfAnnualInterestRate.setAlignment(Pos.BOTTOM_RIGHT);
    tfNumberOfYears.setAlignment(Pos.BOTTOM_RIGHT);
    tfLoanAmount.setAlignment(Pos.BOTTOM_RIGHT);
    tfMonthlyPayment.setAlignment(Pos.BOTTOM_RIGHT);
    tfTotalPayment.setAlignment(Pos.BOTTOM_RIGHT);
    tfMonthlyPayment.setEditable(false);
    tfTotalPayment.setEditable(false);
    GridPane.setHalignment(btCalculate, HPos.RIGHT);
    btSave.setDisable(true);
    btLoad.setDisable(true);

    // Process events
    btCalculate.setOnAction(e -> calculateLoanPayment());
    btSave.setOnAction(e -> {
      try {
        SaveLoanPayment();
      } catch (IOException e1) {
        e1.printStackTrace();
      }
    });
    btLoad.setOnAction(e -> {
      try {
        LoadLoanPayment();
      } catch (ClassNotFoundException e1) {
        e1.printStackTrace();
      } catch (IOException e1) {
        e1.printStackTrace();
      }
    });

    // Create a scene and place it in the stage
    Scene scene = new Scene(gridPane, 400, 250);
    primaryStage.setTitle("LoanCalculator"); // Set title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }

  private void calculateLoanPayment() {
    // Get values from text fields
    double interest =
      Double.parseDouble(tfAnnualInterestRate.getText());
    int year = Integer.parseInt(tfNumberOfYears.getText());
    double loanAmount =
      Double.parseDouble(tfLoanAmount.getText());

    // Create a loan object. Loan defined in Listing 10.2
    loan = new Loan(interest, year, loanAmount);

    // Display monthly payment and total payment
    tfMonthlyPayment.setText(String.format("$%.2f",
      loan.getMonthlyPayment()));
    tfTotalPayment.setText(String.format("$%.2f",
      loan.getTotalPayment()));
    btSave.setDisable(false);
    btCalculate.setDisable(true);
  }
  private void SaveLoanPayment() throws IOException{
    try ( // Create an output stream for file object.dat
          ObjectOutputStream output
                  = new ObjectOutputStream(new FileOutputStream("loan.obj"))
          )
    {
      // Write an object to the file

      output.writeObject(loan);
    }
    tfLoanAmount.setText("");
    tfNumberOfYears.setText("");
    tfAnnualInterestRate.setText("");
    tfMonthlyPayment.setText("");
    tfTotalPayment.setText("");
    btSave.setDisable(true);
    btCalculate.setDisable(true);
    btLoad.setDisable(false);
  }
  private void LoadLoanPayment()throws ClassNotFoundException, IOException {
    try ( // Create an input stream for file object.dat
          ObjectInputStream input =
                  new ObjectInputStream(new FileInputStream("loan.obj"))
    ) {
      // Read a string, double value, and object from the file
      loan = (Loan)(input.readObject());

      tfAnnualInterestRate.setText(String.format("%.2f",loan.getAnnualInterestRate()));
      tfNumberOfYears.setText(String.format("%d",loan.getNumberOfYears()));
      tfLoanAmount.setText(String.format("%.2f",loan.getLoanAmount()));
      tfMonthlyPayment.setText(String.format("$%.2f",
              loan.getMonthlyPayment()));
      tfTotalPayment.setText(String.format("$%.2f",
              loan.getTotalPayment()));
    }

  }
  
  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}