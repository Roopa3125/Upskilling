package com.prime;

public class Prime {

	public static void main(String[] args) {
	
		int n = 10;
		int c;
		for (int i = 2; i <= n; i++) {
			c = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					c++;
					break;
				}
			}
			if (c == 0)
				System.out.println(i);
		}

	}

}
