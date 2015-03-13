package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;

public class Discount {
    private BigDecimal amount;
    private String discountCause;
    private String currency;

    public Discount(BigDecimal amount, String discountCause, String currency) {
        this.amount = amount;
        this.discountCause = discountCause;
        this.currency = currency;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getDiscountCause() {
        return discountCause;
    }

    public String getCurrency() {
        return currency;
    }
}
