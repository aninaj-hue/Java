package animal;


public abstract class Leu implements AnimalCarnivor {

    @Override
    public void move() {
        System.out.println("move->Leu");

    }

    @Override
    public void eat() {
        System.out.println("eat->Leu");
    }

    @Override
    public void mananca_carne() {
        System.out.println("mananca_carne->Leu");
    }

    abstract void deUndeVine();

}