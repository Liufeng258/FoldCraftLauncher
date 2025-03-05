package com.tungsten.fcllibrary.skin.cube.arm.slim;

import com.tungsten.fcllibrary.skin.cube.LimbCube;

public class LeftArmSlimOverlay extends LimbCube {

    protected float[] leftArmSlimOverlayTexCoordinates;
    
    public LeftArmSlimOverlay(float scale) {
        super(3.1764708f * scale, 12.705883f * scale, 4.2352943f * scale, 5.5f * scale, 2.0f * scale, 0.0f * scale,
                1.0f, 0.0f, 0.0f,
                -0.5f, 10.0f, -10.0f,
                0.333f, 20.0f, -20.0f);
        this.leftArmSlimOverlayTexCoordinates = new float[] {
                0.828125f, 1.0f, 0.828125f, 0.90625f, 0.890625f, 0.90625f, 0.890625f, 1.0f, // 第1个面
                0.828125f, 0.90625f, 0.828125f, 0.8125f, 0.890625f, 0.8125f, 0.890625f, 0.90625f, // 第2个面
                0.828125f, 0.8125f, 0.828125f, 0.75f, 0.890625f, 0.75f, 0.890625f, 0.8125f, // 第3个面
                0.890625f, 0.8125f, 0.890625f, 0.75f, 0.953125f, 0.75f, 0.953125f, 0.8125f, // 第4个面
                0.890625f, 1.0f, 0.890625f, 0.90625f, 0.953125f, 0.90625f, 0.953125f, 1.0f, // 第5个面
                0.890625f, 0.90625f, 0.890625f, 0.8125f, 0.953125f, 0.8125f, 0.953125f, 0.90625f, // 第6个面
                0.765625f, 1.0f, 0.765625f, 0.90625f, 0.828125f, 0.90625f, 0.828125f, 1.0f, // 第7个面
                0.765625f, 0.90625f, 0.765625f, 0.8125f, 0.828125f, 0.8125f, 0.828125f, 0.90625f, // 第8个面
                0.953125f, 1.0f, 0.953125f, 0.90625f, 1.0f, 0.90625f, 1.0f, 1.0f, // 第9个面
                0.953125f, 0.90625f, 0.953125f, 0.8125f, 1.0f, 0.8125f, 1.0f, 0.90625f // 第10个面
        };
        addTextures(this.leftArmSlimOverlayTexCoordinates);
    }
}
