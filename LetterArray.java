package s0start;

public class LetterArray {
	public static int[] countLetters(String text) {
        int[] array;
        int i, a, ascii1, ascii2;

        array = new int[26];
        i = 0;
        a = 0;
        ascii1 = 65;
        ascii2 = 97;
        while (i < text.length()) {
            while (ascii1 < 91 && ascii2 < 123) {
                if (text.charAt(i) == ascii1 || text.charAt(i) == ascii2) {
                    array[a]++;
                }
                ascii1++;
                ascii2++;
                a++;
            }
            ascii1 = 65;
            ascii2 = 97;
            a = 0; 
            i++;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = countLetters("hallo mein name ist yannis");
        
        System.out.println(array[0]);
    }
}
