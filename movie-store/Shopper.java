public class Shopper {

    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.add(new ComedyMovie("Super Troopers"));
        cart.add(new ComedyMovie("Office Space"));
        cart.add(new DramaMovie("Fight Club"));
        System.out.printf("%-40s  %6s%n", "Movie", "Price");
        for (Movie movie: cart.getMovies()) {
            System.out.printf("%-40s $%6d%n", movie.getName(),
                movie.getPrice());
        }
        System.out.printf("%-40s $%6d%n", "Total:", cart.totalPrice());
    }
}
