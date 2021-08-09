package seosuwan.UserService.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)

class MyUtilTest {
    @Mock
    MyUtil myUtil;
    @BeforeEach
    void setup(){
        MockitoAnnotations.initMocks(this);
        myUtil = new MyUtil();
    }
    @Test
    void now() {
        System.out.println(myUtil.now());
    }
}