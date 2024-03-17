
package LabAct;


public class PrintTextEditor extends TextEditor {
    
    public PrintTextEditor(String InitialText){
        super (InitialText);
    }
    
    public void print (){
        System.out.println(getText());
    }
    
}
