package s0start;

public class SetOps {
	public static boolean isSubsetOf(char[] a, char[] b) {
        int i, j, l, h;


        i = 0;
        j = 0;
        l = 0;
        h = 0;
//        if (a.length == 0 && b.length == 0)
//        	return true;
//        else if (a.length == 0 && b.length > 0)
//        	return true;
//        else if (a.length > 0 && b.length == 0)
//        	return false;
        while (i < a.length) {
            while (j < b.length) {
                if (a[i] == b[j])
                	break ;
                else
                	l++;
                j++;
            }
            if (l == b.length)
            	return false;
            j = 0;
            l = 0;
            i++;
        }
       return true;
    }

    public static boolean isEqualTo(char[] a, char[] b) {
        int i, j, l;

        i = 0;
        j = 0;
        l = 0;
        while (i < a.length) {
            while (j < b.length) {
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
        while (i < b.length) {
            while (j < a.length) {
                if (b[i] == a[j])
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
        char[] a = {1,2,3};
        char[] b = {};
        

        System.out.println(isSubsetOf(a, b));
    }
}
