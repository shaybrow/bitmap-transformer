/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package bitmap.transformer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        grabBMP("app/src/main/resources/img.bmp");
        writeBMP("app/src/main/resources/img.bmp","app/src/main/resources/img2.bmp" );
    }


    public static int [][] grabBMP(String path) {
        BufferedImage inputImg = null;
        try {
            inputImg = ImageIO.read(new File(path));
        } catch (IOException e) {

        }
//        mapping the bitmap into a 2d array

        int height = inputImg.getHeight();
        int width = inputImg.getWidth();
        int [][] bitmapArray = new int[width][height];
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                bitmapArray[x][y] = inputImg.getRGB(x,y);


            }
        }
        return bitmapArray;
    }
    public static void writeBMP(String inputPath, String outputPath) {
        BufferedImage outputImg = null;
        try {


            outputImg = ImageIO.read(new File(inputPath));
            ImageIO.write(outputImg, "bmp", new File(outputPath));
        } catch (IOException e) {

        }
//        mapping the bitmap into a 2d array




    }
}