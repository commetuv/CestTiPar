package point;

public class Point {
	//attribut x1correspondant � l'abscisse
	private int x1;
	//attribut y1 correspondant � l'ordonn�e
	private int y1;

	//constructeur vide de la classe Point
	public Point() {

	}

	public Point(int x, int y) {
		x1 = x;
		y1 = y;
	}

	public double distance() {
		// calcule de la distance entre l'origine du rep�re et un point (x,y) donn�
		return Math.sqrt(Math.pow(this.x1, 2) + (Math.pow(this.y1, 2)));
	}
	
	public double distance(Point p ) {
		// calcule de la distance entre l'origine du rep�re et un point (x,y) donn�
		return Math.sqrt(Math.pow(this.x1-p.x1 , 2) + (Math.pow(this.y1-p.y1, 2)));
	}

	public int getX() {
		return x1;
	}

	public void setX(int x) {
		this.x1 = x;
	}

	public int getY() {
		return y1;
	}

	public void setY(int y) {
		this.y1 = y;
	}

	public String toString() {
		//renvoie une chaine de caract�res avec la distance demand�
		return "la distance est : (" + x1 + "," + y1+ ") est : " + this.distance()+ " bananes";
	}
}
