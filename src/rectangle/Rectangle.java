package rectangle;

public class Rectangle {

	private int c1, c2, c3, c4;

	public Rectangle(int a, int b, int c, int d) {
		c1 = a;
		c2 = b;
		c3 = c;
		c4 = d;
	}
	
	public RectangleType getType() {
		if (c1 == c2 && c1 == c3 && c1 == c4)
			return RectangleType.Carre;
		else if (c1 == c3 && c2 == c4)
			return RectangleType.Rectangle;
		else
			return RectangleType.Quadrilatere;
	}

}
