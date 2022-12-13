public class Book extends Product{

	//create the variables
	String category;
	//overriding the getter function in the abstract
	@Override
	double get (){
		return price*.5 ;
	}
}
