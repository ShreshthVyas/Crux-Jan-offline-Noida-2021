package Lec19;

public class Time_Complxity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=1000;
		System.out.println("hey");
		System.out.println("hey");

		System.out.println("hey");

		System.out.println("hey");

		System.out.println("hey");
		if(a%2==0) {
			System.out.println();
		}
		int i = 0;
		while (i < n) {
			System.out.println("Hey");
// O(n)
			i++;
		}
		while (i > n) {
			System.out.println("Hey");

			i *= 2;
			// Log(n)
		}
		
		while (n > 0) {
			System.out.println("Hey");
			n /= 2;
		}
		while (i <= n) {
			System.out.println("Hey");

			i += 2;
			i += 3;
		}
		while (i <= n) {
			System.out.println("Hey");

			i *= 2;
			i *= 3;
			//log(N) base 6
		}
		while (n > 0) {
			System.out.println("Hey");

			n /= 2;
			n /= 3;
			//log(N) base 6
		}
		while (i <= n) {
			System.out.println("Hey");

			i += k;
			// O(N/K)
		}
		while (i <= n) {
			System.out.println("Hey");

			i *= k;
		}
		while (n > 0) {
			System.out.println("Hey");

			n = n - 1;
			// O(n)
		}
		while (n > 0) {
			System.out.println("Hey");

			n = n - 2;
			n = n - 3;
			// O(n)
		}
		while (n > 0) {
			n = n - k;
			// O(N/K)
		}
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.println("hey");
			}
			// O(n^2)
		}
		for (i = 1; i * i <= n; i++) {
			System.out.println("hey");
			// O(sqrt(N))
		}
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				for (int k = 1; k <= 1000; k++) {
// O(1000*(N^2))
				}
			}
		}
		
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= i * i; j++) {
				for (int k = 1; k <= n / 2; k++) {
					System.out.println("hey");
					// O(N^4)
				}
			}
		}

		for( i=1; i<=n; i*=2) {
			System.out.println("hey");
			// log(N)
		}
		
		for(i=n/2; i<=n; i++) {
			for(int j=1; j<=n/2; j++) {
				for(int k=1; k<=n; k=k*2) {
					System.out.println("hey");
					// N^2*log(n)
				}
			}
		}
		for(i=1; i<=n; i++) {
			for(int j=1; j<=n; j+=i) {
				System.out.println("hey");
				// N(log(n))
			}
		}
		while(n>1) {
			n/=2;
			// log(n)
		}
		
	}

}
