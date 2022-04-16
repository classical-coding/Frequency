import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Frequency {
	public static void main(String[] args) {
		
		/* creating a list with dummy data */
		List<Integer> inputList = Arrays.asList(1,7,1,1,2,-99,2,3,9,3,11,19,5,9,11,30,-99,8,1,7);
		
		/* finding occurrence of each element in the list and putting it in the Map */
		Map<Integer,Integer> outputMap = inputList.stream().collect(Collectors.toMap(k-> k, v-> 1, Integer::sum));
		
		/* displaying the output */
		outputMap.forEach((k,v)->{
			System.out.println(k+" occurs "+v+" times");
		}); 							
	}
}
