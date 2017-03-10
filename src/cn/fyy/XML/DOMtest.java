package cn.fyy.XML;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * dom方式解析xml
 * Created by FYY on 7/20/16.
 */
public class DOMtest {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
       DocumentBuilderFactory dbf =  DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document document =  db.parse("XMLfile/books.xml");
        NodeList booklist =  document.getElementsByTagName("book");//获取所有book节点的集合
       // System.out.println(booklist.getLength());//获取节点长度
        //遍历book节点
        for(int i = 0; i<booklist.getLength();i++){
            System.out.println("开始遍历第"+(i+1)+"本书");
           Node book =booklist.item(i);
            NamedNodeMap qqq =  book.getAttributes();//获取节点所有属性
            for(int j =0; j<qqq.getLength();j++){
               Node attr =  qqq.item(j);
                System.out.print("获取属性名 : "+attr.getNodeName()+"  ");
                System.out.println("属性值 : "+attr.getNodeValue());


            }
            NodeList childnode = book.getChildNodes();
            //遍历childnode子节点
            for(int k = 0;k<childnode.getLength();k++){
                Node childattr = childnode.item(k);
                if(childnode.item(k).getNodeType()==Node.ELEMENT_NODE){//只遍历标签内容,由于空格和回车会被认为是text型节点,需要过滤
                System.out.print(childattr.getNodeName()+"  :  ");
                //System.out.println(childattr.getFirstChild().getNodeValue());//由于element型的节点只认识标签内的东西,标签里的文字呗认定为子节点,所以内容需要通过子节点访问
                    System.out.println(childattr.getTextContent());//通过gettextcontent与上方法效果相同,且排除多子节点干扰,能获取子节点的子节点的内容
                }
            }
            System.out.println("结束遍历第"+(i+1)+"本书");
            System.out.println();


        }


    }
}
