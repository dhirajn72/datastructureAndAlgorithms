package session2;

import java.io.*;
import java.util.Enumeration;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 * @author Dhiraj
 * @date 03/09/19
 */
public class PropsTest {
    public static void main(String[] args) throws IOException {
        FileReader reader=new FileReader("log.properties");
        Properties props=new Properties();
        props.load(reader);

        Enumeration<Object> e=props.elements();
        while (e.hasMoreElements())
            System.out.println(e.nextElement());



    }
}
