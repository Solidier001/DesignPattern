package org.example.structural.Facade.Facades;

import org.example.structural.Facade.AbstractEncryptFacade;
import org.example.structural.Facade.Tools.CipherMachine;
import org.example.structural.Facade.Tools.FileReader;
import org.example.structural.Facade.Tools.FileWriter;

public class EncryptFacade extends AbstractEncryptFacade {

    private FileReader fileReader=new FileReader();

    private FileWriter fileWriter=new FileWriter();

    private CipherMachine cipherMachine=new CipherMachine();

    @Override
    public void FileEncrypt(String fileNameSrc, String fileNameDes) {
        String txt=fileReader.read(fileNameSrc);
        fileWriter.write(cipherMachine.Encrypt(txt),fileNameDes);
        System.out.println("src:"+fileNameDes+",des:"+fileNameDes);
    }
}
