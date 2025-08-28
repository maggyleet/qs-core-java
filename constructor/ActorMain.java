package constructor;

class Actor {

    String name;
    int age;
    int nom;
    int noh;
    int nof;

    public Actor(String name, int age, int movies, int hits, int flops) {
        this.name = name;
        this.age = age;
        nom = movies;
        noh = hits;
        nof = flops;
    }
}

public class ActorMain {
    public static void main(String[] args) {

        Actor a1 = new Actor("Vijay", 47, 68, 45, 23);
        System.out.println("Actor 1 name: " + a1.name);
        System.out.println("Actor 1 age: " + a1.age);
        System.out.println("Actor 1 No. of movies: " + a1.nom);
        System.out.println("Actor 1 No. of hits: " + a1.noh);
        System.out.println("Actor 1 No. of flops: " + a1.nof);
        System.out.println();

        Actor a2 = new Actor("Ajay", 34, 28, 20, 8);
        System.out.println("Actor 2 name: " + a2.name);
        System.out.println("Actor 2 age: " + a2.age);
        System.out.println("Actor 2 No. of movies: " + a2.nom);
        System.out.println("Actor 2 No. of hits: " + a2.noh);
        System.out.println("Actor 2 No. of flops: " + a2.nof);
        System.out.println();

        Actor a3 = new Actor("Allu Arjun", 45, 40, 29, 11);
        System.out.println("Actor 3 name: " + a3.name);
        System.out.println("Actor 3 age: " + a3.age);
        System.out.println("Actor 3 No. of movies: " + a3.nom);
        System.out.println("Actor 3 No. of hits: " + a3.noh);
        System.out.println("Actor 3 No. of flops: " + a3.nof);
        System.out.println();

        Actor a4 = new Actor("Ram Charan", 43, 50, 35, 15);
        System.out.println("Actor 4 name: " + a4.name);
        System.out.println("Actor 4 age: " + a4.age);
        System.out.println("Actor 4 No. of movies: " + a4.nom);
        System.out.println("Actor 4 No. of hits: " + a4.noh);
        System.out.println("Actor 4 No. of flops: " + a4.nof);
        System.out.println();

        Actor a5 = new Actor("Karthick", 40, 35, 25, 10);
        System.out.println("Actor 5 name: " + a5.name);
        System.out.println("Actor 5 age: " + a5.age);
        System.out.println("Actor 5 No. of movies: " + a5.nom);
        System.out.println("Actor 5 No. of hits: " + a5.noh);
        System.out.println("Actor 5 No. of flops: " + a5.nof);
        System.out.println();

    }
}
