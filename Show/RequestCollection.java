package Show;

import java.util.ArrayList;
import java.util.List;

public class RequestCollection {
	public static List<Request> requests = new ArrayList<>();
	
	public static void addShow(Request req) {
		requests.add(req);
	}
	
	public static void removeShow(Request req) {
		if(requests.contains(req)) {
			requests.remove(req);
		}
	}
	
	public static void editShow(Request req, Request newReq) {
		if(requests.contains(req)) {
			requests.set(requests.indexOf(req), newReq);
		}
	}
}
