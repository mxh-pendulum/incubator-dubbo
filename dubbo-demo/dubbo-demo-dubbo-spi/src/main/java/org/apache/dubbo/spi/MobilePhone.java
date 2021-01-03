package org.apache.dubbo.spi;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.SPI;

@SPI
public interface MobilePhone {
    void call(URL url);
}
