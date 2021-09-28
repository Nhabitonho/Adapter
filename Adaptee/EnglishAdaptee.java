

package Adaptee;
public class EnglishAdaptee implements LanguageAdaptee{

    private String words;
    @Override
    public void receive(String words) {
        this.words = words;
        System.out.println("Đang dùng Adapter để dịch từ \""+words+"\" sang tiếng Anh ...");
        System.out.println(this.translate());
    }

    @Override
    public String translate() {
        
        return "Hello";
    }
    
}
