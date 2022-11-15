package s0start;

public class MergeSortedArrays {

    public static int[] merge(int[] a, int[] b) {
        int[] array;
        int i, n, j, l;
        
        array = new int[a.length + b.length];
        i = 0;
        n = 0;
        j = 0;
        l = a.length + b.length;
        while (j < l && i < a.length && n < b.length) {
			if (a[i] < b[n]) {
				array[j] = a[i];
				i++;
			}
			else if (b[n] < a[i]) {
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
        while (i < a.length) {
        	array[j] = a[i];
        	i++;
        	j++;
        }
        while (n < b.length) {
        	array[j] = b[n];
        	n++;
        	j++;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] a = {1,2,5,6,8};
        int[] b = {};
        int[] array = merge(a, b);
        int i = 0;
        while (i < array.length) {
            System.out.println(array[i]);
            i++;
        }
    }
}
