import Adaptee.EnglishAdaptee;
import Adaptee.JapaneseAdaptee;
import Adaptee.LanguageAdaptee;
import Adapter.JapaneseTranslatorAdapter;
import Target.VietnameseTarget;

public class Main {
    public static void main(String[] args) {
        //VietnameseTarget client = new JapaneseTranslatorAdapter();
        VietnameseTarget client = new JapaneseTranslatorAdapter(new JapaneseAdaptee());
        
        client.send("Xin chào");

    }
}
