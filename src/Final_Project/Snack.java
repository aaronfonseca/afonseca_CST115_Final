/*******************************************************
*                      Snack	                       *
*------------------------------------------------------*
* -calories: int                                       *
*------------------------------------------------------*   
* +Snack()								               *     
* +Snack(productName: String, price:double,            *
* quantity:int, dispenseLocation: String,              *
* productId: int, calories: int)                       *
* +Snack(Snack: snack)                                 *
* +setCalories(calories: int): void                    *
* +getCalories(): int                                  *
* +toString(): toString 							   *
********************************************************/


package Final_Project;

public abstract class Snack extends Product {
	
	protected int calories;
	
	//no-arg constructor
	public Snack() {
		
	}
	
	public Snack(String productName, double price, int quantity, String dispenseLocation, int productId, int calories) {
		super(productName, price, quantity, dispenseLocation, productId);
		this.calories = calories;
	}
	
	//replicate an existing Snack object
	public Snack(Snack snack) {
		super(snack.getName(), snack.getPrice(), snack.getQuantity(), snack.getDispenseLocation(), snack.getProductId());
		this.calories = snack.getCalories();
	}
	
	// Setters
	public void setCalories(int calories) {
		this.calories = calories;
	}
	
	// Getters
	public int getCalories() {
		return this.calories;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Calories: " + calories;
	}

}