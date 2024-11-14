import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> asciiMorse= new HashMap<>();
        asciiMorse.put("A", ".-");
        asciiMorse.put("B", "-...");
        asciiMorse.put("C", "-.-.");
        asciiMorse.put("D", "-..");
        asciiMorse.put("E", ".");
        asciiMorse.put("F", "..-.");
        asciiMorse.put("G", "--.");
        asciiMorse.put("H", "....");
        asciiMorse.put("I", "..");
        asciiMorse.put("J", ".---");
        asciiMorse.put("K", "-.-");
        asciiMorse.put("L", ".-..");
        asciiMorse.put("M", "--");
        asciiMorse.put("N", "-.");
        asciiMorse.put("O", "---");
        asciiMorse.put("P", ".--.");
        asciiMorse.put("Q", "--.-");
        asciiMorse.put("R", ".-.");
        asciiMorse.put("S", "...");
        asciiMorse.put("T", "-");
        asciiMorse.put("U", "..-");
        asciiMorse.put("V", "...-");
        asciiMorse.put("W", ".--");
        asciiMorse.put("X", "-..-");
        asciiMorse.put("Y", "-.--");
        asciiMorse.put("Z", "--..");
        asciiMorse.put("Ñ", ".----.");

        System.out.println("Introduce una palabra");
        String palabra = scanner.next();
        System.out.println(asciiMorse.get(palabra));

        String[] letras = new String[palabra.length()];

        for(int i = 0; i < palabra.length(); i++){
            letras[i] = String.valueOf(palabra.charAt(i));
        }

        for(String letra : letras){
            System.out.println(letra);
        }
    }
}
