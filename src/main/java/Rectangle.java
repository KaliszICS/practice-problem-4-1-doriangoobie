class Rectangle {
	private double length;
	private double width;

	public Rectangle (double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

	public double perimeter() {
		if (length <= 0 || width <= 0) {
			return 0;
		}
		return (2*width) + (2*length);
	}

	public double area() {
		return width*length;
	}
	}
