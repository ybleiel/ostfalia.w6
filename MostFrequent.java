package s0start;

public class MostFrequent {
	
	public static int mostfreq(int[] array) {
		int i, a, count1, count2, zahl1, zahl2;
		
		i = 0;
		a = 1;
		count1 = 0;
		count2 = 0;
		zahl1 = 0;
		zahl2 = 0;
		if (array.length == 0)
			return -1;
		if (array.length == 1)
			return array[0];
		while (i < array.length) {
			zahl1 = array[i];
			while (a < array.length) {
				if (array[i] == array[a] && i != a) {
					count1++;
				}
				a++;
			}
			if (count1 > count2) {
				count2 = count1;
				zahl2 = zahl1;
			}
			a = 0;
			count1 = 0;
			i++;
		}
		return zahl2;
	}
	
	public static void main(String[] args) {
		int[] array = {5};
		System.out.println(mostfreq(array));
	}
}
