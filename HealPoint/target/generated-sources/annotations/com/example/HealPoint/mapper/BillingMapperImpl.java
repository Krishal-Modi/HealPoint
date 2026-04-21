package com.example.HealPoint.mapper;

import com.example.HealPoint.entity.Billing;
import com.example.HealPoint.entity.BillingItem;
import com.example.HealPoint.entity.Cart;
import com.example.HealPoint.entity.Inventory;
import com.example.HealPoint.model.BillingItemsModel;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-04-21T12:39:50-0400",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.46.0.v20260407-0427, environment: Java 21.0.10 (Eclipse Adoptium)"
)
@Component
public class BillingMapperImpl implements BillingMapper {

    @Override
    public BillingItemsModel billingItemtoBillingItemsModel(BillingItem billingItem) {
        if ( billingItem == null ) {
            return null;
        }

        BillingItemsModel billingItemsModel = new BillingItemsModel();

        billingItemsModel.setProductName( billingItemInventoryProductName( billingItem ) );
        billingItemsModel.setProductQuantity( billingItem.getQuantity() );
        billingItemsModel.setTotalProductPrice( billingItemInventoryItemPrice( billingItem ) );

        return billingItemsModel;
    }

    @Override
    public BillingItem updateToBillingItem(Cart cart, Billing billing) {
        if ( cart == null && billing == null ) {
            return null;
        }

        BillingItem billingItem = new BillingItem();

        if ( cart != null ) {
            billingItem.setInventory( cart.getInventory() );
            billingItem.setProductName( cartInventoryProductName( cart ) );
            billingItem.setPriceAtPurchase( cartInventoryItemPrice( cart ) );
            billingItem.setQuantity( cart.getQuantity() );
        }
        billingItem.setBilling( billing );

        return billingItem;
    }

    @Override
    public BillingItemsModel cartToBillingItemsModel(Cart cart) {
        if ( cart == null ) {
            return null;
        }

        BillingItemsModel billingItemsModel = new BillingItemsModel();

        billingItemsModel.setProductName( cartInventoryProductName( cart ) );
        billingItemsModel.setProductQuantity( cart.getQuantity() );

        billingItemsModel.setTotalProductPrice( cart.getInventory().getItemPrice() * cart.getQuantity() );

        return billingItemsModel;
    }

    private String billingItemInventoryProductName(BillingItem billingItem) {
        if ( billingItem == null ) {
            return null;
        }
        Inventory inventory = billingItem.getInventory();
        if ( inventory == null ) {
            return null;
        }
        String productName = inventory.getProductName();
        if ( productName == null ) {
            return null;
        }
        return productName;
    }

    private double billingItemInventoryItemPrice(BillingItem billingItem) {
        if ( billingItem == null ) {
            return 0.0d;
        }
        Inventory inventory = billingItem.getInventory();
        if ( inventory == null ) {
            return 0.0d;
        }
        double itemPrice = inventory.getItemPrice();
        return itemPrice;
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

    private double cartInventoryItemPrice(Cart cart) {
        if ( cart == null ) {
            return 0.0d;
        }
        Inventory inventory = cart.getInventory();
        if ( inventory == null ) {
            return 0.0d;
        }
        double itemPrice = inventory.getItemPrice();
        return itemPrice;
    }
}
