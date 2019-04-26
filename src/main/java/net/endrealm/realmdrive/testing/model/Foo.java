package net.endrealm.realmdrive.testing.model;

import net.endrealm.realmdrive.annotations.SaveVar;
import lombok.Data;

@Data
public class Foo {

    @SaveVar
    private char value0;
    @SaveVar
    private String value1;
    @SaveVar
    private int value2;
    @SaveVar
    private long value3;
    @SaveVar
    private float value4;
    @SaveVar
    private double value5;
    @SaveVar
    private Bar bar;

    public Foo() {
    }

    public Foo(char value0, String value1, int value2, long value3, float value4, double value5, Bar bar) {
        this.value0 = value0;
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
        this.value4 = value4;
        this.value5 = value5;
        this.bar = bar;
    }
}
