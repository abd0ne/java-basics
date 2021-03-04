package ee.jakarta.interfaces;
// Il faut rédefinir les methodes via Interfaces1 et parent InterfaceMain
public class Interface1Impl implements Interface1 {

    @Override
    public String mainMethod() {
        return "Interface1 implementation >It's my father's method";
    }
}
