import javax.xml.parsers.DocumentBuilderFactory;

public class TestRunner {

    public  static  void main(String[] args) {

        new TestRunner().runIt();
    }


    public void  runIt() {
        DocumentBuilderFactoryDefault documentBuilderFactoryDefault = new DocumentBuilderFactoryDefault();
        documentBuilderFactoryDefault.testImplemantuion(null);
    }
}
