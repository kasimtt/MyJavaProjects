package OppWithLayeredOdev.core.logging;

public class DatabaseLogger implements Logger {

	@Override
	public void log(String data) {
		// TODO Auto-generated method stub
		System.out.println("veri tabanı ile loglandı " + data);
	}

}