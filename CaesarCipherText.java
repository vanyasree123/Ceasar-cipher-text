import java.util.Scanner;

public class CaesarCipherText {
    
    // Function to encrypt the text using Caesar Cipher
    public static String encrypt(String text, int shift) {
        StringBuilder encryptedText = new StringBuilder();
        
        // Traverse each character of the text
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            
            // Encrypt uppercase letters
            if (Character.isUpperCase(character)) {
                char encryptedChar = (char) (((int) character + shift - 65) % 26 + 65);
                encryptedText.append(encryptedChar);
            }
            // Encrypt lowercase letters
            else if (Character.isLowerCase(character)) {
                char encryptedChar = (char) (((int) character + shift - 97) % 26 + 97);
                encryptedText.append(encryptedChar);
            }
            // Non-alphabetical characters are added unchanged
            else {
                encryptedText.append(character);
            }
        }
        
        return encryptedText.toString();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get input from the user
        System.out.print("Enter text to encrypt: ");
        String text = scanner.nextLine();
        
        System.out.print("Enter shift value: ");
        int shift = scanner.nextInt();
        
        // Call encrypt function and display the result
        String encryptedText = encrypt(text, shift);
        System.out.println("Encrypted text: " + encryptedText);
        
        scanner.close();
    }
}

