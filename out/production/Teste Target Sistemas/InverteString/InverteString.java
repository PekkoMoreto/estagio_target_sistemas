import java.util.Scanner;

public class InverteString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma string para inverter: ");
        String entrada = scanner.nextLine();
        
        String invertida = inverterString(entrada);
        
        System.out.println("String invertida: " + invertida);
        
        scanner.close();
    }
    
    public static String inverterString(String str) {
        char[] caracteres = str.toCharArray();
        int tamanho = caracteres.length;
        
        String invertida = "";
        
        for (int i = tamanho - 1; i >= 0; i--) {
            invertida += caracteres[i];
        }
        
        return invertida;
    }
}
