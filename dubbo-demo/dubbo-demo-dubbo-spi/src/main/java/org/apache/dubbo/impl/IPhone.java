package org.apache.dubbo.impl;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Activate;
import org.apache.dubbo.spi.MobilePhone;

@Activate()
public class IPhone implements MobilePhone {

    @Override
    public void call(URL url) {
        System.out.println("Iphone...");
    }
}
