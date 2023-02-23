
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Padre extends Thread {
    private int[][] matriz;
    private Hijo[] hijitos ;

    public Padre (String nombreArchivo) throws FileNotFoundException{
        File file = new File(nombreArchivo);
        Scanner scanner = new Scanner(file);
        List<int[]> rows = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();
            String[] elements = line.split(" ");
            int[] row = new int[elements.length];

            for (int i = 0; i < elements.length; i++) {
                row[i] = Integer.parseInt(elements[i]);
            }

            rows.add(row);
        }

        scanner.close();

        hijitos = new Hijo[rows.size()];

        int[][] matrix = new int[rows.size()][];
        for (int i = 0; i < rows.size(); i++) {
            matrix[i] = rows.get(i);
        }

       matriz = matrix;

       printMatrix(matrix);

    }


    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    

    @Override
    public void run(){
        for(int i = 0; i < hijitos.length; i++){
            System.out.println("Asignando filas a ls hijos");
            
            hijitos[i] = new Hijo(matriz[i]);

            hijitos[i].start();

            /* 
             * try {
                hijitos[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            */


        }


    }
}
