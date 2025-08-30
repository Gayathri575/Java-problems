public class Palindrom{
    public static void main(String [] args) {
        String Gayu = "Madam";
        String reverse = "";
        for (int i = Gayu.length() - 1; i >= 0; i--) {
            reverse += Gayu.charAt(i);
        }
        if ( Gayu.equalsIgnoreCase(reverse)){
            System.out.println("This is Palindrom");
        }
        else{
            System.out.println("This is Not a Palindrom");
        }

    }
}