package javatest2;

public class javatest2 {

	public static void main(String[] args) {
		Circle pizza; 
		pizza = new Circle(); 					// Circle ��ü ����(�޸��Ҵ�)
		pizza.radius = 10; 						// ������ �������� 10���� ����
		pizza.name = "�ڹ�����"; 			// ������ �̸� ����
		double area = pizza.getArea(); 		// ������ ���� �˾Ƴ���
		System.out.println(pizza.name + "�� ������ " + area);

		Circle donut = new Circle(); 		// Circle ��ü ����
		donut.radius = 2; 							// ������ �������� 2�� ����
		donut.name = "�ڹٵ���"; 			// ������ �̸� ����

		area = donut.getArea(); 				// ������ ���� �˾Ƴ���
		System.out.println(donut.name + "�� ������ " + area);
	}
}

class Circle {
	int radius; 							// ���� �������� �����ϴ� ��� ����
	String name;// ���� �̸��� �����ϴ� ��� ����
	public double getArea() { 	// ��� �޼ҵ�
		return 3.14*radius*radius;
	}
}


