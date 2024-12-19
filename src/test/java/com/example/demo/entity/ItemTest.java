package com.example.demo.entity;

import com.example.demo.entity.Item;
import com.example.demo.entity.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ItemTest {

    User owner = new User("USER", "owner@example.com", "Owner", "qwer1234");
    User manager = new User("USER", "manager@example.com", "Manager", "qwer1234");

    Item item = new Item("Item1", "Item1 description", manager, owner);

    @Test
    void testGetId() {
        assertEquals(1L, item.getId());
    }

    @Test
    void testGetName() {
        assertEquals("Item1", item.getName());
    }

    @Test
    void testGetDescription() {
        assertEquals("Item1 description", item.getDescription());
    }

    @Test
    void testGetOwner() {
        assertEquals(owner, item.getOwner());
    }

    @Test
    void testGetManager() {
        assertEquals(manager, item.getManager());
    }

    @Test
    void testGetStatus() {
        assertNotNull(item.getStatus());
        assertEquals("PENDING", item.getStatus());
    }
}
