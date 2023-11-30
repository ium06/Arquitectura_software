package org.sisoftware.service;

import org.sisoftware.entity.Order;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OrderPersistenceService implements PersistenceService<Order>{

    private static final Map<Long, Order> Order = new HashMap<>();
    @Override
    public void save(Order entity) {
        synchronized (Order) {
            Order.put(entity.getId(), entity);
        }
    }

    @Override
    public void delete(Order entity) {
        synchronized (Order) {
            Order.remove(entity.getId());
        }
    }

    @Override
    public Order findById(Long id) {
        synchronized (Order) {
            return Order.get(id);
        }
    }

}
