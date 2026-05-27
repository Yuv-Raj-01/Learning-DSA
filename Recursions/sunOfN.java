public class sunOfN {
    public static int sumOfNatural(int n){
        if (n == 1) return 1;
        int snm1 = sumOfNatural(n - 1);
        int sn = n + snm1;
        return sn ;
    }
	public static void main(String[] args) {
		int n = 5;
		System.out.println(sumOfNatural(n));
	}
}
