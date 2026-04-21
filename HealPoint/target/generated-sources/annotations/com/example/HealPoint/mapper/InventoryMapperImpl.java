package com.example.HealPoint.mapper;

import com.example.HealPoint.entity.Inventory;
import com.example.HealPoint.enums.ItemCategory;
import com.example.HealPoint.model.InventoryModel;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-04-21T12:39:50-0400",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.46.0.v20260407-0427, environment: Java 21.0.10 (Eclipse Adoptium)"
)
@Component
public class InventoryMapperImpl implements InventoryMapper {

    @Override
    public InventoryModel inventoryToInventoryModel(Inventory inventory) {
        if ( inventory == null ) {
            return null;
        }

        InventoryModel inventoryModel = new InventoryModel();

        inventoryModel.setAvailable( inventory.isAvailable() );
        if ( inventory.getItemCategory() != null ) {
            inventoryModel.setItemCategory( inventory.getItemCategory().name() );
        }
        inventoryModel.setItemDescription( inventory.getItemDescription() );
        inventoryModel.setItemPrice( inventory.getItemPrice() );
        inventoryModel.setItemQuantity( inventory.getItemQuantity() );
        inventoryModel.setItemUnits( inventory.getItemUnits() );
        inventoryModel.setProductName( inventory.getProductName() );

        return inventoryModel;
    }

    @Override
    public Inventory inventoryModelToInventory(InventoryModel inventoryModel) {
        if ( inventoryModel == null ) {
            return null;
        }

        Inventory inventory = new Inventory();

        inventory.setAvailable( inventoryModel.isAvailable() );
        if ( inventoryModel.getItemCategory() != null ) {
            inventory.setItemCategory( Enum.valueOf( ItemCategory.class, inventoryModel.getItemCategory() ) );
        }
        inventory.setItemDescription( inventoryModel.getItemDescription() );
        inventory.setItemPrice( inventoryModel.getItemPrice() );
        inventory.setItemQuantity( inventoryModel.getItemQuantity() );
        inventory.setItemUnits( inventoryModel.getItemUnits() );
        inventory.setProductName( inventoryModel.getProductName() );

        return inventory;
    }

    @Override
    public List<InventoryModel> inventoryListToInventoryModelList(List<Inventory> inventoryList) {
        if ( inventoryList == null ) {
            return null;
        }

        List<InventoryModel> list = new ArrayList<InventoryModel>( inventoryList.size() );
        for ( Inventory inventory : inventoryList ) {
            list.add( inventoryToInventoryModel( inventory ) );
        }

        return list;
    }

    @Override
    public Inventory updateInventoryFromInventoryModel(InventoryModel inventoryModel, Inventory inventory) {
        if ( inventoryModel == null ) {
            return inventory;
        }

        inventory.setAvailable( inventoryModel.isAvailable() );
        if ( inventoryModel.getItemCategory() != null ) {
            inventory.setItemCategory( Enum.valueOf( ItemCategory.class, inventoryModel.getItemCategory() ) );
        }
        else {
            inventory.setItemCategory( null );
        }
        inventory.setItemDescription( inventoryModel.getItemDescription() );
        inventory.setItemPrice( inventoryModel.getItemPrice() );
        inventory.setItemQuantity( inventoryModel.getItemQuantity() );
        inventory.setItemUnits( inventoryModel.getItemUnits() );
        inventory.setProductName( inventoryModel.getProductName() );

        return inventory;
    }
}
