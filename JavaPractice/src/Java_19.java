class Userinfo {
  String name;

  // constructor
  Userinfo(String name) {
    this.name = name;
  }

  // this()

  Userinfo() {
    // this.name = "Me!";
    this("Me!");
  }

  void sayHi() {
    System.out.println("hi! " + this.name);
  }
}

public class Java_19 {

  public static void main(String[] args) {
    Userinfo tom;
    // tom = new User("Tom");
    tom = new Userinfo();
    System.out.println(tom.name);
    tom.sayHi();
  }

}