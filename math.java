class Students{
    static String name;
    public static void show(Students cits){
        System.out.println(cits.name);
    }
}

public class math{
    public static void main(String[] args) {
        Students adit = new Students();
        adit.name = "ramakant";
        Students cits = new Students();
        // cits.name = "aman";
        Students cts = new Students();
        // cts.name = "mukesh";
        cits.show(adit);
    }
}