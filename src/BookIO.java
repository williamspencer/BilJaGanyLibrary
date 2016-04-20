
public class BookIO
{
    public static Book getBook(int index)
    {
        switch (index)
        {
            case 1:
                return new Book("genre", "title", "Author FN", "Author LN");
            default:
                return new Book("NO SUCH MOVIE", "","","");
        }
    }

}
