// Write an efficient program to count the number of 1s in the binary representation of an integer.
// Input : n = 6
// Output : 2
// Binary representation of 6 is 110 and has 2 set bits

// Input : n = 13
// Output : 3
// Binary representation of 13 is 1101 and has 3 set bits


import java.io.*;

class SetBits {

	public static int countSetBits(int n) {
		if (n == 0)
			return 0;
		else
			return (n & 1) + countSetBits(n >> 1);
	}
	public static void main(String[] args) {
		int n = 9;
		System.out.println(countSetBits(n));
	}
}