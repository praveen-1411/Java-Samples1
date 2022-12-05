package ExceptionHandling;

public class Trycatch5 {
	
	static void readData() throws FileNotFoundException{
		FileReader file file new FileReader("");
		BufferedReader fp = new BufferedReader(file);
		throw nw FileNotFoundException();
		
	}
	public static void main(String[]args) {
		System.out.println("Begin");
		try {
			readData();
		}catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}
		System.out.println("end");
		}
	}

}
