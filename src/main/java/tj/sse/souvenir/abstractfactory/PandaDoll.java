package tj.sse.souvenir.abstractfactory;

public class PandaDoll implements KungFuPanda {
    @Override
    public void create() {
        System.out.println("create a Kung Fu panda doll!");
    }
}
