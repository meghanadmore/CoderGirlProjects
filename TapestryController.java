package Tapestries;

import java.util.ArrayList;

public class TapestryController {
    private ArrayList<Pattern> patternArrayList=new ArrayList<Pattern>();

    public static void main(String[] args) {

        TapestryController A = new TapestryController();


        Pattern crossStitchWigglePattern  = new CrossStitchWigglePattern();
        Pattern zigZagLinesPattern = new ZigZagLinesPattern();
        Pattern baublePattern = new BaublePattern();
        Pattern blockyBaublePattern = new BlockyBaublePattern();
        Pattern brokenWigglePattern =new BrokenWigglePattern();
        A.patternArrayList.add(crossStitchWigglePattern);
        A.patternArrayList.add(zigZagLinesPattern);
        A.patternArrayList.add(baublePattern);
        A.patternArrayList.add(blockyBaublePattern);
        A.patternArrayList.add(brokenWigglePattern);


        if (A.patternArrayList.size() != 0) {
            for (int i = 0; i < A.patternArrayList.size(); i++) {
                for (int x = 0; x < 3; x++) {
                    for (int y=0;y<8;y++) {
                        A.patternArrayList.get(i).pattern();
                        System.out.print(" ");
                    }
                    System.out.println();
                }
                System.out.println("\n\n");
                for (int x = 0; x < 8; x++) {
                    for (int y=0;y<6;y++) {
                        A.patternArrayList.get(i).pattern();
                        System.out.print(" ");

                    }
                    System.out.println();
                }
                System.out.println("\n");
            }
        }

    }
}


