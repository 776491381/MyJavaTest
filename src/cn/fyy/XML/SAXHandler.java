package cn.fyy.XML;

import jdk.internal.org.xml.sax.Attributes;
import jdk.internal.org.xml.sax.SAXException;
import jdk.internal.org.xml.sax.helpers.DefaultHandler;

/**
 * Created by FYY on 7/22/16.
 */
public class SAXHandler extends DefaultHandler {

    @Override
    public void startDocument() throws SAXException {
        super.startDocument();
        System.out.println("解析开始");
    }
   //标识解析开始
    @Override
    public void endDocument() throws SAXException {
        super.endDocument();
        System.out.println("解析结束");
    }
   //用来标识解析结束
    @Override
    public void endElement(String s, String s1, String s2) throws SAXException {
        super.endElement(s, s1, s2);
    }
    //遍历开始标签
    @Override
    public void startElement(String s, String s1, String s2, Attributes attributes) throws SAXException {
        super.startElement(s, s1, s2, attributes);
    }
    //遍历结束标签
}
