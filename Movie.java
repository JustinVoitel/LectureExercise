
/**
 * Write a description of class movie here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Movie
{
    // instance variables - replace the example below with your own
    private String title;
    private int year;
    private String mainChar;
    private String genre;
    private boolean watched=false;
    private boolean awkward = false;
    
    public Movie(String Title,int Year,String MainChar, String Genre)
    {
        this.title = Title;
        this.year = Year;
        this.mainChar = MainChar;
        this.genre = Genre;
    }
    
    public void printMovie()
    {
        System.out.println("Title: "+this.title+", Year: "+this.year);
    }
    
    public int getYear(){
        return year;
    }
    
    public String getTitle(){
        return title;
    }
    
    public boolean getAwkward(){
        return this.awkward;
    }
    
    public void setAwkward(){
        this.awkward = true;
    }
    
}
