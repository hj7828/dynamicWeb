package javatest2;

public class javatest2 {

	public static void main(String[] args) {
		Circle pizza; 
		pizza = new Circle(); 					// Circle 객체 생성(메모리할당)
		pizza.radius = 10; 						// 피자의 반지름을 10으로 설정
		pizza.name = "자바피자"; 			// 피자의 이름 설정
		double area = pizza.getArea(); 		// 피자의 면적 알아내기
		System.out.println(pizza.name + "의 면적은 " + area);

		Circle donut = new Circle(); 		// Circle 객체 생성
		donut.radius = 2; 							// 도넛의 반지름을 2로 설정
		donut.name = "자바도넛"; 			// 도넛의 이름 설정

		area = donut.getArea(); 				// 도넛의 면적 알아내기
		System.out.println(donut.name + "의 면적은 " + area);
		
		
		Circle ring = new Circle(); 		// Circle 객체 생성
		ring.radius = 2; 							// 도넛의 반지름을 2로 설정
		ring.name = "링"; 			// 도넛의 이름 설정

		area = ring.getArea(); 				// 도넛의 면적 알아내기
		System.out.println(ring.name + "의 면적은 " + area);
		//가나다라 마바사아 자차

	}
}

class Circle {
	int radius; 							// 원의 반지름을 저장하는 멤버 변수
	String name;// 원의 이름을 저장하는 멤버 변수
	public double getArea() { 	// 멤버 메소드
		return 3.14*radius*radius;
	}
}


