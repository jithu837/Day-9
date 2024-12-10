public class  LengthOfLastWord {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("Length of the last word: " + lengthOfLastWord(str));
    }
    public static int lengthOfLastWord(String str) {
        str = str.trim();
        if (str.isEmpty()) {
            return 0;
        } 
        int lastSpaceIndex = str.lastIndexOf(' ');
        return str.length() - lastSpaceIndex - 1;
    }
}
