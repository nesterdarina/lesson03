package lt.lhu.unit02.main;

public class Task05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 2;
		double b = 4;
		double c = 3;
		double result;
		result = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a 
				- Math.pow(a, 3) * c + b;
		System.out.print(result);
	}
}
