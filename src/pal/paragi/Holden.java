package pal.paragi;

public class Holden extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }
    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()h";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate()h";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> brake()h";
    }
}
