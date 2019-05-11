package normal;

import java.util.*;
import java.lang.*;
import java.io.*;

class Normal {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		//code
		int numT = sc.nextInt();
		while (numT-- > 0) {
			int numPoints = sc.nextInt();
//			System.out.println(numT + " - size - " + numPoints);
			int count = 0;
			List<String> coordinates = new LinkedList<>();
			for (int i = 0; i < numPoints; i++) {
				String coordinate = sc.nextLine();
				if(coordinate.isEmpty()) i--;
				else coordinates.add(coordinate);
			}
			for (int i = 0; i < numPoints; i++) {
				for (int j = i; j < numPoints; j++) {
					String x1 = coordinates.get(i).split(" ")[0];
					String y1 = coordinates.get(i).split(" ")[1];
					String x2 = coordinates.get(j).split(" ")[0];
					String y2 = coordinates.get(j).split(" ")[1];
					if (i != j && ((x1).equals(x2) || y1.equals(y2)) && !((x1).equals(x2) && y1.equals(y2))) {
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}
}