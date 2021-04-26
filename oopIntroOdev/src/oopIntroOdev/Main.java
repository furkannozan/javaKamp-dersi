package oopIntroOdev;

public class Main {

	public static void main(String[] args) {

		Clothes clothes1 = new Clothes(1, "Denim", "Gömlek", 60, "Mavi");

		Clothes clothes2 = new Clothes();
		clothes2.size = 2;
		clothes2.brand = "Bershka";
		clothes2.category = "T-shirt";
		clothes2.price = 35;
		clothes2.color = "Kýrmýzý";

		Clothes[] clothess = { clothes1, clothes2 };

//		System.out.println(clothess.length);

		for (Clothes clothes : clothess) {
			System.out.println(clothes.category + " - " + clothes.brand + "- size :" + clothes.size + " - "
					+ clothes.color + " - " + clothes.price + "TL");
		}

		ClothesManager clothesManager = new ClothesManager();
		clothesManager.buy(clothes1);
		clothesManager.buy(clothes2);
		
		GivingBack givingBack1 = new GivingBack("Ürünlerinizi seçin");
		GivingBack givingBack2 = new GivingBack("Ürünlerinizi seçin");
		
		GivingBack[] giving = {givingBack1,givingBack2};
		
		for (GivingBack givingBacks : giving) {
			System.out.println(givingBacks.returnn);
		}
 		GivingBackManager givingBackManager = new GivingBackManager();
 		givingBackManager.back(givingBack1);
 		givingBackManager.back(givingBack2);
		
			
		
	}

}
