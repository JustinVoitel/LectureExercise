
/**
 * Write a description of class MovieDB here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MovieDB
{
   ArrayList<Movie> movies = new ArrayList<>();
   public void printWatchedYear(int year)
   {
       movies.stream()
       .filter(movie -> movie.getYear()==year)
       .filter(movie -> movie.getWatched())
       .forEach(movie -> System.out.println(movie));
       
   }
}
