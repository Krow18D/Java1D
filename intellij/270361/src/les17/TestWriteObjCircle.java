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
public class TestWriteObjCircle {

    public static void main(String[] args) throws IOException {
        try ( // Create an output stream for file object.dat
                ObjectOutputStream output
                = new ObjectOutputStream(new FileOutputStream("object.dat"));) {
      // Write an object to the file

            output.writeObject(new Circle(5));
        }
    }

}
