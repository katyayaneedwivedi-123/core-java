package pack2;
class Book {
	int BookId;
	String BookTitle;
	String BookAuthor;
	Double BookPrice;
	Book(int BookId, String BookTitle, String BookAuthor, Double BookPrice){
		this.BookId = BookId;
		this.BookTitle = BookTitle;
		this.BookAuthor = BookAuthor;
		this.BookPrice = BookPrice;
	}
	@Override
	public String toString() {
		return "Id = " + BookId + "\n" + "Title = " + BookTitle + "\n" + "Author = " + BookAuthor + "\n" + "Price = " + BookPrice;
	}
}
public class K25 {
	public static void main(String[] args) {
		Book b = new Book(90, "How to Trained our mind ", "Dada", 600.99);
		Book b1 = new Book(45, "The love For Every People", "Katyayanee", 999.99);
		Book b2 = new Book(34, "How to Understand Human Psychology", "Washisht", 300.99);
		System.out.println(b);
		System.out.println(b1);
		System.out.println(b2);
	}
}
