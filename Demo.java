public class Demo
{
     private MovieDB manager;
     
     public Demo()
    {
        manager = new MovieDB();
        manager.addMovie("Stirb Langsam",1988,"Bruce Willis","Action");
        manager.addMovie("Iam Legend",2007,"Will Smith","Action");
        manager.addMovie("Split",2016,"Bruce Willis","Thriller");
    }
    
    public void demo(){
        manager.printAllMovies();
    }
}