/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package les17;
import java.io.*;

/**
 *
 * @author Pooh
 */
public class TestReadObjCircle {
     public static void main(String[] args) throws ClassNotFoundException, IOException {
    try ( // Create an input stream for file object.dat
      ObjectInputStream input =
        new ObjectInputStream(new FileInputStream("object.dat"));
    ) {
      // Read a string, double value, and object from the file
      Circle c1 = (Circle)(input.readObject());
      System.out.println(c1.getRadius());
    }
    }
}
