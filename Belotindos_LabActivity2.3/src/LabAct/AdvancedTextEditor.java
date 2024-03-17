
package LabAct;

public class AdvancedTextEditor extends TextEditor {
    public AdvancedTextEditor (String text){
        super(text);
    }
    
    public void undo(){
        history--;
        
        setText(prevText[history]);
    }
    
}
