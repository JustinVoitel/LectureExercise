import java.util.ArrayList;
import java.util.Iterator;
/**
 * Write a description of class MovieDB here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MovieDB
{
   private ArrayList<Movie> movies;
   
   public MovieDB()
   {
       movies = new ArrayList<>();
       //adding some example Movies to test with
       addMovie("Stirb Langsam",1988,"Bruce Willis","Action");
       addMovie("Iam Legend",2005,"Will Smith","Action");
       addMovie("Split",2016,"Bruce Willis","Thriller");
   }
   

   public void addMovie(String Title, int Year, String MainChar, String Genre){
       Movie movie = new Movie(Title, Year,MainChar,Genre);
       movies.add(movie);
   }
   
   public void printAllMovies(){
       movies.stream()
        .forEach(movie -> movie.printMovie());
    }
    
    public void setAwkwardByTitle(String title){
        movies.stream()
        .filter(movie -> movie.getTitle() == title)
        .forEach(movie -> movie.setAwkward());
    }
    
    public void printMoviesByYear(int from, int to){
        movies.stream()
        .filter(movie -> movie.getYear()>= from && movie.getYear()<=to)
        .forEach(movie -> movie.printMovie());
    }
    
    public void deleteAllAwkwardMovies(){
        movies.stream()
        .filter(movie -> movie.getAwkward() == true)
        .forEach(movie -> deleteMovieByIndex(movies.indexOf(movie)));
    }
    
    public void deleteMovieByIndex(int index){
        for (Movie movie: movies){
        	if (movies.indexOf(movie)==index){
            	 movies.remove(movie);
            	 System.out.println(movie.getTitle() + " deleted!");
        	}
    	}
    }
}
