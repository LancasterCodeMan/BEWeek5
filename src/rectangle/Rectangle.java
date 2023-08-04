package rectangle;

public class Rectangle {
	private int length;
	private int width;
	private int area;
	
	public Rectangle(int width, int length ) {
		this.width = width;
		this.length = length;
		this.area = width * length;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
		area = width * length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
		area = width * length;
	}

	public int getArea() {
		return area;
	}

}
