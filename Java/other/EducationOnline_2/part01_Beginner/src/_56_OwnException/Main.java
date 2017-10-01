package _56_OwnException;

public class Main {

	public static void main(String[] args) {
		
		try {
			// вызов метода dbConnection(int r), к-ый кидает чекед AutorizationException
			// чем об€зывает заворачивать вызов в try-catch
			dbConnection(-1); // -1 нет соединени€, остальные соедин€ем
		} catch (AutorizationException e) {
			System.out.println("no connection");
			e.printStackTrace();
		} finally {
			System.out.println("Close all resources");
		}

	}
	
	// предупреждение throws AutorizationException ¬ызывающий об€зан обработать
	public static void dbConnection(int r) throws AutorizationException {
		if (r != -1) {
			System.out.println("Connect");
		} else {
			throw new AutorizationException("Connection failure");
		}
			
	}

}
