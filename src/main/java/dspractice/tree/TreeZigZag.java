package dspractice.tree;

import java.util.Scanner;

/**
 * practice
 * Mrityunjaya@infoedge
 * 11/4/19 2:12 PM
 */
public class TreeZigZag {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter tree");
		Tree tree = Tree.constructTree(scanner.nextLine());
	}
}
