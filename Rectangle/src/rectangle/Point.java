package rectangle;

public class Point {
	private int x, y;

	public int getX() {
		return x;
	}

	public void setX(int abs) {
		x = abs;
	}

	public int getY() {
		return y;
	}

	public void setY(int ord) {
		y = ord;
	}

	public Point(int abs, int ord) {
		x = abs;
		y = ord;
	}
	
	static public double sqr(double a) {
        return a*a;
    }

	double distancePoint(int abs, int abs2, int ord, int ord2) {
		double d;
		d = Math.sqrt(sqr(ord2 - ord) + sqr(abs2 - abs));
		return d;
	}

}
