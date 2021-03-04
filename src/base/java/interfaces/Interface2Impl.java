package base.java.interfaces;

// Il faut redéfinir les methodes via Interfaces2 et ses parents InterfaceMain, InterfaceMain2
public class Interface2Impl implements Interface2 {
    @Override
    public String toPrint() {
        return "Interface2 implementation ...";
    }

    @Override
    public String mainMethod() {
        return "Interface2 implementation > It's my father's method ...";
    }

    @Override
    public String mainMethod2() {
        return "Interface2 implementation > It's my other father's method ...";
    }
}
