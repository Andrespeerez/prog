public class Tabla {

    public static void main(String[] args) {

        int[][] gradeTable = {   {99, 42, 74, 83, 100},
                {90, 91, 72, 88, 95},
                {88, 61, 74, 89, 96},
                {61, 89, 82, 98, 93},
                {93, 73, 75, 78, 99},
                {50, 65, 92, 87, 94},
                {43, 98, 78, 56, 99}   };

        System.out.println(gradeTable[3][4]);
        gradeTable[3][4]++; //94
        System.out.println(gradeTable[3][4]);

        int value = (gradeTable[6][2] + 2) / 2; // 40
        System.out.println(value);

        //gradeTable[7][2] = 9;

        //gradeTable[3.2][1] = 8;

        //gradeTable[1++][2] = 4;
    }
}
