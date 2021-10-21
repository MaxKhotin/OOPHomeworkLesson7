package Task1;
//Создайте перечислительный тип (enum) Animals, содержащий конструктор, который должен принимать
//        целочисленное значение (возраст животного), и содержать перегруженный метод toString(), который
//        должен возвращать название экземпляра и возраст животного.
public class Main {
    enum Animals {
        RHINO(24),
        CAMEL(10),
        MONKEY(13),
        LION(22),
        CROCODILE(15);

        int age;

        Animals(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Animal: " + super.toString() + " Age: " + getAge();
        }

        public int getAge() {
            return age;
        }
    }

    public static void main(String[] args) {
        System.out.println(Animals.RHINO.toString());;
        System.out.println(Animals.CAMEL.toString());;
        System.out.println(Animals.MONKEY.toString());;
        System.out.println(Animals.LION.toString());;
        System.out.println(Animals.CROCODILE.toString());;
    }
}
