package E015_PointNomHeritage;

public class Point {
	private int x, y;

	public void setPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void deplace(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}

	public void affCoord() {
		System.out.println("Coordonnées: " + x + ", " + y);
	}

}
