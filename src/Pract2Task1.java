public class Pract2Task1 {
    public static class Book {
        String Name;
        String Genre;
        String coverColour;
        String author;

        Book(String Name, String Genre, String coverColour, String author){
            this.Name=Name;
            this.Genre=Genre;
            this.coverColour=coverColour;
            this.author=author;
        }

        public String toString(){
            return Name+" "+Genre+" "+author+" "+coverColour;
        }


    }

    public static void main(String[]args){

        Book b1=new Book("Diff i Int Vich.","textbook","white","Bugrov,Nikol'ski");

        System.out.println(b1);

    }
}
