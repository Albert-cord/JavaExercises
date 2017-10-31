package initialization;

class Persion {
    public void eat(Apple apple) {
        System.out.println("YUNMY");
    }
}

class Peeler {
    static Apple peel(Apple apple) {
        // remove peel
        return apple;
    }
}

class Apple {
    Apple getPeeled() {
        return Peeler.peel(this);
    }
}

public class PassingThis {
     public static void main(String[] args) {
        new Persion().eat(new Apple());
    }
}
