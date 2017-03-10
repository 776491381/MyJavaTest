package cn.fyy.XML;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

/**
 * Created by FYY on 7/20/16.
 */
public class SAXtest {
    public static void main(String[] args) throws ParserConfigurationException, SAXException ,IOException{
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser paser = factory.newSAXParser();

        paser = factory.newSAXParser();
        SAXHandler dh = new SAXHandler();
       // paser.parse("XMLfile/books.xml",dh);

        //通过接口创建SAXPaser的对象

    }
}
