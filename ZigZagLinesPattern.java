package Tapestries;

import static java.lang.System.out;
public class ZigZagLinesPattern extends Pattern {
    public void pattern() {
        for (int i = 0; i < 2; i++){
            for(int j=0;j<3;j++){
                zigZagStitch.sew();
            }for(int j=0;j<3;j++){
                fillStitch.sew();
            }
        }
    }
}
