
package LabAct;

public class TextEditor {
    
    String text;
    public String prevText [] = new String[10];
    public int history = 0;
    
    public TextEditor(String InitialText) {
        text = InitialText;
        prevText[history] = text;
        history++;
    }

    public String getText() {
        return text;
    }

    public void setText(String newText) {
        prevText[history] = text;
        history++;
        text = newText;
    }
    
    public void append(String newText) { 
        prevText[history] = text;
        history++;
        text += newText;
    }
    
    public void delete(int n){ 
        prevText[history] = text;
        history++;
        
        if (n >= text.length()) {
            text = "";
        } else {
            text = text.substring(0, text.length() - n);
        }
    }
}

    
   
