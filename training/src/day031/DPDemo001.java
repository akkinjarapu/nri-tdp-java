package day031;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DPDemo001 {
	private static final Pair SERVEUNITS[] = new Pair[] {
					new Pair(25, 75), 
					new Pair(75, 25), 
					new Pair(100, 0), 
					new Pair(50, 50) 
					};
	
	private static List<Pair> generatePairs(Pair pair) {
		List<Pair> list = Arrays.stream(SERVEUNITS)
					.map(pair::serveBy)
					.filter(p -> p.getSecond() != 0 || p.getFirst() == 0)
					.toList();
		
		if(pair.getFirst() != 0 && pair.getSecond() != 0) {
			list = list.stream()
					.map(p -> {
						if(p.getFirst() == 0 && p.getSecond() == 0)
							p.setWeight(0.5);
						else if(p.getFirst() == 0)
							p.setWeight(1);
						return p;})
					.toList();
		}
		
		return list;
	}
	
	public static void main(String[] args) {
		List<Pair> initialPairs = new ArrayList<Pair>();
		initialPairs.add(new Pair(100));
		
		double prob = 0.25;
		double sum = 0;
		while(true) {
			List<Pair> generatedPairs = initialPairs.stream()
					.map(DPDemo001::generatePairs)
					.flatMap(u ->u.stream())
					.toList();
			
			double weightSum = generatedPairs.stream()
					.mapToDouble(p -> p.getWeight())
					.sum();
			sum += weightSum * prob;
			
			System.out.println(generatedPairs);
			System.out.println(sum);
			generatedPairs = generatedPairs.stream()
			.filter(p -> p.getFirst() != 0)
			.toList();
			
			initialPairs = generatedPairs;
			prob *= 0.25;
			
			if(generatedPairs.isEmpty())
				break;
		}
	}

}
