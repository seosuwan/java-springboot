package seosuwan.UserService.util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class MatrixTest {
    @Mock
    Matrix matrix;
    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        matrix = new Matrix();
    }
    @Test
    void createMatrix(){
        int[][] mtx = matrix.createMatrix(5,5);
        for(int i =0; i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(mtx[i][j]+"\t");
            }
            System.out.println();
        }
        assertEquals(3,mtx[0][2]);
    }
}