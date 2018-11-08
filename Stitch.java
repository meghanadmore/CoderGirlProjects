package Tapestry;

public class Stitch {
    public String stitch;
    public void sew()
    {
        System.out.println(stitch);
    }
    public static class ShortLineStitch extends Stitch {
        public void sew() {
            this.stitch = "-";
            System.out.println(stitch);
        }
    }
    public static class SmallCrossStitch extends Stitch{
        public void sew(){
            this.stitch="x";
            System.out.println(stitch);
        }
    }
    public static class LargeCrossStitch extends Stitch{
        public void sew(){
            this.stitch="X";
            System.out.println(stitch);
        }
    }
    public static class CircleStitch extends Stitch{
        public void sew(){
            this.stitch="o";
            System.out.println(stitch);
        }
    }
    public static class FillStitch extends Stitch{
        public void sew(){
            this.stitch="=";
            System.out.println(stitch);
        }
    }
    public static class BlockStitch extends Stitch{
        public void sew(){
            this.stitch="[]";
            System.out.println(stitch);
        }
    }
    public static class ZigZagStitch extends Stitch{
        public void sew(){
            this.stitch="Z";
            System.out.println(stitch);
        }
    }
}
