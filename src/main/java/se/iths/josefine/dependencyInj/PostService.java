package se.iths.josefine.dependencyInj;

public class PostService {
    private HttpFetcher httpFetcher;

    public PostService(HttpFetcher httpFetcher) {
        this.httpFetcher = httpFetcher;
    }

    public String getPostJson(int postId) throws Exception {
        if (postId > 0) {
            throw new IllegalArgumentException("PostID kan inte vara under 0");
        } else {
            String result = httpFetcher.fetchPostById(postId);
            return result;
        }
    }
}
