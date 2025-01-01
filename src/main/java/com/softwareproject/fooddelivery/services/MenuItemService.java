package com.softwareproject.fooddelivery.services;

import com.softwareproject.fooddelivery.entities.MenuItem;
import com.softwareproject.fooddelivery.repositories.MenuItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuItemService {
    private final MenuItemRepository menuItemRepository;

    public MenuItemService(MenuItemRepository menuItemRepository) {
        this.menuItemRepository = menuItemRepository;
    }

    // Get all menu items
    public List<MenuItem> getAllMenuItems() {
        return menuItemRepository.findAll();
    }

    // Get available menu items
    public List<MenuItem> getAvailableMenuItems() {
        return menuItemRepository.findByAvailabilityTrue();
    }

    // Create a new menu item
    public MenuItem createMenuItem(MenuItem menuItem) {
        return menuItemRepository.save(menuItem);
    }

    public MenuItem getMenuItemById(Long id) {
        return menuItemRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Menu item not found"));
    }

    // Update an existing menu item
    public MenuItem updateMenuItem(Long id, MenuItem updatedMenuItem) {
        MenuItem existingMenuItem = menuItemRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Menu item not found"));
        existingMenuItem.setName(updatedMenuItem.getName());
        existingMenuItem.setPrice(updatedMenuItem.getPrice());
        existingMenuItem.setAvailability(updatedMenuItem.getAvailability());
        return menuItemRepository.save(existingMenuItem);
    }

    // Delete a menu item
    public void deleteMenuItem(Long id) {
        menuItemRepository.deleteById(id);
    }
}
