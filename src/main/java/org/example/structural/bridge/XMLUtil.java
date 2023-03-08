package org.example.structural.bridge;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.InputStream;
import java.net.URL;

public class XMLUtil {
    public static Object getBean(String name) {
        try {
            //创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            URL url=XMLUtil.class.getResource("config.xml");
            InputStream inputStream=url.openStream();
            doc = builder.parse(inputStream);


            //获取包含类名的文本节点
            NodeList nl = doc.getElementsByTagName("className");
            Node classNode;
            if (name.equals("image")){
                classNode=nl.item(0).getFirstChild();
            }else if (name.equals("os")){
                classNode=nl.item(1).getFirstChild();
            }else {
                classNode=null;
            }
            String cName=classNode.getNodeValue();
            System.out.println(cName);

            //通过类名生成实例对象并将其返回
            Class c=XMLUtil.class.forName(cName);
            Object obj=c.newInstance();
            return obj;
        }
        catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
