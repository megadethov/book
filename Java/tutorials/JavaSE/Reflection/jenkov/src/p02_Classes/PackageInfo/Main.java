package p02_Classes.PackageInfo;

public class Main {
    public static void main(String[] args) {
//        You can obtain information about the package from a Class object like this:
        Class<? extends Main> aClass = Main.class;
        Package aPackage = aClass.getPackage();
        String aPackageName = aPackage.getName(); // p02_Classes.PackageInfo
    }
}
