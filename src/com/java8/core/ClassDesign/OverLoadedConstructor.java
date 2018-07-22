package com.java8.core.ClassDesign;


class Dogs{

    private String name;
    private String breed;
    private Double weight;


    public Dogs(String name) {
     //   this.name = name;
     //   breed = "Husky";
     //   weight = 20.0;
        this(name, "Husky");  // chaining constructor
        System.out.println("CONSTRUCTOR1");
    }

   public Dogs(String name, String breed){
  //      this.name = name;  // duplicate code
  //      this.breed = breed;  //duplicate code
  //      weight = 30.0;
            this(name, breed, 35.0);   // chaining constructor
            System.out.println("CONSTRUCTOR2");
   }

    public Dogs(String name, String breed, Double weight){
       this.name=name;   // duplicate code
       this.breed=breed;  // duplicate code
       this.weight=weight;
        System.out.println("CONSTRUCOTR 3");
    }

    public void printDog(){
        System.out.println(name + " " + breed +   " " + weight);
    }
}


public class OverLoadedConstructor {
    public static void main(String[] args) {
        Dogs dog1 = new Dogs("Jimmy");
        dog1.printDog();

        Dogs dog2 = new Dogs("Tommy", "BullDog");
        dog2.printDog();

        Dogs dog3 = new Dogs("Lucky", "German Sheperd",  35.0);
        dog3.printDog();


    }
}
