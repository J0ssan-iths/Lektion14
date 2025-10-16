package se.iths.josefine.dependencyInj;

public interface HttpFetcher {

    public String fetchPostById(int postId) throws Exception;
}
