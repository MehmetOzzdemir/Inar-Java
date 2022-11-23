package chapters.chapter_04;

public class Quiz_04_03 {
	public static final double earthRadius = 6371.01;

	public static void main(String[] args) {

		double atlantaGeorgiaY = -84.3879824;
		double atlantaGeorgiaX = 33.7489954;

		double orlandoFloridaY = -81.3792364999;
		double orlandoFloridaX = 28.5383355;

		double savannahGeorgiaY = -81.09983419999998;
		double savannahGeorgiaX = 32.0835407;

		double charlotteNorthCarolinaY = -80.84312669999997;
		double charlotteNorthCarolinaX = 35.2270869;

		double t1Side1 = DistanceBetweenTwoPoint(atlantaGeorgiaX, atlantaGeorgiaY, savannahGeorgiaX, savannahGeorgiaY);
		double t1Side2 = DistanceBetweenTwoPoint(savannahGeorgiaX, savannahGeorgiaY, charlotteNorthCarolinaX,
				charlotteNorthCarolinaY);
		double t1Side3 = DistanceBetweenTwoPoint(charlotteNorthCarolinaX, charlotteNorthCarolinaY, atlantaGeorgiaX,
				atlantaGeorgiaY);

		double t2Side1 = DistanceBetweenTwoPoint(atlantaGeorgiaX, atlantaGeorgiaY, orlandoFloridaX, orlandoFloridaY);
		double t2Side2 = DistanceBetweenTwoPoint(orlandoFloridaX, orlandoFloridaY, savannahGeorgiaX, savannahGeorgiaY);
		double t2Side3 = DistanceBetweenTwoPoint(savannahGeorgiaX, savannahGeorgiaY, atlantaGeorgiaX, atlantaGeorgiaY);

		boolean isTriangle1 = isTriangle(t1Side1, t1Side2, t1Side3);
		boolean isTriangle2 = isTriangle(t2Side1, t2Side2, t2Side3);

		if (isTriangle1 && isTriangle2) {
			double area1 = getTriangleArea(t1Side1, t1Side2, t1Side3);
			double area2 = getTriangleArea(t2Side1, t2Side2, t2Side3);
			System.out.printf("Triangle 1: %f -- %f -- %f   : area = %f\n", t1Side1, t1Side2, t1Side3, area1);
			System.out.printf("Triangle 2: %f -- %f -- %f   : area = %f\n", t2Side1, t2Side2, t2Side3, area2);
			double totalArea = area1 + area2;
			System.out.println("The area of the triangle is " + totalArea);
		} else {
			System.out.println("Sorry the coordinates are incorrect");
		}

	}

	public static double DistanceBetweenTwoPoint(double x1, double y1, double x2, double y2) {
		double distance = earthRadius * Math
				.acos((Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2))) + (Math.cos(Math.toRadians(x1))
						* Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1) - Math.toRadians(y2))));
		return distance;
	}

	public static boolean isTriangle(double side1, double side2, double side3) {

		return ((side1 + side2 > side3) && (side1 + side3 > side2) && (side3 + side2 > side1));

	}

	public static double getTriangleArea(double side1, double side2, double side3) {

		double s = (side1 + side2 + side3) / 2.0;
		return Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
	}
}
