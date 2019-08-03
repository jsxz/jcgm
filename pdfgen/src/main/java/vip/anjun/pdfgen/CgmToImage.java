package vip.anjun.pdfgen;

import lombok.extern.slf4j.Slf4j;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

@Slf4j
public class CgmToImage {
    public static void main(String[] args) {
        System.out.println(Arrays.asList( ImageIO.getReaderFormatNames()));
        String name = "samples/allelm01.cgm";
        try {
            BufferedImage bufferedImage = ImageIO.read(new File(name));
            ImageIO.write(bufferedImage, "png", new File("out/test.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
