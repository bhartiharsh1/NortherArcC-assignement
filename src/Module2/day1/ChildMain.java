package Module2.day1;

class ChildMain {
    String fname;
    String lname;
    String DOB;

    ChildMain(String var1, String var2, String var3) {
        this.fname = var1;
        this.lname = var2;
        this.DOB = var3;
    }

    String getDOB() {
        return this.DOB;
    }

    public String toString() {
        return "Child{fname='" + this.fname + "', lname='" + this.lname + "', DOB='" + this.DOB + "'}";
    }
}

