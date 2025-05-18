package client;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class ClientResponseReceiver {
	private final ObjectInputStream in;

    public ClientResponseReceiver(ObjectInputStream in) {
        this.in = in;
    }

    public synchronized void getResponce() throws ClassNotFoundException, IOException {
    	String responce = (String) in.readObject();
    	//System.out.println(responce);
    	if (responce.startsWith("NextPage")) {
    		responce = responce.replaceFirst("NextPage ", "");
    		List<String> movies = List.of(responce.split("\\n"));
    		CollectionView.setMovieView(new ArrayList<>(movies));
    		for(String m: movies) {
    			System.out.println(m);
    		}
    	}
    	else {
    		System.out.println(responce);
    	}
    }
    
    public Object getData() throws ClassNotFoundException, IOException {
		Object data = (Object) in.readObject();
    	return data;
    }
}
