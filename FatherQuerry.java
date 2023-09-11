package SonOnVacation;

import java.util.*;

public class FatherQuerry {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, List<String>> graph = new HashMap<>();
		Set<String> dp = new HashSet<>();

		int NoOfPlaces = sc.nextInt();

		for (int i = 0; i < NoOfPlaces; i++)
			graph.put(sc.next(), new ArrayList<>());

		int NoOfTickes = sc.nextInt();

		for (int i = 0; i < NoOfTickes; i++) {
			String from = sc.next();
			String to = sc.next();
			graph.get(from).add(to);
		}

		String StartPoint = sc.next();

		while (!dp.contains(StartPoint)) {
			System.out.print(StartPoint);
			dp.add(StartPoint);
			StartPoint = graph.get(StartPoint).get(0);
			if (!dp.contains(StartPoint)) {
				System.out.print("->");
			}
		}

	}
}
