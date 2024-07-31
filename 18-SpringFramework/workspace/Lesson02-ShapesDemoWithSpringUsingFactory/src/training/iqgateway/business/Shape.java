package training.iqgateway.business;

public abstract class Shape {
	public abstract double getArea();
	public void printInfo() {
		System.out.printf("%s with Area of %.2f%n", getClass().getSimpleName(), getArea());

	}
}
