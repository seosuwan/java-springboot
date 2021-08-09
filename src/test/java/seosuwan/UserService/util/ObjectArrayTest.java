package seosuwan.UserService.util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class ObjectArrayTest {
    @Mock
    ObjectArray ObjectArray;
    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        ObjectArray = new ObjectArray();
    }
    @Test
    void createCart() {
        String s = "";
        Product[] arr = ObjectArray.createCart();
        for(Product i: arr){
            s += i;
            System.out.println(i.toString());
        }
        assertEquals("Coffee",arr[0].getDescription());
    }
}