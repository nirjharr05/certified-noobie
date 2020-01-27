import java.io.*;

class TabulationSheet{
    static String sname;
    int sheetSize = 0;
    int[] r;
    float[] marks;

    public TabulationSheet(int i) {
        sheetSize = i;
        r = new int[i];
        marks = new float[i];
    }

    public void addRecord(int i, int ro, float m) {
        r[i] = ro;
        marks[i] = m;
    }
    public void addRecord(Marksheet m){
        sname = 
    }

    public void showSheet(String sname) {
        System.out.println("The Tabulation Sheet for the Subject: " + sname);
        for (int j = 0; j < sheetSize; j++) {
            System.out.println("Roll no: " + r[j] + " with Marks: " + marks[j]);
        }
        System.out.println("\n");
    }
}

class Marksheet {
    static String name;
    static String[] sub_name;
    float[] sub_marks;
    int roll;
    TabulationSheet[] t;

    public Marksheet() {
        t = new TabulationSheet[5];
    }

    public void setMarksheet(String n, String[] sub, float[] mar) {
        name = n;   
        sub_name = sub;
        sub_marks = mar;
    }
}

public class Student {
    String[] name;
    int[] roll;
    String[][] subjects;
    Marksheet[] m;

    public Student(int i) {
        m = new Marksheet[i];
        name = new String[i];
        roll = new int[i];
        subjects = new String[i][5];
    }
    public void setData(int i, String n, int r, String[] sub) {
        name[i] = n;
        roll[i] = r;
        subjects[i] = sub;
        Marksheet.name = n;
        Marksheet.sub_name = sub;
    }
    public void showBasicData(int i){
      System.out.println("Name of the student is: " + name[i]);
      System.out.println("Roll number of the student is: " + roll[i]);
      System.out.println("Subjects for the student are: ");
      for(int j=0; j<subjects.length; j++){
      System.out.println((j+1) + ". " + subjects[i][j]);
      }
      System.out.println("\n");
    }
    public static void main(String[] args){
      Student s = new Student(3);
      TabulationSheet t1 = new TabulationSheet(3, "x");
      TabulationSheet t2 = new TabulationSheet(3, "y");
      TabulationSheet t3 = new TabulationSheet(3, "z");
      TabulationSheet t4 = new TabulationSheet(3, "a");
      TabulationSheet t5 = new TabulationSheet(3, "b");
      s.getData(0, "A", 1, new String[]{"x", "y", "z", "a", "b"});
      s.getData(1, "B", 2, new String[]{"x", "y", "z", "a", "b"});
      s.getData(2, "C", 3, new String[]{"x", "y", "z", "a", "b"});
      s.showBasicData(0);
      s.showBasicData(1);
      s.showBasicData(2);
      for(int i=0; i<3; i++){
        t1.addRecord(i, i+1, (i+1)*15.0f);
        t2.addRecord(i, i+1, (i+1)*25.0f);
        t3.addRecord(i, i+1, (i+1)*35.0f);
        t4.addRecord(i, i+1, (i+1)*45.0f);
        t5.addRecord(i, i+1, (i+1)*55.0f);
      }
      t1.showSheet("x");
      t2.showSheet("y");
      t3.showSheet("z");
      t4.showSheet("a");
      t5.showSheet("b");
  }
}

