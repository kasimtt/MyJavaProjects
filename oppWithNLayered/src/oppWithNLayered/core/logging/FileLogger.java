package oppWithNLayered.core.logging;

public class FileLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println("dosyaya longlandı : " + data);
		
	}

}
