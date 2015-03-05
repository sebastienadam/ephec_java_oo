/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E014_PointHeritage;

/**
 *
 * @author Sébastien
 */
public class Point {
	private int x, y;

	public void initialize(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void deplace(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}
