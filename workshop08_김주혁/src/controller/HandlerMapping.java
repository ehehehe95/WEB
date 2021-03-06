package controller;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class HandlerMapping {
	
	private static HandlerMapping handler = new HandlerMapping();
	private HandlerMapping() {}
	public static HandlerMapping getInstance() {
		return handler;
	}	
	public Controller createController(String command) {
		Controller controller = null;
		if(command.equals("itemList.do")) {
			controller = new ItemListController();
			System.out.println("ItemListController...생성...");
		}else if (command.equals("itemDetail.do")) {
			controller = new ItemDetailController();
			System.out.println("ItemDetailController...생성...");
		}else if (command.equals("cart.do")) {
			controller = new CartController();
			System.out.println("CartController...생성...");
		}else if (command.equals("itemInfo.do")) {
			controller = new ItemInfoController();
			System.out.println("ItemInfoController...생성...");
		}else if (command.equals("product.do")) {
			controller = new ProductViewController();
			System.out.println("ProductViewController...생성...");
		}
		return controller;
	}
}
