package visitorPattern;

/**
 *
 * 访问者模式
 *
 * 优点
 1、使得新增新的访问操作变得更加简单。

 2、能够使得用户在不修改现有类的层次结构下，定义该类层次结构的操作。

 3、将有关元素对象的访问行为集中到一个访问者对象中，而不是分散搞一个个的元素类中。

 缺点
 1、增加新的元素类很困难。在访问者模式中，每增加一个新的元素类都意味着要在抽象访问者角色中增加一个新的抽象操作，并在每一个具体访问者类中增加相应的具体操作，违背了“开闭原则”的要求。
 2、破坏封装。当采用访问者模式的时候，就会打破组合类的封装。

 3、比较难理解。貌似是最难的设计模式了。

 五、模式适用场景
 1、对象结构中对象对应的类很少改变，但经常需要在此对象结构上定义新的操作。

 2、需要对一个对象结构中的对象进行很多不同的并且不相关的操作，而需要避免让这些操作“污染”这些对象的类，也不希望在增加新操作时修改这些类。

 六、模式总结
 1、访问者模式封装了对象结构元素之上的操作，使得新增元素的操作变得非常简单。所以它比较适用于那么对象结构很少变化的类。

 2、访问者模式中对象结构存储了不同类型的元素对象，以供不同访问者访问。
 * Created by Administrator on 2018/11/28 0028.
 */
public class Main {
    public static void main(String[] args) {
        MedicineA medicineA = new MedicineA("nameA", 12.5);
        MedicineB medicineB = new MedicineB("nameB", 15.5);

        Presciption presciption = new Presciption();
        presciption.add(medicineA);
        presciption.add(medicineB);

        Charger charger = new Charger();
        charger.setName("chargerA");

        PharmacyWorker pharmacyWorker = new PharmacyWorker();
        pharmacyWorker.setName("pharmacyA");

        presciption.accept(charger);
        presciption.accept(pharmacyWorker);
    }
}
