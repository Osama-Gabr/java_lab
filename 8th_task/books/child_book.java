public class child_book extends Book {
	
	//overriding the getter function in the Book class
	@Override
	double get (){
		return price*.3 ;
	}
}
