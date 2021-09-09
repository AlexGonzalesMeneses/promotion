/**
 * @author: Alex Gonzales
 */

package com.customers.promotion.models;

import com.customers.promotion.dto.PromotionDto;

import java.math.BigDecimal;

public class Promotion extends ModelBase<PromotionDto>{
    private String description;
    private BigDecimal discountValue;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
