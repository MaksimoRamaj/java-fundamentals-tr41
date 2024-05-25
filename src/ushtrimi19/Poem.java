package ushtrimi19;
//polymorphism , encapsulation , inheritance , composition , abstraction
public class Poem {
    private Autor autor;
    private int stropheNumbers;

    public Poem() {
    }

    public Poem(Autor autor, int stropheNumbers) {
        this.autor = autor;
        this.stropheNumbers = stropheNumbers;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getStropheNumbers() {
        return stropheNumbers;
    }

    public void setStropheNumbers(int stropheNumbers) {
        this.stropheNumbers = stropheNumbers;
    }
}
