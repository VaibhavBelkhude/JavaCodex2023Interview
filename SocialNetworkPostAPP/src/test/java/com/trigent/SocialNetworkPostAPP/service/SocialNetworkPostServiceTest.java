package com.trigent.SocialNetworkPostAPP.service;

import com.trigent.SocialNetworkPostAPP.model.SocialNetworkPost;
import com.trigent.SocialNetworkPostAPP.repo.SocialNetworkPostRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class SocialNetworkPostServiceTest {

    @Mock
    private SocialNetworkPostRepository repository;

    @InjectMocks
    private SocialNetworkPostService service;

    public SocialNetworkPostServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetTop10PostsByCategory() {
        SocialNetworkPost post1 = new SocialNetworkPost(1L, new Date(), "Music", "Alice", "Check out my new song!", 1570L);
        SocialNetworkPost post2 = new SocialNetworkPost(2L, new Date(), "Music", "Eve", "My concert was amazing last night!", 2850L);
        List<SocialNetworkPost> posts = Arrays.asList(post1, post2);

        when(repository.findTop10ByPostCategoryOrderByViewCountDesc("Music")).thenReturn(posts);

        List<SocialNetworkPost> result = service.getTop10PostsByCategory("Music");
        assertEquals(2, result.size());
        verify(repository, times(1)).findTop10ByPostCategoryOrderByViewCountDesc("Music");
    }

    @Test
    public void testGetPostsByAuthor() {
        SocialNetworkPost post1 = new SocialNetworkPost(1L, new Date(), "Music", "Alice", "Check out my new song!", 1570L);
        List<SocialNetworkPost> posts = Arrays.asList(post1);

        when(repository.findByAuthor("Alice")).thenReturn(posts);

        List<SocialNetworkPost> result = service.getPostsByAuthor("Alice");
        assertEquals(1, result.size());
        verify(repository, times(1)).findByAuthor("Alice");
    }
}
