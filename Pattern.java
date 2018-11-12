package Tapestry;
import java.util.Random;

import static Tapestry.Stitch.*;

public class Pattern {
    Stitch shortLine =new ShortLineStitch();
    Stitch smallCross=new SmallCrossStitch();
    Stitch largeCross=new LargeCrossStitch();
    Stitch circle=new CircleStitch();
    Stitch fill=new FillStitch();
    Stitch block=new BlockStitch();
    Stitch zigZag=new ZigZagStitch();


    public void pattern(){

    }
    public static class CrossStitchWigglePattern extends Pattern{
        public void pattern(){
            smallCross.sew();
            largeCross.sew();

        }
    }
    public static class ZigZagLinePattern extends Pattern{
        public void pattern(){
            for(int i=0;i<=2;i++){
                zigZag.sew();
            }
            for(int i=0;i<=2;i++){
                fill.sew();
            }

        }
    }
    public static class BaublePattern extends Pattern{
        public void pattern(){
            for(int i=0;i<=1;i++){
                shortLine.sew();
            }
            circle.sew();
        }
    }
    public static class BlockyBaublePattern extends Pattern{
        public void pattern(){
            block.sew();
            for(int i=0;i<=2;i++){
                fill.sew();
            }
            circle.sew();
            for(int i=0;i<=2;i++){
                fill.sew();
            }
        }

    }
    public static class BrokenWigglePattern extends Pattern{
        public void pattern(){
            smallCross.sew();
            largeCross.sew();
        }
    }

    
}
