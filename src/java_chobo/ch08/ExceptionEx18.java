package java_chobo.ch08;

/**
 * @author surin
 * upgrade Ex16
 * 설치 중 예외 발생 시 예외처리
 */
public class ExceptionEx18 {

	public static void main(String[] args) {

		try {
			install();
		} catch (InstallException e) {
			System.err.println("error message : " + e.getMessage());
			e.printStackTrace();
		}

		System.out.println("설치 프로그램을 종료합니다.");

	} // end of main

	public static void install() throws InstallException {
		try {
			startInstall();
			copyFiles();
		} catch (SpaceException e) {
			InstallException ie = new InstallException("설치 중 예외가 발생했습니다. - space");
			ie.initCause(e);
			throw ie; // 던져주지 않으면 원인예외한 이유가 없음!
		} catch (MemoryException e) {
			InstallException ie = new InstallException("설치 중 예외가 발생했습니다. - memory");
			ie.initCause(e);
			throw ie; // 던져주지 않으면 원인예외한 이유가 없음!
		} /*finally {
			deleteTempFiles();
		}*/
	} // end of install

	private static void deleteTempFiles() {
		System.out.println("임시 파일을 삭제합니다.");
	} // end of deleteTempFiles

	private static void copyFiles() {
		System.out.println("파일을 복사합니다.");
	} // end of copyFiles

	private static void startInstall() throws SpaceException, MemoryException {

		if (!isEnoughSpace()) {
			throw new SpaceException("설치할 공간이 부족합니다.");
		}

		if (!isEnoughMemory()) {
			throw new MemoryException("메모리가 부족합니다.");
		}

	} // end of startInstall

	private static boolean isEnoughMemory() {
		return false;
	} // end of isEnoughMemory

	public static boolean isEnoughSpace() {
		return false;
	} // end of isEnoughSpace

} // end of class
