package Praktikum_6_LSP_DAN_STRATEGY.praktikum2.tampa_lsp;

public class TwitterPost extends SocialMediaPost{
    public TwitterPost(String content) {
        super(content);
    }

    @Override
    public int calculateMaxCharacters() {
        return 280; // Batas karakter twitter
    }

    @Override
    public void publish() {
        if (content.length() > calculateMaxCharacters()) {
            throw new IllegalArgumentException("Tweet melebihi batas karakter!");
        }

        System.out.println("Posting tweet: " + content);
    }
}