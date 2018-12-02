package Tapestries;

import java.util.ArrayList;

import static java.lang.System.out;
public class Pattern {
    double jamRate;
    ArrayList<Stitch> stitches=new ArrayList<Stitch>(6);

    Stitch shortLineStitch =new Stitch();
    Stitch smallCrossStitch=new SmallCrossStitch();
    Stitch largeCrossStitch=new LargeCrossStitch();
    Stitch circleStitch=new CircleStitch();
    Stitch fillStitch=new FillStitch();
    Stitch blockstitch=new BlockStitch();
    Stitch zigZagStitch=new ZigZagStitch();

    public void Pattern()
    {
stitches.add(shortLineStitch);
stitches.add(largeCrossStitch);
stitches.add(largeCrossStitch);
stitches.add(circleStitch);
stitches.add(fillStitch);
stitches.add(blockstitch);
stitches.add(zigZagStitch);
    }
    public void pattern(){


    }



}
