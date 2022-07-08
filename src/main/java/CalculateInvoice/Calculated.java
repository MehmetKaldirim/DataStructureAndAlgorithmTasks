package CalculateInvoice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Calculated {
    public static void main(String[] args) {
        List<InvoiceDTO> list = new ArrayList<>();
        InvoiceDTO first = InvoiceDTO.builder()
                .company("a")
                .invoiceNumber("a1")
                .qty(BigDecimal.TEN)
                .tax(BigDecimal.valueOf(10))
                .price(BigDecimal.valueOf(800))
                .build();

        InvoiceDTO second = InvoiceDTO.builder()
                .company("a")
                .invoiceNumber("a2")
                .qty(BigDecimal.TEN)
                .tax(BigDecimal.valueOf(10))
                .price(BigDecimal.valueOf(800))
                .build();

        InvoiceDTO third = InvoiceDTO.builder()
                .company("a")
                .invoiceNumber("a3")
                .qty(BigDecimal.TEN)
                .tax(BigDecimal.valueOf(10))
                .price(BigDecimal.valueOf(800))
                .build();
        list.add(first);
        list.add(second);
        list.add(third);

        list.forEach(p->p.setPrice(p.getPrice().multiply(p.getQty())));;
        list.forEach(p->p.setTax(p.getTax().multiply(p.getPrice().divide(BigDecimal.valueOf(100)))));
        list.forEach(System.out::println);

    }
}