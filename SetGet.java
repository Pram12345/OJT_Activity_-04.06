class ddn{
    private String name;
    private int age;
    private String city;

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    public void setCity(String city){
        this.city = city;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getCity(){
        return city;
    }
}


public class SetGet {
    public static void main(String[] args) {
        ddn p1 = new ddn();
        // p1.name = "hello";
        p1.setName("ramakant");
        p1.setAge(21);
        p1.setCity("ddn");
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        System.out.println(p1.getCity());
    }


    
}
