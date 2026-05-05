package Pool;

public class Main {
    public static void main(String[]args){ 
        String a = "Enzo";
        String b = "Enzo";
        String c = new String("Enzo");

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(c)); 
    }
    
}
