package org.apache.dubbo;

import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.spi.MobilePhone;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        //MobilePhone mobilePhone类型的扩展类加载器
        ExtensionLoader<MobilePhone> mobilePhoneExtensionLoader = ExtensionLoader.getExtensionLoader(MobilePhone.class);
        //实例化指定实现
        MobilePhone extension = mobilePhoneExtensionLoader.getExtension("true");
//        extension.call();
    }
}
