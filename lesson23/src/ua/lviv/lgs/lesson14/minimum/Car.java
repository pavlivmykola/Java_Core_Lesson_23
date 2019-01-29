package ua.lviv.lgs.lesson14.minimum;


public class Car implements Comparable<Car>{
	
	private String model;
	private int weight;
	
	
	public Car(String model, int weight) {
		super();
		this.model = model;
		this.weight = weight;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}


	@Override
	public String toString() {
		return "Car [model=" + model + ", weight=" + weight + "]";
	}


	@Override
	public int compareTo(Car o) {
		return this.model.compareTo(o.getModel());
	}
}
