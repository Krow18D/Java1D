
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Pooh
 */
public class TestFoo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try ( // Create an output stream for file object.dat
                ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("fooObj.dat"));) {
            Foo f = new Foo();
            output.writeObject(f);
        }
       
        // read 
      /* try ( // Create an input stream for file object.dat
                ObjectInputStream input
                = new ObjectInputStream(new FileInputStream("fooObj.dat"));) {
            // Read a string, double value, and object from the file
            Foo f = (Foo) (input.readObject());
            System.out.println(f.getV1());
        }*/
       
    }
}
