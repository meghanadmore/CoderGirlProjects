package Tapestry;

public class TapestryController {
    private static void printPattern(Pattern pattern,double faiRate) {
        boolean needleJam = (Math.random() < 0.40d);
        if (needleJam) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 8; j++) {
                    pattern.pattern();
                }
                System.out.println();
            }
            for (int n = 0; n < 3; n++) {
                System.out.println();
            }
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 6; j++) {
                    pattern.pattern();
                }
                System.out.println();
            }
            for (int n = 0; n < 3; n++) {
                System.out.println();
            }
        } else {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 4; j++) {
                    pattern.pattern();
                }
                System.out.println();
            }
            for (int n = 0; n < 3; n++) {
                System.out.println();
            }
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 3; j++) {
                    pattern.pattern();
                }
                System.out.println();
            }
            for (int n = 0; n < 3; n++) {
                System.out.println();
            }
        }
    }
        public static void main(String[]args){
            Pattern crossStitchWigglePat= new Pattern.CrossStitchWigglePattern();
            crossStitchWigglePat.pattern();
            printPattern(crossStitchWigglePat, 0.05);
            Pattern zigZagPat=new Pattern.ZigZagLinePattern();
            zigZagPat.pattern();
            printPattern(zigZagPat,0.00);
            Pattern baublePat=new Pattern.BaublePattern();
            baublePat.pattern();
            printPattern(baublePat,0);
            Pattern blockyBaublePat=new Pattern.BlockyBaublePattern();
            blockyBaublePat.pattern();
            printPattern(blockyBaublePat,0.10);
            Pattern brokenWigglePat=new Pattern.BrokenWigglePattern();
            brokenWigglePat.pattern();
            printPattern(brokenWigglePat,0.40);


    }

}
