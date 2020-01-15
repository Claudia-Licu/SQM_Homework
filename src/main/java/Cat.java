import java.util.Arrays;

public class Cat {

    private String breed;
    private String color;
    private int noOfKittens;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) throws BreedException {
        if (breed.isEmpty() || breed == null || !breed.matches("[a-zA-Z]+")) {
            throw new BreedException();
        }
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) throws ColorException {
        if (color.isEmpty() || color == null || !Arrays.asList("white", "black", "gray", "brown").contains(color)) {
            throw new ColorException();
        }
        this.color = color;
    }

    public int getNoOfKittens() {
        return noOfKittens;
    }

    public void setNoOfKittens(int noOfKittens) throws NoOfKittensException {
        if (noOfKittens > 10) {
            throw new NoOfKittensException();
        }
        this.noOfKittens = noOfKittens;
    }
}
