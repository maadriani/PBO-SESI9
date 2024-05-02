public class ReplaceString {
    public static void main(String[] args) {
        String string = "Apa kabar";
        String GantiKarakter = string.replace("A", "K");
        String GantiKalimat = string.replace("Hello", "Good Morning");
        System.out.println("untuk replace karakter : "+ GantiKarakter);
        System.out.println("untuk replace kalimat :"+ GantiKalimat);
        
    }
    
}