

public class SetOps {
    public static boolean isSubsetOf(char[] a, char[] b) {
        int i, j, l;

        i = 0;
        j = 0;
        l = 0;
        while (a[i] != 0) {
            while (b[j] != 0) {
                if (a[i] == b[j])
                    l++;
                j++;
            }
            j = 0;
            i++;
        }
        if (l >= 2)
            return true;
        else
            return false;
    }

    public static boolean isEqualTo(char[] a, char[] b) {
        int i, j, l;

        i = 0;
        j = 0;
        l = 0;
        while (a[i] != 0) {
            while (b[j] != 0) {
                if (a[i] == b[j])
                    l++;
                j++;
            }
            if (l == 0)
                return false;
            l = 0;
            j = 0;
            i++;
        }
        i = 0;
        j = 0;
        l = 0;
        while (b[i] != 0) {
            while (a[j] != 0) {
                if (b[i] == b[j])
                    l++;
                j++;
            }
            if (l == 0)
                return false;
            l = 0;
            j = 0;
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
        char[] a = new char[10];
        char[] b = new char[10];
        a[0] = 'h';
        a[1] = 'o';
        b[0] = 'h';
        b[1] = 'o';
        b[2] = 'o';

        System.out.println(isEqualTo(a, b));
    }
}
