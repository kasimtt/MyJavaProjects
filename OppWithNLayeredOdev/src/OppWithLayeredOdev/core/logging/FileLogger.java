package OppWithLayeredOdev.core.logging;



public class FileLogger implements Logger {

	@Override
	public void log(String data) {
		// TODO Auto-generated method stub
		System.out.println("dosya ile loglandı " + data);
	}

}
