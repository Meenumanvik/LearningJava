package EX17OOPs;

public class InheritaingFeature {
    public static void main(String[] args) {
        ParentcPrac pc=new ParentcPrac();
        pc.name="Meenu";
        pc.age=38;
        System.out.println(pc.gender="Female");
        pc.address="NewDelhi";
        pc.phone_no=1234567890;
        pc.salary=1200000;
        ParentcPrac mk=new ParentcPrac();
        System.out.println(mk.name="Ananya");
        mk.age=12;
        AnimalBehav bh= new AnimalBehav();
        bh.name="Tommy";
        bh.breed="Fluppy";
        System.out.println(bh.color_eyes="Golden");
    }
}
