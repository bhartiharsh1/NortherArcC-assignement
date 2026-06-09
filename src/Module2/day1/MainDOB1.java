package Module2.day1;

import java.util.Comparator;

class MainDOB1 implements Comparator<Child> {
    MainDOB1() {
    }

    public int compare(Child var1, Child var2) {
        String[] var3 = var1.getDOB().split("-");
        int var4 = Integer.parseInt(var3[2]);
        int var5 = Integer.parseInt(var3[1]);
        int var6 = Integer.parseInt(var3[0]);
        String[] var7 = var2.getDOB().split("-");
        int var8 = Integer.parseInt(var7[2]);
        int var9 = Integer.parseInt(var7[1]);
        int var10 = Integer.parseInt(var7[0]);
        if (var4 != var8) {
            return var4 - var8;
        } else {
            return var5 != var9 ? var5 - var9 : var6 - var10;
        }
    }
}

