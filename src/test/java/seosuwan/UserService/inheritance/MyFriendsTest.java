package seosuwan.UserService.inheritance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class MyFriendsTest {
    @Mock
    MyFriends friends;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        friends = new MyFriends();
    }
    @Test
    void getFriends() {
        Friend[] returnFriends = friends.getFriends();
        for(Friend f : returnFriends){
            System.out.println(f.toString());
        }
        assertEquals("Yoon",returnFriends[2].getName());
    }
}