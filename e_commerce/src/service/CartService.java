package service;

import java.util.List;
import entity.Cart;
import model.CartModel;

public interface CartService 
{

	int increaseOtyAndPriceInCartWhenProductIsAddedInCart(String token, Cart cart, int cartId);

	int addToCart(String token, Cart cart);

	List<CartModel> getCartDetails(String token);

}