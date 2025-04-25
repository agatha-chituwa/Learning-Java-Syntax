public class getCharacter {
    public static  void main(String [] args){
        String s = "moon";
        char firstCharacter = s.charAt(0);
        String name = "";
        for(int i = 0; i< s.length(); i++){
            int l = s.length() - i;

            if(s.charAt(i)  == s.charAt(l-1)){
                name = "palindrome";
            }else {
                name = "not palindrome";
            }
        }
        System.out.println(s + " is " + name);
    }
}
