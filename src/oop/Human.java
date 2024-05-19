package oop;

public class Human {
    private String emer;
    private String id;
    private int mosha;

    static int popullsia;

    public Human(){
    }

    public Human(String emri,String id,int mosha){
        emer = emri;
        this.id = id;
        this.mosha = mosha;
        popullsia++;
    }

    static int getPopullsia(){
        return popullsia;
    }

    void sleep(){System.out.println(emer + "is sleeping!");}

    void walk(){System.out.println(emer + "is walking!");}

    public String getEmer() {
        return emer;
    }

    public void setEmer(String emer) {
        this.emer = emer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getMosha() {
        return mosha;
    }

    public void setMosha(int mosha) {
        if (mosha > 25){
            return;
        }
        this.mosha = mosha;
    }
}
