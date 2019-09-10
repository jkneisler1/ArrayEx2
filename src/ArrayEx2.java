public class ArrayEx2 {
    public static void main(String[] args) {
        // char[] charAry = {'W', 'e', 'l', 'c', 'o', 'm', 'e'};
        String aryInput = "Welcome";
        char[] charAry = aryInput.toCharArray();
        for (int j = 0; j < charAry.length; j++) {
            System.out.print(charAry[j]);
        }
        System.out.println();
        for (int i = charAry.length - 1; i >= 0; i--) {
            System.out.print(charAry[i]);
        }
    }
}
