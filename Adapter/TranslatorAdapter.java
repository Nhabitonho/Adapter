package Adapter;

import Adaptee.LanguageAdaptee;
import Target.VietnameseTarget;

public class TranslatorAdapter implements VietnameseTarget {

    private LanguageAdaptee adaptee;

    public TranslatorAdapter (LanguageAdaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void send(String words) {
        this.adaptee.receive(words);
    }
    
}
