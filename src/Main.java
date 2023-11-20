import com.workintech.company.HRManager;
import com.workintech.company.JuniorDeveloper;
import com.workintech.company.MidDeveloper;
import com.workintech.company.SeniorDeveloper;
import com.workintech.cylinder.Cylinder;
import com.workintech.pool.Cuboid;
import com.workintech.pool.Rectangle;

public class Main {
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder(1, 3);
        System.out.println("Floor Area = " + cylinder1.getArea());
        System.out.println("Volume = " + cylinder1.getVolume());
        System.out.println("*******************************");
        Cuboid pool1 = new Cuboid(4, 5, 10);
        System.out.println(pool1.getArea());
        System.out.println(pool1.getVolume());
        System.out.println("*******************************");
        JuniorDeveloper junior1 = new JuniorDeveloper(1, "__junior 1__");
        JuniorDeveloper junior2 = new JuniorDeveloper(2, "__junior 2__");
        MidDeveloper mid1 = new MidDeveloper(3, "__mid 1__");
        SeniorDeveloper senior1 = new SeniorDeveloper(4, "__senior 1__");
        junior1.work();
        junior2.work();
        mid1.work();
        senior1.work();
        System.out.println(junior1);
        HRManager sertac = new HRManager(5, "Sertaç YILDIRIR",
                new JuniorDeveloper[4], new MidDeveloper[2], new SeniorDeveloper[1]);
        sertac.work();
        sertac.addEmployee(0, junior1);
        sertac.addEmployee(1, junior2);
        sertac.addEmployee(0, mid1);
        sertac.addEmployee(0, senior1);
        System.out.println(sertac);
    }
}