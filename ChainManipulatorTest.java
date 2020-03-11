public class ChainManipulatorTest{
    // public static void main(String[] args) {
    //     ChainManipulator iD = new ChainManipulator();
    //     String str = iD.trimAndConcat("    Hello     ","     World    ");
    //     System.out.println(str);
    // }

    // public static void main(String[] args){
    //     ChainManipulator iD = new ChainManipulator();
    //     char letter = 'n';
    //     Integer a = iD.getIndexOrNull("Coding", letter);
    //     Integer b = iD.getIndexOrNull("Hola Mundo", letter);
    //     Integer c = iD.getIndexOrNull("Saludar", letter);
    //     System.out.println(a); // 4
    //     System.out.println(b); // 7
    //     System.out.println(c); // null
    // }

    // public static void main(String[] args){
    //     ChainManipulator iD = new ChainManipulator();
    //     String word = "Hello";
    //     String substring = "llo";
    //     String notsubstring = "ulo";

    //     Integer first_ex = iD.getIndexOrNull(word,substring);
    //     Integer second_ex = iD.getIndexOrNull(word,notsubstring);

    //     System.out.println(first_ex); //2
    //     System.out.println(second_ex); //null
    // }

    public static void main(String[] args){
        ChainManipulator iD = new ChainManipulator();
        
        String first = "Hello";
        String second = "World";

        int initial_idx = 1;
        int last_idx = 4;

        String final_result = iD.concatSubstring(first, initial_idx, last_idx, second);

        System.out.println(final_result);

    }

    

}