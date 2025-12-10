package OOPS2;

public  class Marks {
    static class StudentData{
        String name ;
        int roln;
        int[] marks;
        StudentData(int s){
            marks = new int[s];
        }
    }
    public static void main(String[] args) {
        StudentData s1 = new StudentData(4);
        StudentData s2 = new StudentData(2);

        s1.marks[0]= 48;
        s1.marks[1]= 83;
        s1.marks[2]= 54;
        s1.marks[3]= 34;
        s2.marks[0]= 96;
        s2.marks[1]= 97;

        for (int i = 0; i <s1.marks.length ; i++) {
            System.out.println(s1.marks[i]);
        }
        System.out.println();
        for (int i = 0; i < s2.marks.length; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}
