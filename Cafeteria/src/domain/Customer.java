package domain;

public class Customer {
/*
 * 책임, 역할, 협력
 * 
 */
	public void order(String menuName, Menu menu, Barista barista) {
		MenuItem menuItem = menu.choose(menuName);
		Coffee coffee = barista.makeCoffee(menuItem);
	}
}
