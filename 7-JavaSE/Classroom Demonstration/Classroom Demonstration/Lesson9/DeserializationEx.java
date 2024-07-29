import java.io.*;
class DeserializationEx {
	public static void main(String[] args) {
		try {
			FileInputStream fos = new FileInputStream("C:\Users\reddirani.battuluri\Documents\Training\7-Java SE\Classroom Demonstration\Classroom Demonstration\Lesson9\Demo1234.txt");
		ObjectInputStream ois = new ObjectInputStream(fos);
		System.out.println(ois.readObject());
		} catch(Exception e) {
				e.printStackTrace();
		}
		}
		}