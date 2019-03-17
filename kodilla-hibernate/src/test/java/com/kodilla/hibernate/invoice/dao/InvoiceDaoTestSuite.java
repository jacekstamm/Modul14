package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private ProductDao productDao;
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product iPhone = new Product("iPhone");
        Product computer = new Product("computer");
        Product printer = new Product("printer");

        productDao.save(iPhone);
        int iPhoneId = iPhone.getId();
        productDao.save(computer);
        int computerId = computer.getId();
        productDao.save(printer);
        int printerId = printer.getId();

        Item item = new Item(new BigDecimal(3799), 5, new BigDecimal(10));
        Item item2 = new Item(new BigDecimal(5876), 2, new BigDecimal(100));
        Item item3 = new Item(new BigDecimal(269), 10, new BigDecimal(69));
        Item item4 = new Item(new BigDecimal(783), 89, new BigDecimal(826));
        Item item5 = new Item(new BigDecimal(876), 90, new BigDecimal(999));

        iPhone.getItems().add(item);
        computer.getItems().add(item2);
        printer.getItems().add(item3);
        computer.getItems().add(item4);
        printer.getItems().add(item5);

        item.setProduct(iPhone);
        item2.setProduct(computer);
        item3.setProduct(printer);
        item4.setProduct(computer);
        item5.setProduct(printer);

        Invoice invoice = new Invoice("Faktura 2/2019");
        invoice.getItems().add(item);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        invoice.getItems().add(item4);
        invoice.getItems().add(item5);

        item.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);
        item4.setInvoice(invoice);
        item5.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        //Then
        Assert.assertNotEquals(0, invoiceId);

        //CleanUp
        productDao.deleteById(iPhoneId);
        productDao.deleteById(computerId);
        productDao.deleteById(printerId);
        invoiceDao.deleteById(invoiceId);
    }
}
