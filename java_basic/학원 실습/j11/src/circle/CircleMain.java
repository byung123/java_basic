package circle;

public class CircleMain {
	public static void main(String[] args) {
		Circle pizza; //인스턴스 변수 pizza 선언
		pizza = new Circle();
		pizza.radius = 10;
		pizza.name = "불고기피자";
		
		System.out.println(pizza.name + "의 면적은 " + pizza.getArea());
		
		Circle donut = new Circle(); //도넛 객체 생성
		donut.radius = 2;
		donut.name = "플레인베이글";
		double area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);
	}
}
