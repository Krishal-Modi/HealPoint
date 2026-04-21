package com.example.HealPoint.mapper;

import com.example.HealPoint.entity.Cart;
import com.example.HealPoint.entity.Inventory;
import com.example.HealPoint.enums.ItemCategory;
import com.example.HealPoint.model.CartModel;
import com.example.HealPoint.model.ItemListModel;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-04-21T12:39:50-0400",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.46.0.v20260407-0427, environment: Java 21.0.10 (Eclipse Adoptium)"
)
@Component
public class CartMapperImpl implements CartMapper {

    @Override
    public CartModel cartToCartModel(Cart cart) {
        if ( cart == null ) {
            return null;
        }

        CartModel cartModel = new CartModel();

        return cartModel;
    }

    @Override
    public Cart cartModelToCart(CartModel cartModel) {
        if ( cartModel == null ) {
            return null;
        }

        Cart cart = new Cart();

        return cart;
    }

    @Override
    public ItemListModel cartToItemListModel(Cart cart) {
        if ( cart == null ) {
            return null;
        }

        ItemListModel itemListModel = new ItemListModel();

        itemListModel.setProductName( cartInventoryProductName( cart ) );
        ItemCategory itemCategory = cartInventoryItemCategory( cart );
        if ( itemCategory != null ) {
            itemListModel.setItemCategory( itemCategory.name() );
        }

        itemListModel.setItemQuantity( String.valueOf(cart.getQuantity()) );
        itemListModel.setItemPrice( String.valueOf(cart.getInventory().getItemPrice()) );

        return itemListModel;
    }

    private String cartInventoryProductName(Cart cart) {
        if ( cart == null ) {
            return null;
        }
        Inventory inventory = cart.getInventory();
        if ( inventory == null ) {
            return null;
        }
        String productName = inventory.getProductName();
        if ( productName == null ) {
            return null;
        }
        return productName;
    }

    private ItemCategory cartInventoryItemCategory(Cart cart) {
        if ( cart == null ) {
            return null;
        }
        Inventory inventory = cart.getInventory();
        if ( inventory == null ) {
            return null;
        }
        ItemCategory itemCategory = inventory.getItemCategory();
        if ( itemCategory == null ) {
            return null;
        }
        return itemCategory;
    }
}
