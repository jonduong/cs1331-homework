public abstract class Movie {

    private String name;
    protected int price;

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
/*
    //@Override
    public String toString(Movie movie) {
        String thing = movie.getName();
        return thing;
    }

    //@Override
    public boolean equals(Movie movie) {
        return (this.toString() == movie.toString());
    }*/

    public abstract int getPrice();

}
