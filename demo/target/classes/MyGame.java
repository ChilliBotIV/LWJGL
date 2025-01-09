package com.example;

import org.lwjgl.opengl.GL;

import static org.lwjgl.opengl.GL11.GL_VERSION;
import static org.lwjgl.opengl.GL11.glGetString;
import static org.lwjgl.opengl.GL46.*;


public class MyGame extends Game {

    public void init(Window window) {}
    public void update(long currentTime, long deltaTime) {}
    public void draw() {
        GL.createCapabilities();

    }



    public void handleKeyPress(int key, int action) {}
    public void handleMouseClick(int key, int action) {}
    public void windowResized(int width, int height)  {}
    public static void rect(float x, float y){}
    public void dispose() {}

}