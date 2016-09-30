package Short_Assignment_1a;

public class Main {

	public static void main(String[] args) {
		
		//create new JavaBean object
		VideoStorage newVideo = new VideoStorage(600, 1080);
		
		//display calculation results straight to console
		System.out.println(newVideo.calcStorage());

	}

}