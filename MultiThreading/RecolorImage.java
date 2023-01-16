import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class RecolorImage {
    public static final String SOURCE_FILE= "Resources/input.png";
    public static final String DEST_FILE="./Resources/output.png";
    public static void main(String[] args) throws IOException {
        BufferedImage originalImage = ImageIO.read(new File(SOURCE_FILE));
        BufferedImage resultImage = new BufferedImage(originalImage.getWidth(),originalImage.getHeight(),BufferedImage.TYPE_INT_RGB);
        recolorSingleThreaded(originalImage,resultImage);
        File outputFile = new File(DEST_FILE);
        ImageIO.write(resultImage,"png",outputFile);
    }
    private static void recolorSingleThreaded(BufferedImage originalImage,BufferedImage resultImage){
        recolorImage(originalImage,resultImage,0,0,originalImage.getWidth(),originalImage.getHeight());
    }
    private static void recolorImage(BufferedImage originalImage,BufferedImage resultImage,int leftCorner,int topCorner,int width,int height){
        for(int x = leftCorner; x < leftCorner+width && x < originalImage.getWidth(); x++){
            for(int y=topCorner; y < topCorner + height && y < originalImage.getHeight(); y++){
                    recolorPixel(originalImage,resultImage,x,y);
            }
        }
    }
    private static void recolorPixel(BufferedImage originalImage,BufferedImage resultImage,int x,int y){
        int rgb = originalImage.getRGB(x,y);
        int red = getRed(rgb);
        int blue = getBlue(rgb);
        int green = getGreen(rgb);

        int newRed;
        int newGreen;
        int newBlue;

        if(isShadeOfSomeWhite(red,green,blue)){
            newRed = 245;
            newGreen = 100;
            newBlue = 45;
        }else{
            newRed = red;
            newGreen = green;
            newBlue = blue;
        }

        int newRGB = createRGBFromColors(newRed,newGreen,newBlue);
        setRGB(resultImage,x,y,newRGB);
    }
    private static void setRGB(BufferedImage image,int x,int y,int rgb){
        image.getRaster().setDataElements(x,y,image.getColorModel().getDataElements(rgb,null));
    }
    private static boolean isShadeOfSomeWhite(int red,int green,int blue){
        return Math.abs(red - green) < 5 && Math.abs(red - blue) < 5 && Math.abs(green - blue) < 5;
    }
    private static int createRGBFromColors(int red,int green, int blue){
        int rgb = 0;
        rgb |= (red << 16);
        rgb |= (green << 8);
        rgb |= blue;
        rgb |= 0xFF000000;

        return rgb;
    }
    private static int getRed(int rgb){
        return (rgb & 0x00FF0000) >> 16;
    }
    private static int getGreen(int rgb){
        return (rgb & 0x0000FF00) >> 8;
    }
    private static int getBlue(int rgb){
        return rgb & 0x000000FF;
    }
}


