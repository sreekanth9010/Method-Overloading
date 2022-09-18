package methodOverloading;


class Point
{
	private double xCoordinate;
	private double yCoordinate;
	
	public Point(double xCoordiante, double ycoordinate) {
		super();
		this.xCoordinate = xCoordiante;
		this.yCoordinate = ycoordinate;
	}

	public double getxCoordinate() {
		return xCoordinate;
	}

	public void setxCoordinate(double xCoordiante) {
		this.xCoordinate = xCoordiante;
	}

	public double getyCoordinate() {
		return yCoordinate;
	}

	public void setyCoordinate(double ycoordinate) {
		this.yCoordinate = ycoordinate;
	}
	
	public double calculateDistance()
	{
		double distance=Math.sqrt(xCoordinate*xCoordinate + yCoordinate*yCoordinate);
		distance=Math.round( distance*100.0)/100.0;
		return distance;
	}
	public double calculateDistance(Point p1 , Point p2)
	{
		double distance=Math.sqrt(Math.pow((p1.xCoordinate-p2.xCoordinate), 2) + Math.pow((p1.yCoordinate-p2.yCoordinate), 2));
	distance=Math.round( distance*100.0)/100.0;
	return distance;
	}
	
	
	
}
public class PointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point point1 = new Point(3.5,1.5);
		System.out.println(point1.calculateDistance());
		Point point2 = new Point(6,4);
		System.out.println(point2.calculateDistance());
		
		System.out.println(point1.calculateDistance(point1, point2));
		
	}

}
