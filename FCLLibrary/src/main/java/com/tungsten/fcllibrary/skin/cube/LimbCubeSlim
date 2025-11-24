package com.tungsten.fcllibrary.skin.cube;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;

import javax.microedition.khronos.opengles.GL10;

public class LimbCubeSlim extends LimbCube {

    public LimbCubeSlim(float n1, float n2, float n3, float n4, float n5, float n6, float n7, float n8, float n9, 
                       float mainStepValue, float mainMaxAngle, float mainMinAngle, 
                       float subStepValue, float subMaxAngle, float subMinAngle) {
        super(n1, n2, n3, n4, n5, n6, n7, n8, n9, mainStepValue, mainMaxAngle, mainMinAngle, 
              subStepValue, subMaxAngle, subMinAngle);
        
        // 纤细手臂使用不同的顶点构造
        // 重新定义顶点数组以适应纤细手臂的特殊几何结构
        this.vertices = new float[] {
                // 纤细手臂的特殊顶点构造
                -0.75f, -1.0f, 1.0f,    // 0
                0.75f, -1.0f, 1.0f,     // 1
                0.75f, 1.0f, 1.0f,      // 2
                -0.75f, 1.0f, 1.0f,     // 3

                -0.75f, -1.0f, -1.0f,   // 4
                0.75f, -1.0f, -1.0f,    // 5
                0.75f, 1.0f, -1.0f,     // 6
                -0.75f, 1.0f, -1.0f,    // 7

                -0.75f, 0.0f, 1.0f,     // 8
                0.75f, 0.0f, 1.0f,      // 9
                0.75f, 0.0f, -1.0f,     // 10
                -0.75f, 0.0f, -1.0f     // 11
        };
        
        // 重新计算面顶点
        for (int i = 0; i < this.faceIndecies.length; ++i) {
            final int n = this.faceIndecies[i];
            final float n2 = this.vertices[n * 3 + 1] * this.scale[1] / 2.0f;
            final float n3 = this.vertices[n * 3 + 2] * this.scale[2] / 2.0f;
            this.vertexBuffer.put(i * 3, this.vertices[n * 3] * this.scale[0] / 2.0f);
            this.vertexBuffer.put(i * 3 + 1, n2);
            this.vertexBuffer.put(i * 3 + 2, n3);
        }
    }
}
