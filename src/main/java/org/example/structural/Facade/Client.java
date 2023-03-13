package org.example.structural.Facade;

import org.example.structural.Facade.Facades.EncryptFacade;
import org.example.structural.Facade.Facades.NewEncryptFacade;

public class Client {
    public static void main(String[] args) {
        AbstractEncryptFacade facade= (AbstractEncryptFacade) XMLUtil.getBean();
        facade.FileEncrypt("aa","bb");
    }
}
