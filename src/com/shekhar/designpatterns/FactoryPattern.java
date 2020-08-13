package com.shekhar.designpatterns;

public class FactoryPattern implements Cloneable{

	public FactoryPattern clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	public interface Food{
		public String getType();
	}
	
	class Cake implements Food {
		
		String type;
		
		public Cake(String type) {
			this.type = type;
		}
		
		public String getType() {
			return type;
		}
	}
	
	class Pizza implements Food {
		
		String type;
		
		public Pizza(String type) {
			this.type = type;
		}
		
		public String getType() {
			return type;
		}
	}
	
	class FoodFactory {
		
		public Food getFood(String type) {
			switch(type) {
				case "Cake":
					return new Cake(type);
				case "Pizza":
					return new Pizza(type);
				default: break;	
			}
			return null;
		}
	}
	
	public static void main(String[] args) {
		
		
		
		
	}

}
