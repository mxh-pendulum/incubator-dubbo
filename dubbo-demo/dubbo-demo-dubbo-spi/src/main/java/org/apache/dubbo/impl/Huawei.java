package org.apache.dubbo.impl;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.spi.MobilePhone;

public class Huawei implements MobilePhone {

    @Override
    public void call(URL url) {
        System.out.println("Huawei...");
    }
}
