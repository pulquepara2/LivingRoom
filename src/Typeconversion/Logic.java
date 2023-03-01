package Typeconversion;

public class Logic {
    public static void main(String[] args) {
        //The sun is shining AND it is raining. AND--> &&
        boolean sun = false;
        boolean rain = true;
        System.out.println(!sun && rain);
//This exercise confuses me OR I know exactly what to do
        boolean confusion = true;
        boolean knowledge = false;
        System.out.println(confusion || knowledge);

        //(1 > 3 AND ( NOT 3-1 < 5)) OR 2*2 ==4
        boolean result = 1 > 3 && (!(3 - 1 < 5)) || 2 * 2 == 4;
        System.out.println(result);
//(6<=2*3 || 2-3 < 0) && (1*1 == 1 && 1 !=1+1
        boolean logicalOperator = (6 <= 2 * 3 || 2 - 3 < 0) && (1 * 1 == 1 && 1 != 1 + 1);
        System.out.println(logicalOperator);

    }
}
