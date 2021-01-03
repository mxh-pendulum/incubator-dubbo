package org.apache.dubbo.impl;

import org.apache.dubbo.spi.MobilePhone;

public class Huawei implements MobilePhone {

    @Override
    public void call() {
        System.out.println("Huawei...");
    }
}
