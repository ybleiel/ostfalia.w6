public class MergeSortedArrays {
    public static int[] merge(int[] a, int[] b) {
        int[] array;
        int k, i, n, j, l1, l2;

        array = new int[a.length + b.length];
        k = 0;
        i = 0;
        n = 0;
        j = 0;
        l1 = a.length + b.length;
        if (a.length <= b.length) {
            l1 = a.length;
            l2 = b.length;
        }
        else {
            l1 = b.length;
            l2 = a.length;
        }
        while (k < l1) {
            if (a[i] < b[n]) {
                array[j] = a[i];
                i++;
            } else if (b[n] < a[i]) {
                array[j] = b[n];
                n++;
            } else {
                array[j] = a[i];
                i++;
                j++;
                array[j] = b[n];
                n++;
            }
            k++;
            j++;
        }
        while (k <= l2) {
            if (i >= a.length) {
                array[j] = b[n];
                n++;
            }
            else if (n >= b.length) {
                array[j] = a[i];
                i++;
            }
            j++;
            k++;
        }
        return array;
    }

    public static int[] merge1(int[] a, int[] b) {
        int[] array;
        int k, i, n, j, l;

        array = new int[a.length + b.length];
        k = 0;
        i = 0;
        n = 0;
        j = 0;
        l = a.length + b.length;
        while (j < l) {
            if (i < a.length && a[i] < b[n]) {
                array[j] = a[i];
                i++;
            } else if (n < b.length && b[n] < a[i]) {
                array[j] = b[n];
                n++;
            } else {
                array[j] = a[i];
                i++;
                j++;
                array[j] = b[n];
                n++;
            }
            j++;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] a = {1,2,4,6,8};
        int[] b = {3,5,7,9};
        int[] array = merge1(a, b);
        int i = 0;
        while (i < 9) {
            System.out.println(array[i]);
            i++;
        }
    }
}
