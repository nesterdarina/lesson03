package lt.lhu.unit02.main;

public class Task09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 10.0;
		double fx = 0;

		if (x <= -3) {
			fx = 9;
		}

		if (x > 3) {
			fx = 1 / (Math.pow(x, 2) + 1);
		}

		System.out.println(fx);
	}

}
