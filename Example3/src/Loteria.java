import java.lang.reflect.Array;
import java.util.Arrays;

public class Loteria {
	private Integer min;
	private Integer max;
	private Integer length;
	private Integer[] results;
	public Loteria(Integer min, Integer max, Integer length) {
		this.min = min;
		this.max = max;
		this.length = length;
		this.results = new Integer[this.length];
		for (int i = 0; i < this.results.length; i++) {
			this.results[i] = -1;
		}
	}
	public Integer[] generate() {
		Integer count = 0;
		while (count < this.length) {
			//Casting! Integer --> Double --> Integer
			Double generateNumber = Math.random() * this.max + this.min;
			
			//Casting of double a Integer
			Integer integerNumber = generateNumber.intValue();
			if (integerNumber <= this.max && checkRepeatNumber(integerNumber)) {
				this.results[count] = integerNumber;
				count++;
			}
		}
		//Ordenar Short!
		Arrays.sort(this.results);
		return this.results;
	}
	private Boolean checkRepeatNumber(Integer number) {
		for (int i = 0; i < this.results.length; i++) {
			if (this.results[i] == number) {
				return false;
			}
		}
		return true;
	}
	
}
