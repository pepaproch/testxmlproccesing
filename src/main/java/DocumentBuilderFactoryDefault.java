import javax.xml.parsers.DocumentBuilderFactory;

public class DocumentBuilderFactoryDefault {


    public void testImplemantuion(String implemantion)  {
        DocumentBuilderFactory factory = (implemantion==null) ?  DocumentBuilderFactory.newInstance() : DocumentBuilderFactory.newInstance(implemantion ,getClass().getClassLoader());
        Reporter.printInfo("Default Runtime" , factory.getClass());

    }
}
