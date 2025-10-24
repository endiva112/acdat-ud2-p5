import java.io.*;

public class Main {
    public static void main(String[] args) {
        /*
        TODO:
        1. Leer el archivo "personas.csv" usando un BufferedReader.
        2. Saltar la primera línea del archivo (la cabecera).
        3. Por cada línea leída, crear un objeto Persona usando su constructor que recibe una cadena CSV.
        4. Guardar cada Persona en una lista (ArrayList).
        5. Imprimir en consola los datos de todas las personas almacenadas en la lista.
        */

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("persona.csv"));
            String linea;
            if ((linea = br.readLine()) != null) {
            Persona persona = new Persona(linea);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
                throw new RuntimeException(e);
        }






        /*
        TODO:
        (Opcional) Divide las funcionalidades del main() en métodos y crea un método que pueda pedir datos por
        terminal y almacenarlos en el fichero CSV.
         */



                /*
        TODO:
        1. Leer el archivo "personas.csv" usando un BufferedReader.
        2. Saltar la primera línea del archivo (la cabecera).
        3. Por cada línea leída, crear un objeto Persona usando su constructor que recibe una cadena CSV.
        4. Guardar cada Persona en una lista (ArrayList).
        5. Imprimir en consola los datos de todas las personas almacenadas en la lista.
        */

        
                /*
        TODO:
        (Opcional) Divide las funcionalidades del main() en métodos y crea un método que pueda pedir datos por
        terminal y almacenarlos en el fichero CSV.
         */

    }
}
