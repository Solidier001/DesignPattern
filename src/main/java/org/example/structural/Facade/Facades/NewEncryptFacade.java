package org.example.structural.Facade.Facades;

import org.example.structural.Facade.AbstractEncryptFacade;
import org.example.structural.Facade.Tools.CipherMachine;
import org.example.structural.Facade.Tools.FileReader;
import org.example.structural.Facade.Tools.FileWriter;
import org.example.structural.Facade.Tools.NewCipherMachine;

public class NewEncryptFacade extends AbstractEncryptFacade {

    private FileReader fileReader=new FileReader();

    private FileWriter fileWriter=new FileWriter();

    private NewCipherMachine cipherMachine=new NewCipherMachine();

    @Override
    public void FileEncrypt(String fileNameSrc, String fileNameDes) {
        String txt=fileReader.read(fileNameSrc);
        fileWriter.write(cipherMachine.Encrypt(txt),fileNameDes);
        System.out.println("src:"+fileNameDes+",des:"+fileNameDes);
    }
}
