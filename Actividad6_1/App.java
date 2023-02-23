
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String [] args){
        Padre padrecito = null;
        try{
            padrecito = new Padre("matrix.txt");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        padrecito.start();
    }


}