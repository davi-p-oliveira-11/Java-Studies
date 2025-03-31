public record Person(String name, int age) {
   
   public Person {
    

   }

   public Person(String name) {
     this(name, 1);
   }

   public String getInfo() {
     return "Name: " + name + "age: " + age;
   }
}
