package client;


import java.util.ArrayList;
import java.util.List;


public class CollectionView {

	static private List<String> movieView = new ArrayList<String>();
	
	public CollectionView(ArrayList<String> movieView) {
		setMovieView(movieView);
		
	}

	static public List<String> getMovieView() {
		return movieView;
	}

	static public void setMovieView(ArrayList<String> movieView) {
		CollectionView.movieView = movieView;
	}

	
	/*
	
	@SuppressWarnings("rawtypes" )
	public static Comparator<Movie> getComporatorByField(String fieldName){
		return Comparator.comparing(movie ->{
			try {
			 PropertyDescriptor pd = new PropertyDescriptor(fieldName, Movie.class);
			 return (Comparable) pd.getReadMethod().invoke(movie);
			}
			catch(Exception e) {
				return null;
			}
		}, Comparator.nullsLast(Comparator.naturalOrder()));
		
	}
	
	public void sortByField(String field) {
		movieView.sort(getComporatorByField(field));
	}
	*/
}
