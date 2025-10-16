package se.iths.josefine.dependencyInjTest;

import se.iths.josefine.dependencyInj.HttpFetcher;

public class FakeHttpfetcher implements HttpFetcher {

    @Override
    public String fetchPostById(int postId) throws Exception {
        //3 """ i rad skapar en String som spänner över flera rader
        return """
                {
                    "userId": 1,
                    "id": %d,
                    "title": "Test Title",
                    "body": "test Body"
                }
                """.formatted(postId);
        // Genom att använda formatted kan man formatera en sträng med en parameter
        // %d ersätts av värdet för postId
    }
}