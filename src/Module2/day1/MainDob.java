package Module2.day1;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.Arrays;
import java.util.Comparator;

class MainDOB {
    MainDOB() {
    }

    public static void main(String[] var0) {
        Child[] var1 = new Child[]{new Child("John", "Doe", "01-01-2000"), new Child("Jane", "Smith", "15-01-1998"), new Child("Bob", "Johnson", "20-01-2000"), new Child("Alice", "Williams", "30-12-1999"), new Child("Charlie", "Brown", "25-07-2000")};
        Arrays.sort(var1, new Comparator<Child>() {
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
        });
        System.out.println(Arrays.toString(var1));
    }
}
