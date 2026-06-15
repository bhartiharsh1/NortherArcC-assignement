package Module2.day2.DAO_Package.Student.Entity;

public class Student {
    private String name;
    private int Pmarks;
    private int Mmarks;
    private int Hmarks;
    private int Gmarks;
    private int Cmarks;

    public Student(String name, int Pmarks, int Mmarks, int Hmarks, int Gmarks, int Cmarks) {
        this.name = name;
        Pmarks = Pmarks;
        Mmarks = Mmarks;
        Hmarks = Hmarks;
        Gmarks = Gmarks;
        Cmarks = Cmarks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPmarks() {
        return Pmarks;
    }

    public void setPmarks(int Pmarks) {
        Pmarks = Pmarks;
    }

    public int getMmarks() {
        return Mmarks;
    }

    public void setMmarks(int Mmarks) {
        Mmarks = Mmarks;
    }

    public int getHmarks() {
        return Hmarks;
    }

    public void setHmarks(int Hmarks) {
        Hmarks = Hmarks;
    }

    public int getGmarks() {
        return Gmarks;
    }

    public void setGmarks() {
        Gmarks = Gmarks;
    }

    public int getCmarks() {
        return Cmarks;
    }

    public void setCmarks(int cmarks) {
        Cmarks = Cmarks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", Pmarks=" + Pmarks +
                ", Mmarks=" + Mmarks +
                ", Hmarks=" + Hmarks +
                ", Gmarks=" + Gmarks +
                ", Cmarks=" + Cmarks +
                '}';
    }
}
