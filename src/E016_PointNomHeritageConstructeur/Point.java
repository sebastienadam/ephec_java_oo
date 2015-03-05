package E016_PointNomHeritageConstructeur;

public class Point {
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void affCoord() {
		System.out.println("Coordonnées: " + x + ", " + y);
	}
}
