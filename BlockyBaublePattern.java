package Tapestries;

import static java.lang.System.out;
public class BlockyBaublePattern extends Pattern {
    boolean needleJam=(Math.random()<0.10d);

    public void pattern(){

        for(int i=0;i<3;i++){
            blockstitch.sew();
            shortLineStitch.sew();
            shortLineStitch.sew();
            if(i==1&&needleJam){
                System.out.print(" ");
            break;
            }circleStitch.sew();
            shortLineStitch.sew();
            shortLineStitch.sew();


        }
    }
}
