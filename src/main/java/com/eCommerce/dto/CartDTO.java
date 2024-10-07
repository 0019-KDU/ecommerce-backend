package com.eCommerce.dto;

import lombok.Data;

import java.util.List;

@Data
public class CartDTO {
    private Long Id;
    private Long userId;
    private List<CartItemDTO>items;
}
