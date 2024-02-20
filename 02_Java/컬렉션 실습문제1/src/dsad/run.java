package dsad;

import java.util.ArrayList;
import java.util.List;

import com.hw1.model.dto.Friend.Friend;
import com.hw1.run.Run.Run;

public class run {
	
	public static void main(String[] args) {
		List<Friend> friendList = new ArrayList<Friend>();
		
		friendList.add(new Friend("짱구"));
		friendList.add(new Friend("철수"));
		friendList.add(new Friend("유리"));
		friendList.add(new Friend("훈이"));
		friendList.add(new Friend("맹구"));
		
		int random = (int)Math.floor(Math.random() * 4);
		
		friendList.get(random).pickLeader();
		
	}
	
}
