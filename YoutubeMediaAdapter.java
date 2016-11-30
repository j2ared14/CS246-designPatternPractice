public class YoutubeMediaAdapter implements SocialMediaEntry {
	public YouTubeVideo video;
	public String user;
	public String postText;

	public YoutubeMediaAdapter(YouTubeVideo ytv) {
		video = ytv;
		user = video.getAuthor();
		postText = video.getTitle() + " " + video.getDescription();
	}

	public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }
}