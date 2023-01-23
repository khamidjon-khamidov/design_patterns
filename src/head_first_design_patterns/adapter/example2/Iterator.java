package head_first_design_patterns.adapter.example2;

public interface Iterator {

    public boolean hasNextElement();

    public Object nextElement();

    public void remove();
}
