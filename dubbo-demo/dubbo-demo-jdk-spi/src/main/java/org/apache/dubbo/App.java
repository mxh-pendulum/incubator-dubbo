package org.apache.dubbo;

import org.apache.dubbo.spi.MobilePhone;

import java.util.ServiceLoader;

public class App {
    public static void main(String[] args) {
        ServiceLoader<MobilePhone> serviceLoader = ServiceLoader.load(MobilePhone.class);
        for (MobilePhone mobilePhone : serviceLoader) {
            mobilePhone.call();
        }
    }
}
