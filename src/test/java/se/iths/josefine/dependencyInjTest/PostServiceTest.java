package se.iths.josefine.dependencyInjTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import se.iths.josefine.dependencyInj.HttpFetcher;
import se.iths.josefine.dependencyInj.PostService;

public class PostServiceTest {

    //Arrange
    PostService postService;
    private HttpFetcher fakeHttpfetcher;
    private PostService getPostService;

    @BeforeEach
    public void setUp() {
        fakeHttpfetcher = new FakeHttpfetcher();
        postService = new PostService(fakeHttpfetcher);
    }

    @Test
    @DisplayName("Testar klassen getPostJson()")
    void getPostJsonTest() throws Exception {
        //Act

        //Assertions
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                postService.getPostJson(-3));
    }
}
