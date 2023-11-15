package Ex02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class App {
    public static MyTime mt;
    public static String path = "L20 Arkitektur og Serializable\\src\\Ex02\\MyData.ser";
    public static void main(String[] args) {
        mt = readFile();
        if (mt == null) {
            System.out.println("File not found, constructing new element");
            mt = new MyTime();
        }
        System.out.println(mt.getTime());
        mt.increase();
        System.out.println(mt.getTime());
        saveFile(mt);
    }

    public static void saveFile(MyTime mt){
        try(FileOutputStream fileOut = new FileOutputStream(path);
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut)){
            objOut.writeObject(mt);
            System.out.println("File saved");
        }catch (Exception e){
            System.err.println("Error caught!: " + e.getMessage());
        }
    }

    public static MyTime readFile(){
        try(FileInputStream fileIn = new FileInputStream(path);
            ObjectInputStream objIn = new ObjectInputStream(fileIn)){
            Object obj = objIn.readObject();
            MyTime mt = (MyTime) obj;
            return mt;
        }catch(Exception e){
            System.err.println("Error caught: " + e.getMessage());
            return null;
        }
    }
}
