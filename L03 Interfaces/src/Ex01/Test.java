package Ex01;

public class Test {

    private static Measurable[] chilier = new Measurable[30];
    private static Measurable[] øller = new Measurable[30];
    private static Filter filter = new Filter5000();
    public static void main(String[] args) {
        int max = 2000000;
        int min = 0;
        int range = max - min + 1;
        for (int i = 0; i < chilier.length; i++) {
            String navn = "Chili Nr. " + i;
            Measurable obj = new Chili(navn, (int)(Math.random() * range) + min);
            chilier[i] = obj;
        }

        max = 45;
        range = max - min + 1;
        for (int i = 0; i < øller.length; i++) {
            String navn = "Øl Nr. " + i;
            Measurable obj = new Beer(navn, (double)(Math.random() * range) + min);
            øller[i] = obj;
        }

        System.out.println(average(chilier, filter));
        System.out.println(max(chilier).toString());
        String udskriv = blackFridayMeal(chilier, øller)[0].toString();
        udskriv += " og " + blackFridayMeal(chilier, øller)[1].toString();
        System.out.println(udskriv);
    }
    public static double average(Measurable[] objects, Filter filter) {
        double sum = 0;
        int count = 0;
        for (Measurable obj : objects){
            if (filter.accept(obj)){
                sum += obj.getMeasure();
                count++;
            }
        }
        return sum/count;
    }

    /*
    public static double averageMedFilter(Filter[] objects) {
        double sum = 0;
        int count = 0;
        Measurable[] mes = chilier;
        for (int i = 0; i < objects.length; i++) {
            if (objects[i].accept(mes[i])){
                sum += mes[i].getMeasure();
                count++;
            }
        }
        return sum/count;
    }
     */

    public static Measurable max(Measurable[] objects) {
        int max = 0;
        for (int i = 0; i < objects.length; i++) {
            if (objects[i].getMeasure() > objects[max].getMeasure()){
                max = i;
            }
        }
        return objects[max];
    }

    public static Measurable[] blackFridayMeal(Measurable[] chilies, Measurable[] beers) {
        Measurable[] returnArray = new Measurable[2];
        returnArray[0] = max(chilies);
        returnArray[1] = max(beers);
        return returnArray;
    }
}
