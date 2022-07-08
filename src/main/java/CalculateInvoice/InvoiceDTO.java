package CalculateInvoice;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class InvoiceDTO {


    private String invoiceNumber;
    private BigDecimal tax;
    private BigDecimal price;
    private BigDecimal total;
    private BigDecimal qty;
    private String company;

}
