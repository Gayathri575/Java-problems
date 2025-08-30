public class CheckVowelsConsonant {
    public static void main(String [] args){
        String name = " Gayathiirriii";
        name = name.toLowerCase();
        int vowels = 0 , consonant = 0;
        for ( int i = 0 ; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonant++;
                }
            }
            System.out.println("vowels =" + vowels);
            System.out.println("consonant =" + consonant);
        }
    }
}