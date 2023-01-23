package head_first_design_patterns.adapter.example2;

public class IteratorEnumeration implements  Enumeration {
    Iterator it;

    public IteratorEnumeration(Iterator it){
        this.it = it;
    }

    @Override
    public boolean hasMoreElements() {
        return it.hasNextElement();
    }

    @Override
    public Object nextElement() {
        return it.nextElement();
    }
}
