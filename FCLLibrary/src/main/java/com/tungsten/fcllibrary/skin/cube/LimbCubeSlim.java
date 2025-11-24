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
        this.vertices = new float[] {
                -0.75f, -1.0f, 1.0f,
                0.75f, -1.0f, 1.0f,
                0.75f, 1.0f, 1.0f,
                -0.75f, 1.0f, 1.0f,

                -0.75f, -1.0f, -1.0f,
                0.75f, -1.0f, -1.0f,
                0.75f, 1.0f, -1.0f,
                -0.75f, 1.0f, -1.0f,

                -0.75f, 0.0f, 1.0f,
                0.75f, 0.0f, 1.0f,
                0.75f, 0.0f, -1.0f,
                -0.75f, 0.0f, -1.0f
        };
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