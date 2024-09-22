package com.nwhite.dreamshops.service.order;

import com.nwhite.dreamshops.dto.OrderDto;
import com.nwhite.dreamshops.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);
    List<OrderDto> getUserOrders(Long userId);
}
