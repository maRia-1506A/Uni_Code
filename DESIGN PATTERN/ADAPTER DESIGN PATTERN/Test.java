// Target interface -> JSONData
// Adapter -> XMLtoJSONAdapter
// Adaptee -> OldXMLModule
// Client -> DIUSmartResultSystem

interface JSONData {
    public void showData();
}

class OldXMLModule {
    public void sendXMLdata(){
        System.out.println("Data sent in XML format");
    }
}

class XMLtoJSONAdapter implements JSONData{
    public OldXMLModule xml;

    public XMLtoJSONAdapter(OldXMLModule xml){
        this.xml= xml;
    }

    public void showData(){
        System.out.println("Data is showed in JSON format");
    }
}

class DIUSmartResultSystem {
    public void display(JSONData data){
        data.showData();
    }

}
public class Test {
    public static void main(String[] args) {
        JSONData data= new XMLtoJSONAdapter(new OldXMLModule());
        DIUSmartResultSystem diu= new DIUSmartResultSystem();
        diu.display(data);
    }    
}
