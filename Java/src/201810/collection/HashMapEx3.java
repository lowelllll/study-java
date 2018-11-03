package collection;

import java.util.*;
public class HashMapEx3 {
	static HashMap phoneBook = new HashMap();
	
	public static void main(String[] args) {
		addPhoneNo("친구","이자바","010-1111-2220");
		addPhoneNo("친구","박자바","010-1111-2252");
		addPhoneNo("선생","산자바","010-1111-2422");
		addPhoneNo("친구","수자바","010-1111-5222");
		addPhoneNo("회사","김자바","010-1141-2222");
		addPhoneNo("친구","최자바","010-1311-2222");
		addPhoneNo("영자바","010-1112-2222");
		
		printList();
	}
	
	static void addGroup(String groupName) {
		if(!phoneBook.containsKey(groupName))
			phoneBook.put(groupName, new HashMap());
	}
	
	static void addPhoneNo(String groupName, String name, String tel) {
		addGroup(groupName);
		HashMap group = (HashMap) phoneBook.get(groupName);
		group.put(tel, name);
	}
	
	static void addPhoneNo(String name, String tel) {
		addPhoneNo("기타",name,tel);
	}
	
	static void printList() {
		Set set = phoneBook.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry) it.next();
			
			Set subSet = ((HashMap)e.getValue()).entrySet();
			Iterator subIt = subSet.iterator();
			
			System.out.println("* "+e.getKey()+"["+subSet.size()+"]");
		
			while(subIt.hasNext()) {
				Map.Entry subE = (Map.Entry) subIt.next();
				String telNo = (String) subE.getKey();
				String name = (String) subE.getValue();
				System.out.println(name +" " +telNo);
			}
			System.out.println();
		}
	}

}
