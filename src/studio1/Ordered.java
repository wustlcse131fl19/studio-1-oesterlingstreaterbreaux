package studio1;

import support.cse131.ArgsProcessor;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int x = ap.nextInt("Value for x?");
		int y = ap.nextInt("Value for y?");
		int z = ap.nextInt("Value for z?");
		boolean isOrdered = true;
		boolean check1 = x < y;
		boolean check2 = y < z;
		boolean check3 = z < y;
		boolean check4 = y < x;
		isOrdered = check1 && check2 || check3 && check4;
		System.out.println(isOrdered);
		}

	}

