	package API_post_POJO;
	
	public class Aleternative_Arrays {
	
		public static void main(String[] args) {
			
			Aleternative_Arrays add = new Aleternative_Arrays();
			add.add_int(23,45,45,65);
			add.add_String("Faruq","Khalid","Arif");
		}
		
		
	public void add_int(int... a) { // ... means unlimited variable arguments.
		
		// instead of creating array, this is popular way to avoid array but 
		// doing the same thing.
			
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		}
	
	
	public void add_String(String... name) {
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);	
		}
		
		
	}
	
	}
