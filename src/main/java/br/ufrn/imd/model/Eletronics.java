package br.ufrn.imd.model;

import java.math.BigDecimal;

public class Eletronics extends Product {

    protected Voltage voltage;

    public Eletronics(String sku, String name, BigDecimal price, String description, Category category, Voltage voltage) {
        super(sku, name, price, description, category);
        this.voltage = voltage;
    }

    public Voltage getVoltage() {
        return voltage;
    }

    public void setVoltage(Voltage voltage) {
        this.voltage = voltage;
    }

}
