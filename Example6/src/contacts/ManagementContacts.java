package contacts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class ManagementContacts {
	HashMap<String, Contact> table;
	public ManagementContacts() {
		table = new HashMap<>();
	}
	//a?adir contactos al hashMap
	public void addContact(Contact newcontact) {
		table.put(newcontact.getEmail(), newcontact);
	}
	/*public Contact searchContact2(String email) {
		return table.get(email);
	}*/
	public ArrayList<Contact> searchContact(String name) {
		ArrayList<Contact> result = new ArrayList<>();
		Collection<Contact> list =  table.values();
		for (Contact contact : list) {
			if (contact.getName().toLowerCase().contains(name.toLowerCase())) {
				result.add(contact);
			}
		}
		return result;
	}
	public Contact removeContact(String email) {
		return table.remove(email);
	}
	public void showContacts() {
		Collection<Contact> listContact = table.values();
		Integer number = 1;
		for (Contact contact : listContact) {
			System.out.println(number + ".-)" + contact.getName() 
			+ " Email: " + contact.getEmail() + " " 
			+ " Telefono: " + contact.getPhoneNumber() + " " 
			+ " Edad: " + contact.getAge());
			number++;
		}
 	}
}
