package hotel.table.booking.dao;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class PinHashing {

	public static void main(String[] args) {
		PinHashing hashing = new PinHashing();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 4 Digit Pin : ");
		System.out.println(hashing.getHashValue(sc.nextInt()));
		sc.close();
	}

	public String getHashValue(int pin) {
		PinHashing hashing = new PinHashing();
		try {
			return hashing.toHexString(hashing.getSHA(String.valueOf(pin)));
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return null;
	}

	private byte[] getSHA(String input) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		return md.digest(input.getBytes(StandardCharsets.UTF_8));
	}

	private String toHexString(byte[] hash) {
		BigInteger number = new BigInteger(1, hash);
		StringBuilder hexString = new StringBuilder(number.toString(16));
		while (hexString.length() < 64) {
			hexString.insert(0, '0');
		}
		return hexString.toString();
	}
}
