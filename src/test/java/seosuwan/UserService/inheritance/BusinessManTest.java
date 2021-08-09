package seosuwan.UserService.inheritance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class BusinessManTest {
    @Mock
    BusinessMan businessMan;
    @Mock
    Man man;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        man = new Man();
        businessMan = new BusinessMan("구글","개발자");
        businessMan.setName("서수완");
    }
    @DisplayName("상속예제")
    @Test
    public void test_showName(){
        assertEquals("서수완",businessMan.getName());
        assertEquals("구글",businessMan.getCompany());
        assertEquals("개발자",businessMan.getPosition());
    }

}