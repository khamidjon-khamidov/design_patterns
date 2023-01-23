package head_first_design_patterns.adapter.example2;

public class EnumerationIterator implements Iterator {
    Enumeration en;

    public EnumerationIterator(Enumeration en){
        this.en = en;
    }

    @Override
    public boolean hasNextElement() {
        return en.hasMoreElements();
    }

    @Override
    public Object nextElement() {
        return en.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
