package les12writedata;

import java.io.FileNotFoundException;

public class WriteData {
  public static void main(String[] args)  {
    java.io.File file = new java.io.File("scores.txt");
    if (file.exists()) {
      System.out.println("File already exists");
      System.exit(0);
    }

    // Create a file
    java.io.PrintWriter output = null;
    try {
      output = new java.io.PrintWriter(file);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    // Write formatted output to the file
    output.print("John T Smith ");
    output.println(90);
    output.print("Eric K Jones ");
    output.println(85);

    // Close the file
    output.close();
  }
}
