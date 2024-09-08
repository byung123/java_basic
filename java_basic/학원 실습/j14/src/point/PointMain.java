package point;

public class PointMain {
	public static void main(String[] args) {
		
		//부모객체 생성
		Point p = new Point();
		p.setX(10);
		p.setY(20);
		p.showpoint();
		
		//자식 개체 생성
		ColorPoint cp = new ColorPoint();
		
		cp.setX(10);
		cp.setY(20);
		cp.setColor("검은색");
		cp.showColorPoint();
	}
}
