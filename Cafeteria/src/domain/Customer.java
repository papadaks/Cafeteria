package domain;

public class Customer {
/*
 * å��, ����, ����
 * 
 */
	public void order(String menuName, Menu menu, Barista barista) {
		MenuItem menuItem = menu.choose(menuName);
		Coffee coffee = barista.makeCoffee(menuItem);
	}
}
