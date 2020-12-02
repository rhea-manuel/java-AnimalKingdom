package animalkingdom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// import animalkingdom.Fish;

// import animalkingdom.Bird;

// import animalkingdon.Mammal;

public class AnimalKingdom {

    private static List<Animal> filterAnimals(List<Animal> list, CheckAnimal filter)
    {
        List<Animal> temp = new ArrayList<>();

        for (Animal a : list)
        {
            if (filter.test (a))
            {
                temp.add(a);
            }
        }

        return temp;
    }
    public static void main(String[] args) {
        // Animal animal = new Animal("Geroge", 1991);

        // MAMMALS
        Mammal panda = new Mammal("Panda", 1869);
        Mammal zebra = new Mammal("Zebra", 1778);
        Mammal koala = new Mammal("Koala", 1816);
        Mammal sloth = new Mammal("Sloth", 1804);
        Mammal armadillo = new Mammal("Armadillo", 1758);
        Mammal raccoon = new Mammal("Raccoon", 1758);
        Mammal bigfoot = new Mammal("Bigfoot", 2021);

        // BIRDS
        Bird pigeon = new Bird("Pigeon", 1837);
        Bird peacock = new Bird("Peacock", 1821);
        Bird toucan = new Bird("Toucan", 1758);
        Bird parrot = new Bird("Parrot", 1824);
        Bird swan = new Bird("Swan", 1758);

        // FISH
        Fish salmon = new Fish ("Salmon", 1758);
        Fish catfish = new Fish ("Catfish", 1817);
        Fish perch = new Fish ("Perch", 1758);
        
        // Add all to list
        List<Animal>animals = new ArrayList<>();
        animals.addAll(Arrays.asList(panda, zebra, koala, sloth, armadillo, raccoon, bigfoot,
        pigeon, peacock, toucan, parrot, swan, 
        salmon, catfish, perch
        ));

        // System.out.println(animals);

        // ------- LAMBDA FUNCTIONS -----------
        // Descending by year named
        animals.sort((v1, v2)-> v2.getYear() - v1.getYear());
        // animals.forEach((item)-> System.out.println(item.getYear()));
        
        // Alphabetically
        animals.sort((v1,v2)->v1.getName().compareToIgnoreCase(v2.getName()));
        // animals.forEach((item)-> System.out.println(item.getName()));

        // List animals by how they move 
        animals.forEach((v1)->System.out.println(v1.move()));

        // List only those animals that breathe with lungs
        List<Animal>notLungAnimals = filterAnimals(animals, v -> v.breathe()=="lungs");
        notLungAnimals.forEach((a)-> System.out.println(a));

        System.out.println();
        
        // Lists only those animals that breathe with lungs AND born in 1758
        List<Animal>lungsAnd1758 = filterAnimals(animals, v -> v.breathe()=="lungs" && v.getYear()==1758);
        lungsAnd1758.forEach(a -> System.out.println(a));
        
        System.out.println();
        
        //  List only those animals that lay eggs and breath with lungs
        List<Animal>eggsAndLung = filterAnimals(animals, v -> v.breathe()=="lungs" && v.reproduce()=="eggs");
        eggsAndLung.forEach(a -> System.out.println(a));
        
        System.out.println();
        
        //  List alphabetically only those animals that were named in 1758
        List<Animal>only1758 = filterAnimals(animals, v -> v.getYear()==1758);
        only1758.sort((a1,a2)-> a1.getName().compareToIgnoreCase(a2.getName()));
        only1758.forEach(a -> System.out.println(a));
        

    }
}