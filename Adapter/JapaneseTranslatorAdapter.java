package Adapter;

import Adaptee.JapaneseAdaptee;
import Target.VietnameseTarget;

public class JapaneseTranslatorAdapter  implements VietnameseTarget{

    private JapaneseAdaptee adaptee;
 
    public JapaneseTranslatorAdapter(JapaneseAdaptee adaptee) {
        this.adaptee = adaptee;
    }
    // public JapaneseTranslatorAdapter() {
        
    // }
 
    @Override
    public void send(String vietnameseWords) {
        
        this.adaptee.receive(vietnameseWords);
    }
    
}
