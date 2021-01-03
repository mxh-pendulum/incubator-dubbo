package org.apache.dubbo.impl;

import org.apache.dubbo.spi.MobilePhone;

public class IPhone implements MobilePhone {

    @Override
    public void call() {
        System.out.println("Iphone...");
    }
}
