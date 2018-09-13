
public class temperatureCalculator {
    public static void main(String[] args) {
        System.out.println("The data provided are:");
        int temps[][] = {{68, 70, 76, 70, 68, 71, 75},
                         {76, 76, 87, 84, 82, 75, 83},
                         {73, 72, 81, 78, 76, 73, 77},
                         {64, 65, 69, 68, 70, 74, 72},
        };

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(temps[i][j] + " ");
            }
            System.out.println();
        }System.out.println();

        String[][]Time = {{"7 AM", "3 PM", "7 PM", "3 AM"},
                          {"    ","    ","      ","     "},
                            };
        String[][]weekDays = {{"Sunday","Monday","Tuesday","wednesday","Thurseday","Friday","Saturday"},
                {"   ","   ","   ","  ","  ","  ","  "},
        };
        System.out.println("Based on the data, following are the average temperaturs for th week!");
        System.out.println();
        for(int i=0;i<7;i++){
            double columnTotal=0;
            for(int j=0;j<4;j++){
                columnTotal += temps[j][i];
            }
            //System.out.println(columnTotal);
            double columnAverage=columnTotal/4;
            //System.out.println(columnAverage);
            weekDays[1][i]=columnAverage+" ";
        } for (int i=0;i<7;i++){
            System.out.println(weekDays[0][i]+"   "+weekDays[1][i]);
        }System.out.println();


        for (int j = 0; j < 4; j++) {
            double rowTotal = 0;
            for (int i = 0; i < 7; i++) {
                rowTotal += temps[j][i];
            }
            // System.out.println(rowTotal);
            double averageRow = rowTotal / 7;
            //System.out.println(averageRow);
            Time[1][j]=averageRow+"";}
              for (int j = 0; j < 4; j++){
            System.out.println(Time[0][j]+"   "+Time[1][j]);}


        System.out.println("The final average temperature for the week was");
        double sum=0;
        int count=0;
        double ave=0;
        for(int row=0;row<temps.length;row++){
            for(int column=0;column<temps[0].length;column++) {
                sum += temps[row][column];
                count++;
                 ave= sum / count;
            }
        }System.out.println("overall:");
        System.out.println(ave);
        }
}
