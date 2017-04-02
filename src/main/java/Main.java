import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word01 = scanner.next();
        String word02 = scanner.next();
        int lang = 0;
        int lang2 = 0;
        if (word01.equals(word02)) {
            System.out.println("Имена идентичны");
        } else {
            for (int k = 0; k < word01.length(); k++) {
                word01.charAt(k);
                lang++;
            }
            //System.out.println(lang);
            for(int i = 0; i < word02.length(); i++){
                word02.charAt(i);
                lang2++;
            }
           //System.out.println(lang2);
            if(lang == lang2){
                System.out.println("Длины имен равны");
            }
            else {
                System.out.println(" ");
            }
        }
    }
}