public class CountingOccurance {
    public static void main(String args []){
        //in this exercise count occurances of each
        //1 generate 100 lowercase letters
        //how to generate random characters


        char characters [] = new char[100];
        randomchar(characters);
        System.out.println(characters);
        //lets try counting
        int count = 0;
        char[] charArray = {'a', 'b', 'c', 'd', 'e'};
        for(int i = 0; i<characters.length; i++){

            if ( charArray[0] == characters[i]){

                count++;

            }
            System.out.println("the letter " + charArray[0] +" was found"+ count);
        }

    }
//we are able to gnerate characters

    //im creating a mthod to hold 100 chars
    public static  char [] randomchar(char arrays[]){
        for (int i = 0; i<arrays.length; i++){
            char ch = RandomCharacter.getRandomLowerCaseLetter();
            arrays[i] = ch;
        }

        return arrays;
    }
}
