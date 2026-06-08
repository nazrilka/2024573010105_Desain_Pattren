package Praktikum_6_LSP_DAN_STRATEGY.praktikum2.tampa_lsp;

public class BlogPost extends SocialMediaPost{
    private boolean isDraft;

    public BlogPost(String content) {
        super(content);
        this.isDraft = true;
    }

    @Override
    public void publish() {
        if (isDraft) {
            throw new IllegalStateException("Blog ini masih di publish! Throw desa draft!");
        }
        isDraft = false;
        super.publish();
    }

    public void editContent(String newContent) {
        if (!isDraft) {
            throw new IllegalStateException("Blog yang sudah di publish tidak bisa diedit!");
        }
        this.content = newContent;
    }
}