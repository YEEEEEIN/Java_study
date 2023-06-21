package Main;

import org.apache.commons.math3.stat.regression.SimpleRegression;

public class P1 {

	public static void main(String[] args) {
		SimpleRegression simpleRegression = new SimpleRegression(true);
		simpleRegression.addData(new double[][] {
			{12, 20},
			{23, 30},
			{32, 40},
			{43, 50},
			{52, 60}
		});
		double N = 50.0;
		System.out.println("Intercept = " + simpleRegression.getIntercept());
		System.out.println("Prediction = " + N + "=" + simpleRegression.predict(N));
		System.out.println("R square = " + simpleRegression.getRSquare());
		System.out.println("Significance Level1 = " + simpleRegression.getSignificance());
	}

}
