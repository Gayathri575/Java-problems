public class ReverseString{
    public static void main(String [] args){
        String name = " depression";
        String reverse = "";
        for (int i = name.length() -1; i >=0 ; i --){
            reverse += name.charAt(i);
        }
        System.out.println("Name =" +name );
        System.out.println("Reverse ="+ reverse);
    }
}