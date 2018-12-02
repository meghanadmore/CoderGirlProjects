package Tapestries;
import static java.lang.System.out;

public class CrossStitchWigglePattern extends Pattern {
    boolean needleJam=(Math.random()<0.05d);
    public void pattern(){
        for(int i=0;i<5;i++){
            smallCrossStitch.sew();
            if(i==2&&needleJam){
                System.out.print("    ");
                break;
            }largeCrossStitch.sew();
        }

    }

}
