package owner_hierarchy;

public class OwnerHierarchyMain {

    public static void main(String[] args) {
        
        Owner owner = new Owner("Иван", new UnknownFruit("Ябълки", 2, 4));
        
        owner.printParam();
        
        owner.setFruits(new FruitsMachine("Omega", 23, "1000 Juicer"));
        
        owner.printParam();
    }
}
