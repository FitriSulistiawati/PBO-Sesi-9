public class ReplaceString {
    public static void main(String[] args) {
        String string1="I Love You";
        String GantiKarakter = string1.replace('o', 'i');
        String GantiKalimat = string1.replace("I","No");
        System.out.println("Untuk replace karakter : "+GantiKarakter);
        System.out.println("Untuk replace kalimat : "+GantiKalimat);
    }
}
