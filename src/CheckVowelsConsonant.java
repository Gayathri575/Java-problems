public class CheckVowelsConsonant {
    public static void main(String[] args) {
        String hello = "Gayathiri";
        hello = hello.toLowerCase();

        int vowels = 0, consonants = 0;
        for (int i = 0; i < hello.length(); i++) {
            char ch = hello.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
