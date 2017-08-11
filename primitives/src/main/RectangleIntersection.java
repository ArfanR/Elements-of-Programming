public class RectangleIntersection {

    /*
    4.11
    */

	public static class Rectangle {
		int x, y, width, height;
		
		public Rectangle(int x, int y, int width, int height) {
			this.x = x;
			this.y = y;
			this.width = width;
			this.height = height;
		}
	}
	
    public static Rectangle intersectRectangle(Rectangle r1, Rectangle r2) {

        return new Rectangle(1,1,1, 1);
    }

}