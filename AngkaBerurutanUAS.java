class AngkaBerurutanUAS {
	public static void main (String[] args) {
		int[] angka = {4,2,3,3,2,4,6,7,3,9};
		System.out.println(ujian(angka));
    }
	public static int ujian(int[] angka) {
		int a =1, b =1;
		for (int j = 1; j < angka.length; j++) {
			if (angka[j] > angka[j - 1]) {
			a++;
			} else {
			a = 1;
			}
			if (a >= b) {
			b = a;
			}
		}
		return b;
	}
}