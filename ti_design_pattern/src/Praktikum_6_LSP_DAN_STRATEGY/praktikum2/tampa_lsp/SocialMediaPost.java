package Praktikum_6_LSP_DAN_STRATEGY.praktikum2.tampa_lsp;

public class SocialMediaPost {
    protected String content;

    public SocialMediaPost(String content) {
        this.content = content;
    }

    public void publish() {
        System.out.println("Publishing post: " + content);
    }

    public int calculateMaxCharacters() {
        return 1000; // Batas karakter
    }
}