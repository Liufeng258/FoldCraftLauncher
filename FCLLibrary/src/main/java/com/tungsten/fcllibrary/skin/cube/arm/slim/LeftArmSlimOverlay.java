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
                0.796875f, 1.0f, 0.796875f, 0.90625f, 0.859375f, 0.90625f, 0.859375f, 1.0f,         // 面1
                0.796875f, 0.90625f, 0.796875f, 0.8125f, 0.859375f, 0.8125f, 0.859375f, 0.90625f,   // 面2
                0.796875f, 0.8125f, 0.796875f, 0.75f, 0.859375f, 0.75f, 0.859375f, 0.8125f,         // 面3
                0.859375f, 0.8125f, 0.859375f, 0.75f, 0.921875f, 0.75f, 0.921875f, 0.8125f,         // 面4
                0.859375f, 1.0f, 0.859375f, 0.90625f, 0.921875f, 0.90625f, 0.921875f, 1.0f,         // 面5
                0.859375f, 0.90625f, 0.859375f, 0.8125f, 0.921875f, 0.8125f, 0.921875f, 0.90625f,   // 面6
                0.734375f, 1.0f, 0.734375f, 0.90625f, 0.796875f, 0.90625f, 0.796875f, 1.0f,         // 面7
                0.734375f, 0.90625f, 0.734375f, 0.8125f, 0.796875f, 0.8125f, 0.796875f, 0.90625f,    // 面8
                0.921875f, 1.0f, 0.921875f, 0.90625f, 0.984375f, 0.90625f, 0.984375f, 1.0f,         // 面9
                0.921875f, 0.90625f, 0.921875f, 0.8125f, 0.984375f, 0.8125f, 0.984375f, 0.90625f     // 面10
        };
        addTextures(this.leftArmSlimOverlayTexCoordinates);
    }
}
